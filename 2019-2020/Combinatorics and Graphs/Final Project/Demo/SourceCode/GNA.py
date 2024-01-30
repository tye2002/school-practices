import networkx as net
import matplotlib.pyplot as plot

# load the graph
Graph = net.karate_club_graph()
plot.figure(figsize =(10, 20)) 
net.draw_networkx(Graph, with_labels = True)
plot.show()


def edge_to_remove(G):
    edge_dict = net.edge_betweenness_centrality(G)
    edge = ()

    # extract the edge with highest edge betweenness centrality score
    for key, value in sorted(edge_dict.items(), key=lambda item: item[1], reverse = True):
        edge = key
        break

    return edge
  

def girvan_newman(G):
	# find number of connected components
	C = net.connected_components(G)
	L = net.number_connected_components(G)

	while(L == 1):
		G.remove_edge(edge_to_remove(G)[0], edge_to_remove(G)[1])
		C = net.connected_components(G)
		L = net.number_connected_components(G)

	return C

def GNA(G):
    file = open("communities.txt","w")

    # find communities in the graph
    C = girvan_newman(G.copy())
    
    # find the nodes forming the communities
    communities = []

    for i in C:
        communities.append(list(i))
    
    file.write("The number of communities are " + str(len(communities)) + "\n")
    file.write('\n'.join([''.join(str(i)) for i in communities]))
    file.close()
    
    # Draw the communities
    color_map = []
    for node in G:
        if node in communities[0]:
            color_map.append('yellow')
        else: 
            color_map.append('red')  

    net.draw(G, node_color=color_map, with_labels=True)
    plot.show()
    
GNA(Graph)