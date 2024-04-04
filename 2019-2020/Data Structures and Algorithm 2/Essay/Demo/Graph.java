import java.util.*;

// class to represent a graph object
class Node {
	int vertex, weight;

	public Node(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
}

// Data structure to store graph edges
class Edge {
	
	int source, dest, weight;

	public Edge(int source, int dest, int weight) {
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}
}

class Graph {
	// A List of Lists to represent an adjacency list
	List<List<Edge>> adjList = null;

	// Constructor
	public Graph(List<Edge> edges, int N) {
		
		adjList = new ArrayList<>(N);

		for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}

		// add edges to the undirected graph
		for (Edge edge: edges) {
			adjList.get(edge.source).add(edge);
		}
	}
}

