import sys

def permHeap(A,k):
	if k==1:
		print(A)
	else:
		permHeap(A,k-1)
		for i in range(k-1):
			if k//2==0:
				A[i],A[k-1] = A[k-1],A[i]
			else:
				A[0],A[k-1]=A[k-1],A[0]
			permHeap(A,k-1)

def swap(elements, i, j):
	elements[i], elements[j] = elements[j], elements[i]


def reverse(elements, i, j):
	for offset in range((j - i + 1) // 2):
		swap(elements, i + offset, j - offset)


def permLexicographic(elements):
	print ("Sequence: "+elements)
	last_index = len(elements) - 1
	if last_index < 1:
		print (elements)

	i = last_index - 1
	while i >= 0 and not elements[i] < elements[i + 1]:
		i -= 1	
	
	if i < 0:
		reverse(elements, 0, last_index)
		
	else:
		j = last_index
		while j > i + 1 and not elements[j] > elements[i]:
			j -= 1
			
		swap(elements, i, j)
		print ("Swap: "+elements)
		reverse(elements, i + 1, last_index)
	print ("Final: "+elements)
	
def main():
	paramters = sys.argv
	if paramters[1] == 'Heap':
		print("permHeap")
		permHeap([1,2,3],3)
	elif paramters[1] == 'Lexico':
		print("permLexicographic")
		permLexicographic([0,1,2,5,3,3,0])
	else:
		print("Invalid input")
		
if __name__ == '__main__':
	main()
	