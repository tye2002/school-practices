import itertools
def lImplies (a,b):
	if a:
		return b
	else:
		return True

#Ex3
n=3
table=list(itertools.product([True,False],repeat=n))
print("p\tq\tr")
print(*table, sep = "\n")

def f(A,B,C):
    return lImplies(A and B,C)
 
def f1(A,B,C):
    return lImplies(C,A and B)

print("\np^q->r")
for x in table:
	print (x,f(*x))

print("\nr->p^q")
for x in table:
    print (x,f1(*x))


    
    
    
    
    
    
    
    
    

