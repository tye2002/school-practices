import functools
import networkx as net
import matplotlib.pyplot as plot

Graph = net.karate_club_graph() 

def closeness_centrality(G, u=None, distance=None, normalized=True):
    file = open("closeness.txt","w")

    if distance is not None:
        # use Dijkstra's algorithm with specified attribute as edge weight 
        path_length = functools.partial(net.single_source_dijkstra_path_length, weight=distance)
    else:
        path_length = net.single_source_shortest_path_length

    if u is None:
        nodes = G.nodes()
    else:
        nodes = [u]
    closeness = {}
    for n in nodes:
        sp = path_length(G,n)
        totsp = sum(sp.values())
        if totsp > 0.0 and len(G) > 1:
            closeness[n] = (len(sp)-1.0) / totsp
            # normalize to number of nodes-1 in connected part
            if normalized:
                s = (len(sp)-1.0) / ( len(G) - 1 )
                closeness[n] *= s
        else:
            closeness[n] = 0.0
    if u is not None:
        return closeness[u]
    else:
        file.write('\n'.join('{} {}'.format(k,v) for k,v in closeness.items()))
        file.close()
        
# Display network
plot.figure(figsize =(10, 20)) 
net.draw_networkx(Graph, with_labels = True)
plot.show()

# Graph is the Karate Club Graph 
closeness_centrality (Graph)
