import matplotlib.pyplot as plot
import networkx as net 

Graph = net.karate_club_graph() 

def degree_centrality(G):
    file = open("degree.txt","w")
    centrality={}
    nodes=1.0/(len(G)-1.0)
    centrality=dict((n,d * nodes) for n,d in dict(G.degree()).items())
    file.write('\n'.join('{} {}'.format(k,v) for k,v in centrality.items()))
    file.close()
   

# Display network
plot.figure(figsize =(10, 20)) 
net.draw_networkx(Graph, with_labels = True)
plot.show()

# Graph is the Karate Club Graph 
degree_centrality (Graph) 




