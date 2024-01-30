import matplotlib.pyplot as plot
import networkx as net 
from heapq import heappush, heappop
from itertools import count
import random

Graph = net.karate_club_graph() 

def betweenness_centrality (G, n=None, normalized=True, weight=None, endpoints=False, seed=None):
    file = open("betweenness.txt","w")
    betweenness = dict.fromkeys(G, 0.0)  # b[v]=0 for v in G
    if n is None:
        nodes = G
    else:
        random.seed(seed)
        nodes = random.sample(G.nodes(), n)
    for k in nodes:
        # single source shortest paths
        if weight is None:  # use BFS
            S, P, sigma = shortest_path(G, k)
        else:  # use Dijkstra's algorithm
            S, P, sigma = dijkstra_path(G, k, weight)
        # accumulation
        if endpoints:
            betweenness = endpoints(betweenness, S, P, sigma, k)
        else:
            betweenness = basic(betweenness, S, P, sigma, k)
    # rescaling
    betweenness = _rescale(betweenness, len(G), normalized=normalized, directed=G.is_directed(),n=n)
    file.write('\n'.join('{} {}'.format(k,v) for k,v in betweenness.items()))
    file.close()

# helpers for betweenness centrality

def shortest_path(G, k):
    S = []
    P = {}
    for v in G:
        P[v] = []
    sigma = dict.fromkeys(G, 0.0)    # sigma[v]=0 for v in G
    D = {}
    sigma[k] = 1.0
    D[k] = 0
    Q = [k]
    while Q:   # use BFS to find shortest paths
        v = Q.pop(0)
        S.append(v)
        Dv = D[v]
        sigmav = sigma[v]
        for w in G[v]:
            if w not in D:
                Q.append(w)
                D[w] = Dv + 1
            if D[w] == Dv + 1:   # this is a shortest path, count paths
                sigma[w] += sigmav
                P[w].append(v)  # predecessors
    return S, P, sigma


def dijkstra_path(G, k, weight='weight'):
    # modified from Eppstein
    S = []
    P = {}
    for v in G:
        P[v] = []
    sigma = dict.fromkeys(G, 0.0)    # sigma[v]=0 for v in G
    D = {}
    sigma[k] = 1.0
    push = heappush
    pop = heappop
    seen = {k: 0}
    c = count()
    Q = []   # use Q as heap with (distance,node id) tuples
    push(Q, (0, next(c), k, k))
    while Q:
        (dist, _, pred, v) = pop(Q)
        if v in D:
            continue  # already searched this node.
        sigma[v] += sigma[pred]  # count paths
        S.append(v)
        D[v] = dist
        for w, edgedata in G[v].items():
            vw_dist = dist + edgedata.get(weight, 1)
            if w not in D and (w not in seen or vw_dist < seen[w]):
                seen[w] = vw_dist
                push(Q, (vw_dist, next(c), v, w))
                sigma[w] = 0.0
                P[w] = [v]
            elif vw_dist == seen[w]:  # handle equal paths
                sigma[w] += sigma[v]
                P[w].append(v)
    return S, P, sigma


def basic(betweenness, S, P, sigma, k):
    delta = dict.fromkeys(S, 0)
    while S:
        w = S.pop()
        coeff = (1.0 + delta[w]) / sigma[w]
        for v in P[w]:
            delta[v] += sigma[v] * coeff
        if w != k:
            betweenness[w] += delta[w]
    return betweenness


def endpoints(betweenness, S, P, sigma, s):
    betweenness[s] += len(S) - 1
    delta = dict.fromkeys(S, 0)
    while S:
        w = S.pop()
        coeff = (1.0 + delta[w]) / sigma[w]
        for v in P[w]:
            delta[v] += sigma[v] * coeff
        if w != k:
            betweenness[w] += delta[w] + 1
    return betweenness

def _rescale(betweenness, N, normalized, directed=False, n=None):
    if normalized is True:
        if N <= 2:
            scale = None  # no normalization b=0 for all nodes
        else:
            scale = 1.0 / ((N - 1) * (N - 2))
    else:  # rescale by 2 for undirected graphs
        if not directed:
            scale = 1.0 / 2.0
        else:
            scale = None
    if scale is not None:
        if n is not None:
            scale = scale * N / n
        for v in betweenness:
            betweenness[v] *= scale
    return betweenness

# Display network
plot.figure(figsize =(10, 20)) 
net.draw_networkx(Graph, with_labels = True) 
plot.show()

# Graph is the Karate Club Graph 
betweenness_centrality (Graph)
