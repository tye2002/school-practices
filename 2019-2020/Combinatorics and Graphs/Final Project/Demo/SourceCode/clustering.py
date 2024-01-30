import matplotlib.pyplot as plot
import networkx as net 
import random

Graph = net.karate_club_graph() 

def clustering_node(G,v):
    neighbors = G[v].keys()
    if len(neighbors) == 1: return -1.0
    links = 0
    for w in neighbors:
        for u in neighbors:
            if u in G[w]: links += 0.5
    clustering_node = 2.0*links/(len(neighbors)*(len(neighbors)-1))
    return clustering_node

def clustering_coefficient(G,v=None):
    file = open("clustering.txt","w")
    clustering ={}
    nodes = G
    for k in nodes:
        if v is None:
            clustering[k]=clustering_node(G,k)
        else:
            return clustering_node(G,v)
            
    file.write('\n'.join('{} {}'.format(k,v) for k,v in clustering.items()))
    file.close()
    
# Display network
plot.figure(figsize =(10, 20)) 
net.draw_networkx(Graph, with_labels = True)
plot.show()

# Graph is the Karate Club Graph 
clustering_coefficient(Graph)



