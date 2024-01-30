from collections import defaultdict 

# Class to represent a graph 
class Graph(object):

	def __init__(self, graph_dict=None):
		# Initializes a graph object
		# If no dictionary or None is given, an empty dictionary will be used
		
		if graph_dict == None:
			graph_dict = defaultdict(defaultdict)
		self.d = graph_dict

	def vertices(self):
		# Returns the vertices of a graph
		return list(self.d.keys())

	def vertices_number(self):
		return len(self.vertices())

	def edges(self):
		# Returns the edges of a graph
		return self.__generate_edges()

	def edges_number(self):
		return len(self.__generate_edges())

	def __generate_edges(self):
		# Function generates the edges of the graph "graph". 
		# Edges are represented as sets with two vertices
		
		edges = []
		d = self.d
		for vertex in self.d:
			for neighbour in self.d[vertex].keys():
				forward_edge = (d[vertex][neighbour],vertex, neighbour)
				backward_edge = (d[vertex][neighbour],neighbour, vertex)
				if (forward_edge not in edges) and (backward_edge not in edges):
					edges.append(forward_edge)
		return edges


	def graph_from_file(self, filename):
		# Assumes that edge is of type set, tuple or list
		
		edges = open(filename, 'r').read().splitlines()

		for edge in edges:
			weight, vertex1, vertex2 = edge.split(' ')
			if vertex2 not in self.d[vertex1].keys():
				self.d[vertex1][vertex2] = int(weight)
			if vertex1 not in self.d[vertex2]:
				self.d[vertex2][vertex1] = int(weight)
	
	def find(self, parent,i):
		if parent[i]==i:
			return i
		return self.find(parent,parent[i])

	# A function that does union of two sets of x and y 
	# (uses union by rank) 
	def union(self, parent, rank, x, y): 
		xroot = self.find(parent, x) 
		yroot = self.find(parent, y) 

		# Attach smaller rank tree under root of high rank tree (Union by Rank) 
		if rank[xroot] < rank[yroot]: 
			parent[xroot] = yroot 
		elif rank[xroot] > rank[yroot]: 
			parent[yroot] = xroot 

		# If ranks are same, then make one as root and increment its rank by one 
		else : 
			parent[yroot] = xroot 
			rank[xroot] += 1

	# The main function to construct MST using Kruskal's 
		# algorithm 
	def KruskalMST(self): 

		result =[] #This will store the resultant MST 

		i = 0 # An index variable, used for sorted edges 
		e = 0 # An index variable, used for result[] 

			# Step 1: Sort all the edges in non-decreasing 
				# order of their 
				# weight. If we are not allowed to change the 
				# given graph, we can create a copy of graph 
		edges = sorted(self.__generate_edges()) 

		parent = defaultdict (str) 
		rank = defaultdict (int) 

		for vertex in self.vertices(): 
			parent[vertex]= vertex
			
	
		# Number of edges to be taken is equal to V-1 
		nvertices = self.vertices_number()
		while len (result) <nvertices - 1:

			# Step 2: Pick the smallest edge and increment 
					# the index for next iteration 
			u,v,w = edges[i] 
			i = i + 1
			x = self.find(parent, u) 
			y = self.find(parent ,v) 

			# If including this edge does't cause cycle, 
						# include it in result and increment the index 
						# of result for next edge 
			if x != y: 
				result.append([w,u,v]) 
				self.union(parent, rank, x, y)			 
			# Else discard the edge 
		return result

# Driver code 
graph = Graph()
graph.graph_from_file('graph_lab9.txt')
print (graph.d)
print("MST: ")
print(graph.KruskalMST())

