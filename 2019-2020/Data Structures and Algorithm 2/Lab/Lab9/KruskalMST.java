import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.*;
import java.util.*;

public class KruskalMST {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
		int vertices;
		ArrayList<Edge> allEdges = new ArrayList<>();

		Graph(int vertices) {
			this.vertices = vertices;
		}

		public void addEdge(int source, int destination, int weight) {
			Edge edge = new Edge(source, destination, weight);
			allEdges.add(edge); //add to total edges
		}
					
		public void kruskalMST(){
			PriorityQueue<Edge> pq = new PriorityQueue<>(allEdges.size(), Comparator.comparingInt(o -> o.weight));

			//add all the edges to priority queue
			//sort the edges on weights
			for (int i = 0; i < allEdges.size() ; i++) {
				pq.add(allEdges.get(i));
			}

				//create a parent []
			int [] parent = new int[vertices];

				//makeset
			makeSet(parent);

			ArrayList<Edge> mst = new ArrayList<>();

				//process vertices - 1 edges
			int index = 0;
			while(index < vertices-1){
				Edge edge = pq.remove();
				//check if adding this edge creates a cycle
				int x_set = find(parent, edge.source);
				int y_set = find(parent, edge.destination);

				if(x_set==y_set){
					//ignore, will create cycle
				}else {
					//add it to our final result
					mst.add(edge);
					union(parent,x_set,y_set);
				}
				index++;
			}
			//print MST
			System.out.println("Minimum Spanning Tree: ");
			printGraph(mst);
		}			

		public void makeSet(int [] parent){
			//Make set- creating a new element with a parent pointer to itself.
			for (int i = 0; i <vertices ; i++) {
				parent[i] = i;
			}
		}

		public int find(int [] parent, int vertex){
			//chain of parent pointers from x upwards through the tree
			// until an element is reached whose parent is itself
			if(parent[vertex]!=vertex)
				return find(parent, parent[vertex]);;
			return vertex;
		}

		public void union(int [] parent, int x, int y){
			int x_set_parent = find(parent, x);
			int y_set_parent = find(parent, y);
			//make x as parent of y
			parent[y_set_parent] = x_set_parent;
		}
	
		public void printGraph(ArrayList<Edge> edgeList){
			for (int i = 0; i <edgeList.size() ; i++) {
			Edge edge = edgeList.get(i);
			int d = (edge.destination/2) ;
			System.out.println("Edge-" + i + " source: " + edge.source +
					" destination: " + d +
					" weight: " + edge.weight);
			}
		}
	}
		
	public static void main(String[] args) {
		Graph graph = null;
		try {
			File file = new File("C:\\Users\\ThienYHuynhLe\\Desktop\\AM.txt");
			Scanner myReader = new Scanner(file);
			
			int line = 0;
			int weight = 0;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if (graph==null){					
					int count = 0;
					for(int i = 0; i < data.length(); i++){
						count++;
					}				
					graph = new Graph(count);
					
				}
				else {
					for(int i = 0; i < data.length(); i++){
						weight = Character.getNumericValue(data.charAt(i));
						if(data.charAt(i) != ' '){
							if(data.charAt(i) != '0'){
								graph.addEdge(line,i,weight);
							}
						}
					}
				}
				line++;
			}
			myReader.close();
			
			graph.kruskalMST();
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}
}	