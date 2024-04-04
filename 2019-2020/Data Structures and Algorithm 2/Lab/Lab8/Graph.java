import java.io.*;
import java.util.*;

public class Graph{	
	
	private static boolean adjMatrix[][];
    private static int numVertices;
 
    public Graph(int numVertices) {
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
    }
 
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
    }
 
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
    }
 
    public boolean isEdge(int i, int j) {
        return adjMatrix[i][j];
    }
	
	public void enumerate_vertex(int i){
		System.out.print("Vertex " + (i + 1) + " is connected to:");
		for(Integer v : neighborVertices(i)){
			System.out.print((v + 1) + " ");
		}
    }
	
	public static List<Integer> neighborVertices(int i){
		List<Integer> result = new ArrayList();
		for (int j = 0; j < numVertices ; j++) {
			if(adjMatrix[i][j]== true){
				result.add(j);
			}
		}
		return result;
    }
	
	private static List<Integer> visited = new ArrayList();
	
	private static void DFS(int sourceVertex){
		visited.add(sourceVertex);
		for(Integer v : neighborVertices(sourceVertex)){
			if(!visited.contains(v)){
				DFS(v);
			}
		}
	}
	
	public void printDFS(int sourceVertex){
		visited.clear();
		System.out.print("DFS traversal from Vertex " + (sourceVertex)+": ");
		DFS(sourceVertex-1);
		for(Integer v : visited){
			System.out.print((v+1) + " ");
		}
	}
	
	private static void BFS(int sourceVertex){
		
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visit = new boolean[numVertices];
		
		visited.add(sourceVertex);
		
		for (Integer v : neighborVertices(sourceVertex)){
			queue.add(v);
		}
		visit[sourceVertex]=true;		

		while(!queue.isEmpty()){
			int currVertex = queue.remove();
			visited.add(currVertex);
			visit[currVertex]= true;
			
			for (Integer v : neighborVertices(currVertex))
			{
				if (visit[v]==false){
					queue.add(v);
				}
			}
		}
	}

	public void printBFS(int sourceVertex){
		visited.clear();
		System.out.print("BFS traversal from Vertex " + (sourceVertex)+": ");
		BFS(sourceVertex-1);
		for(Integer v : visited){
			System.out.print((v+1) + " ");
		}
	}

	public boolean isReachable(int sourceVertex, int destiVertex){
		DFS(sourceVertex-1);
		for(Integer v : visited){
			if (v == destiVertex-1)
				return true;

		}
		return false;
	}
	
	public void print() {
		System.out.println("UNDIRECTED GRAPH");
		System.out.print("Vertices:\n");
		for (int i=0;i<numVertices;i++){
			for (int j=i+1; j<numVertices; j++){
				if (adjMatrix[i][j]== true && j>i){
					int u = i+1;
					int v = j+1;
					System.out.print(u+" - "+v+"\n");
				}
			}
		}		 
    }
	
	public static void main(String[] args){
		
		Graph g = null;
		
		try {
			File file = new File("C<link to AM.txt file>");
			Scanner myReader = new Scanner(file);
			
			int currentLine = 0;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				if(g == null){
					List<Integer> firstLine = new ArrayList();
					int count = 0;
					for(int i = 0; i < data.length(); i++){
						if(data.charAt(i) != ' '){
							if(data.charAt(i) == '1'){
								firstLine.add(count);
							}
							count++;
						}
					}
					g = new Graph(count);
					for(Integer v : firstLine){
						g.addEdge(currentLine, v);
					}
				}else{
					int count = 0;
					for(int i = 0; i < data.length(); i++){
						if(data.charAt(i) != ' '){
							if(data.charAt(i) == '1'){
								g.addEdge(currentLine, count);
							}
							count++;
						}
					}
				}
				currentLine++;
			}
			
			myReader.close();
			
			Scanner keyboard = new Scanner(System.in);
			
			g.print();
			System.out.println("Input starting vertex for DFS: ");
			int start_vertex1 = keyboard.nextInt();
			g.printDFS(start_vertex1);
			System.out.println("\nInput starting vertex for BFS: ");
			int start_vertex2 = keyboard.nextInt();
			g.printBFS(start_vertex2);
			System.out.println("\nInput source vertex and destinated vertex : ");
			int source_vertex = keyboard.nextInt();
			int desti_vertex = keyboard.nextInt();
			System.out.println(g.isReachable (source_vertex, desti_vertex));

			} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}	
	}
}
