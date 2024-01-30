from collections import defaultdict


class Graph(object):

	def __init__(self, graph_dict=None):
		if graph_dict == None:
			graph_dict = defaultdict(list)
		self.d = graph_dict

	def vertices(self):
		return list(self.d.keys())

	def vertices_number(self):
		return len(self.vertices())

	def edges(self):
		return self.__generate_edges()

	def edges_number(self):
		return len(self.__generate_edges())

	def __generate_edges(self):
		edges = []
		for vertex in self.d:
			for neighbour in self.d[vertex]:
				if {neighbour, vertex} not in edges:
					edges.append((vertex, neighbour))
		return edges

	def add_edge (self, vertex1, vertex2):
		if vertex2 != '_':
			if vertex2 not in self.d[vertex1]:
				self.d[vertex1].append(vertex2)
			else:
				if vertex1 not in self.d.keys():
					self.d[vertex1] = []
					
	def graph_from_file(self, filename):
		edges = open(filename, 'r').read().splitlines()

		for edge in edges:
			vertex1, vertex2 = edge.split(' ')
			self.add_edge(vertex1,vertex2)
			
	# A function used by DFS
	def backward (self, v, visited):
		visited[v] = True
		temp = []
		for i in self.d[v]:
			if not visited[i]:
				temp = self.backward(i,visited)
		return [v] + temp
				
	def forward (self, v, visited, stack):
		visited[v] = True
		for i in self.d[v]:
			if not visited[i]:
				self.forward(i, visited, stack)
		stack = stack.append(v)
		
	def reverse_graph(self):
		g = Graph()
		edges = self.__generate_edges()
		for edge in edges:
			g.add_edge(edge[1],edge[0])
		return g 
		
	def strongly_connected_components(self):
		stack = []
		visited = defaultdict(lambda : False)
		
		for i in self.vertices():
			if not visited[i]:
				self.forward(i, visited, stack)
				
		gr = self.reverse_graph()
		
		visited = defaultdict(lambda : False)
	
		result = []
		while stack:
			i = stack.pop()
			if not visited[i]:
				result.append(gr.backward(i,visited))
		return result
		
graph = Graph()
graph.graph_from_file('graph_lab8.txt')
print("Strongly Connected conponents:")
print(graph.strongly_connected_components())




