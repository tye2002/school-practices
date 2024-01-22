#Ex1
import numpy
def mPlus (A,B):	
	for i in range(len(A)):
		for j in range(len(A[0])): 
			result = [[A[i][j] + B[i][j]  for j in range(len(A[0]))] for i in range(len(A))] 
	return result
	
def mMinus (A,B):	
	for i in range(len(A)):
		for j in range(len(A[0])): 
			result = [[A[i][j] - B[i][j]  for j in range(len(A[0]))] for i in range(len(A))]
	return result

def mMultiply(A,B):
	result= [[sum(a * b for a, b in zip(A_row, B_col)) for B_col in zip(*B)] for A_row in A]
	return result

def mTranspose(A):
	A_T=numpy.transpose(A)
	return A_T
	
A1 =[ [1,2] , [3,4] ]
B1 =[ [2,0] , [1,2] ]
A2 =[ [1,4,6,10], [2,7,5,3] ]
B2 =[ [1,4,6], [2,7,5], [9,0,11], [3,1,0] ]
C = mPlus(A1,B1)
D = mMinus(A1,B1)
E1 = mMultiply(A2,B2)
E2 = mMultiply(B2,A2)
F = mTranspose(A2)
print ("A1=")
for a1 in A1:
	print(a1)
print ("\nB1=")
for b1 in B1:
	print(b1)
print ("\nA1+B1=")
for c in C:	
	print (c)
print ("\nA1-B1=")
for d in D:	
	print (d)
print ("\nA2=")
for a2 in A2:
	print(a2)
print ("\nB2=")
for b2 in B2:
	print(b2)
print ("\nA2xB2=")
for e1 in E1:	
	print (e1)
print ("\nB2xA2=")
for e2 in E2:	
	print (e2)
print ("\nA2^T=")
for f in F:
	print (f)
	
#Ex2
import matplotlib.pyplot as plt
import networkx as nx
import numpy as np

A1=np.array([[0,0,3,0,1],
            [0,0,5,3,0],
            [3,5,0,1,0],
            [0,3,1,0,2],
            [1,0,0,2,0]])
G1 = nx.from_numpy_matrix(A1)
pos=nx.spring_layout(G1)
nx.draw_networkx(G1,pos=pos,with_labels=True,labels={a:b for a,b in enumerate('abcde')})
edge_labels = nx.draw_networkx_edge_labels(G1,font_size=6,pos=pos,label_pos=0.5)
plt.axis('equal')
plt.show()

A2=np.array([[0,0,0,0,1,1],
            [0,0,5,3,0,0],
            [0,5,0,1,0,0],
            [0,3,1,0,2,3],
            [1,0,5,2,0,6],
            [1,0,0,3,6,0]])
G2 = nx.from_numpy_matrix(A2)
pos=nx.spring_layout(G2)
nx.draw_networkx(G2,pos=pos,with_labels=True,labels={a:b for a,b in enumerate('abcdef')})
edge_labels = nx.draw_networkx_edge_labels(G2,font_size=6,pos=pos,label_pos=0.5)
plt.axis('equal')
plt.show()

#Ex3
#a
A3=np.array([[0,0,5,3,0,0],
            [0,0,3,2,0,0],
            [0,0,0,1,3,0],
            [0,0,0,0,1,3],
            [0,0,0,0,0,4],
            [0,0,0,0,0,0]])
G3 = nx.from_numpy_matrix(A3)
pos=nx.spring_layout(G3)
nx.draw_networkx(G3,pos=pos,with_labels=True,labels={a:b for a,b in enumerate('ABCDEF')})
edge_labels = nx.draw_networkx_edge_labels(G3,font_size=6,pos=pos,label_pos=0.5)
plt.axis('equal')
plt.show()

#b
A4=np.array([[0,0,2,3,3,0],
            [0,0,3,2,0,0],
            [0,0,0,2,8,6],
            [0,0,0,0,0,5],
            [0,0,0,0,0,3],
            [0,0,0,0,0,0]])
G4 = nx.from_numpy_matrix(A4)
pos=nx.spring_layout(G4)
nx.draw_networkx(G4,pos=pos,with_labels=True,labels={a:b for a,b in enumerate('ABCDEF')})
edge_labels = nx.draw_networkx_edge_labels(G4,font_size=6,pos=pos,label_pos=0.5)
plt.axis('equal')
plt.show()
