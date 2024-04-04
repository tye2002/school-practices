import java.util.*;
import java.io.*;
import javax.swing.*;

public class Dijkstra
{
	public static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static ArrayList<String> path = new ArrayList<String>();
	
	public static void printRoute()
	{
		GenerateAL a = new GenerateAL();
		for (int i = 0; i< arr.size();i++){
			for ( Map.Entry<String,Integer> entry : a.reference_name.entrySet()) {
				if (entry.getValue() == arr.get(i)){
					path.add("Go to:");
					path.add(entry.getKey());
				}
			}
		}
	}
	
	private static void Route(int prev[], int i)
	{
		if (i <= 0)
			return;

		Route(prev, prev[i]);
		arr.add(i);
	}

	// Run Dijkstra's algorithm on given graph
	public static void shortestPath(Graph graph, int source, int N, int dest)
	{
		// create min heap and push source node having distance 0
		PriorityQueue<Node> minHeap = new PriorityQueue<>((lhs, rhs) -> lhs.weight - rhs.weight);

		minHeap.add(new Node(source, 0));

		// set infinite distance from source to v initially
		List<Integer> dist = new ArrayList<>(Collections.nCopies(N, Integer.MAX_VALUE));

		// distance from source to itself is zero
		dist.set(source, 0);

		// boolean array to track vertices for which minimum
		// cost is already found
		boolean[] done = new boolean[N];
		done[0] = true;

		// stores predecessor of a vertex (to print path)
		int prev[] = new int[N];
		prev[0] = -1;

		// run till minHeap is not empty
		while (!minHeap.isEmpty())
		{
			// Remove and return best vertex
			Node node = minHeap.poll();

			// get vertex number
			int u = node.vertex;

			// do for each neighbor v of u
			for (Edge edge: graph.adjList.get(u))
			{
				int v = edge.dest;
				int weight = edge.weight;

				// Relaxation step
				if (!done[v] && (dist.get(u) + weight) < dist.get(v))
				{
					dist.set(v, dist.get(u) + weight);
					prev[v] = u;
					minHeap.add(new Node(v, dist.get(v)));
				}
			}

			// marked vertex u as done so it will not get picked up again
			done[u] = true;
		}
		
		for (int i = 1; i < N; ++i)
		{
			if (i == dest){
				Route(prev, dest);
				printRoute();
			}
		}
	}
	
	private static void err(int code) {
      System.exit(code);
	}
	
	public static void Graph_from_File(int source, int dest)
	{
		int V = 0;
		List<Edge> edges = new ArrayList<Edge>();
		Scanner sc = null; // compiler wants
		int num1 = 0, num2 = 0, len = 0;
		try {
			sc = new Scanner(new File("AL.txt")); // file
		} catch (Exception exception ) { err(1); }
		if (sc.hasNextInt())
			V = sc.nextInt();
		else err(2);
		// get vertices = num of vertices
		while (sc.hasNextInt()) {
			num1 = sc.nextInt();
			if (sc.hasNextInt())
				num2 = sc.nextInt();
			else err(2);
			if (sc.hasNextInt())
				len = sc.nextInt();
			else err(3);
			
			edges.add(new Edge(num1,num2,len));
			edges.add(new Edge(num2,num1,len));
		}
		Graph graph = new Graph(edges, V);
		sc.close();
		
		shortestPath(graph, source, V, dest);
	}
	
}