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
					edges.append({vertex, neighbour})
		return edges


	def graph_from_file(self, filename):
		
		edges = open(filename, 'r').read().splitlines()

		for edge in edges:
			vertex1, vertex2 = edge.split(' ')
			if vertex2 != '_':
				if vertex2 not in self.d[vertex1]:
					self.d[vertex1].append(vertex2)
				if vertex1 not in self.d[vertex2]:
					self.d[vertex2].append(vertex1)
			else:
				if vertex1 not in self.d.keys():
					self.d[vertex1] = []
	
	def color (self, vertex, vertices_colors):
		p = 1
		neighbour_colors = [vertices_colors[i] for i in self.d[vertex]]
		found = False
		while p < self.vertices_number() and not found:
			if p not in neighbour_colors:
				vertices_colors[vertex] = p
				found = True
			p+=1
		
	def colorgraph(self):
		vertices_colors = defaultdict(int)
		for vertex in self.vertices():
			self.color(vertex, vertices_colors)
		return dict(vertices_colors)
		
	
graph = Graph()
graph.graph_from_file('graph_lab10.txt')
print("Graph Coloring: ", end = ' ')
print(graph.colorgraph())



