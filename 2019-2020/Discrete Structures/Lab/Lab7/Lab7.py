print("Ex1")
def recursive(n):
	if ( n ==1):
		return 1
	return n+recursive(n-1)	

print("\nRecursive Result: ",)
print(recursive(6))

print("\nEx2")
def richest(A):
	if len(A) == 1 or A[0] > richest(A[1:]):
		return A[0]
	return richest(A[1:])
print("\nRichest: ")
print(richest([2, 5, 3, 9]))

print("\nEx3")
def waytochoose(n, k):
	if k == 0 or k == n:
		return 1
	return waytochoose(n-1,k) +waytochoose(n-1,k-1)
print("\nWay to choose: ")
print("k = 2")
print(waytochoose(50,2))


print("\nEx4")
def waytochooseP(n, k):
	if k == 0 or k == n:
		return 1
	return n*waytochooseP(n-1,k-1)
print("\nWay to choose P: ")
print("k = 3")
print(waytochooseP(50,3))

print("\nEx5")
def Powof2(n):
	if n == 0:
		return 1
	return 2 * Powof2(n-1)
print("\nThe characters has appeared in Scheherazade’s stories: ")
print(Powof2(2))


print("\nEx6")
def Fib(n):
	if n <2:
		return 1
	return n * Fib(n-1)
n= int(input("n= "))
print("\nThe nth Fibonacci: ")
print(Fib(n))

print("\nEx7")
def TowerOfHanoi(n , source, destination, auxiliary): 
    if n==1: 
        print ("Move 1 from list",source,"to list",destination )
        return
    TowerOfHanoi(n-1, source, auxiliary, destination) 
    print ("Move",n,"from list",source,"to list",destination)
    TowerOfHanoi(n-1, auxiliary, destination, source) 
n= int(input("n= "))
TowerOfHanoi(n,'A','C','B')  