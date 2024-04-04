import java.io.*;
import java.util.*;
public class PrimMST {

    static class Graph{
        int vertices;
        int matrix[][];

        public Graph(int vertex) {
            this.vertices = vertex;
            matrix = new int[vertex][vertex];
        }

        public void addEdge(int source, int destination, int weight) {
            //add edge
            matrix[source][destination]=weight;

            //add back edge for undirected graph
            matrix[destination][source] = weight;
        }

        //get the vertex with minimum key which is not included in MST
        int getMinimumVertex(boolean [] mst, int [] key){
            int minKey = Integer.MAX_VALUE;
            int vertex = -1;
            for (int i = 0; i <vertices ; i++) {
                if(mst[i]==false && minKey>=key[i]){
                    minKey = key[i];
                    vertex = i;
                }
            }
            return vertex;
        }

        class ResultSet{
            // will store the vertex(parent) from which the current vertex will reached
            int parent;
            // will store the weight for printing the MST weight
            int weight;
        }

        public void primMST(int s){
            boolean[] mst = new boolean[vertices];
            ResultSet[] resultSet = new ResultSet[vertices];
            int [] key = new int[vertices];

            //Initialize all the keys to infinity and
            //initialize resultSet for all the vertices
            for (int i = 0; i <vertices ; i++) {
                key[i] = Integer.MAX_VALUE;
                resultSet[i] = new ResultSet();
            }

            key[0] = s;
            resultSet[s] = new ResultSet();
            resultSet[s].parent = s-1;

            //create MST
            for (int i = 0; i <vertices ; i++) {

                //get the vertex with the minimum key
                int vertex = getMinimumVertex(mst,key);

                //include this vertex in MST
                mst[vertex] = true;

                //iterate through all the adjacent vertices of above vertex and update the keys
                for (int j = 0; j <vertices ; j++) {
                    //check of the edge
                    if(matrix[vertex][j]>0){
                        //check if this vertex 'j' already in mst and
                        //if no then check if key needs an update or not
                        if(mst[j]==false && matrix[vertex][j]<key[j]){
                            //update the key
                            key[j] = matrix[vertex][j];
                            //update the result set
                            resultSet[j].parent = vertex;
                            resultSet[j].weight = key[j];
                        }
                    }
                }
            }
            //print mst
            printMST(resultSet);
        }

        public void printMST(ResultSet[] resultSet){
            int total_min_weight = 0;
            System.out.println("Minimum Spanning Tree: ");
            for (int i = 1; i <vertices ; i++) {
				int d = (edge.destination/2) ;
                System.out.println("Edge: " + i + " - " + resultSet[i].parent +
                        " key: " + resultSet[i].weight);
                total_min_weight += resultSet[i].weight;
            }
            System.out.println("Total minimum key: " + total_min_weight);
        }
    }

    public static void main(String[] args) {
		Graph graph = null;
        try {
			File file = new File("C:\\Users\\ThienYHuynhLe\\Desktop\\AM.txt");
			Scanner myReader = new Scanner(file);
			
			int line = 0;
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
						int weight = Character.getNumericValue(data.charAt(i));
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
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Input start vertex: ");
			int start_vertex = keyboard.nextInt();
			graph.primMST(start_vertex);
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}
}