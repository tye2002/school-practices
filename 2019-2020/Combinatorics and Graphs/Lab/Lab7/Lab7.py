""" A Python Class
A simple Python graph class, demonstrating the essential
facts of graphs.
"""
from collections import defaultdict


class Graph(object):

	def __init__(self, graph_dict=None):
		""" initializes a graph object
			If no dictionary or None is given, an empty dictionary will be used
		"""
		if graph_dict == None:
			graph_dict = defaultdict(list)
		self.d = graph_dict

	def vertices(self):
		""" returns the vertices of a graph """
		return list(self.d.keys())

	def vertices_number(self):
		return len(self.vertices())

	def edges(self):
		""" returns the edges of a graph """
		return self.__generate_edges()

	def edges_number(self):
		return len(self.__generate_edges())

	def __generate_edges(self):
		""" Function generates the edges of the
			graph "graph". Edges are represented as sets
			with two vertices
		"""
		edges = []
		for vertex in self.d:
			for neighbour in self.d[vertex]:
				if {neighbour, vertex} not in edges:
					edges.append({vertex, neighbour})
		return edges


	def graph_from_file(self, filename):
		""" assumes that edge is of type set, tuple or list
		"""
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


	def find_isolated_vertices(self):
		""" returns a list of isolated vertices. """
		graph = self.d
		isolated = []
		for vertex in graph:
			if not graph[vertex]:
				isolated += [vertex]
		return isolated

	def vertex_degree(self, vertex):
		""" The degree of a vertex is the number of edges connecting
			it, i.e. the number of adjacent vertices. Loops are counted
			double, i.e. every occurence of vertex in the list
			of adjacent vertices. """
		adj_vertices = self.d[vertex]
		degree = len(adj_vertices) + adj_vertices.count(vertex)
		return degree

	def degree_sequence(self):
		""" calculates the degree sequence """
		seq = {}
		for vertex in self.d:
			seq[vertex] = self.vertex_degree(vertex)
		return seq

	def BFS(self, start_v, visited):
		Q = []
		sequence = []
		Q.append(start_v)
		while len(Q) > 0:
			v = Q.pop(0)
			sequence.append(v)
			visited[v] = True
			for w in self.d[v]:
				if w not in sequence:
					Q.append(w)
		return sequence, visited

	def bfs_components(self):
		components = []
		visited = defaultdict(lambda: False)
		for v in self.vertices():
			if not visited[v]:
				sequence, visited = self.BFS(v, visited)
				components.append(sequence)
		return components

	def DFS(self, start_v, visited):
		S = []
		sequence = []
		S.append(start_v)
		while len(S) > 0:
			v = S.pop(0)
			sequence.append(v)
			visited[v] = True
			for w in self.d[v]:
				if w not in sequence:
					S.append(w)		
		return sequence, visited

	def dfs_components(self):
		components = []
		visited = defaultdict(lambda: False)
		for v in self.vertices():
			if not visited[v]:
				sequence, visited = self.DFS(v, visited)
				components.append(sequence)
		return components


graph = Graph()
graph.graph_from_file('graph_lab7.txt')
print("Connected components:")
print("BFS:")
print(graph.bfs_components())
print("DFS:")
print(graph.dfs_components())


