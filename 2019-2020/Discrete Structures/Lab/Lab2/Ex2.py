import itertools
def lImplies (a,b):
	if a:
		return b
	else:
		return True

def lAnd(a,b):
    if a==True and b==True:
        return True
    else:
        return False
        
def lOr(a,b):
    if a==False and b==False:
        return False
    else:
        return True
            
def lXor(a,b):
    return lAnd(lOr(a,b), not(lAnd(a,b)))

def lNot(a):
    return not(a)

def lEquivalent(a,b):
    if a==b:
        return True
    else:
        return False

#Ex2
n=2
table=list(itertools.product([True,False],repeat=n))
print("P\tQ")
print(*table, sep = "\n")

print("\nR= lImplies(P,Q)")
for x in table:
	print (x,lImplies(*x))
    
print("\nR= lAnd(P,Q)")
for x in table:
	print (x,lAnd(*x))

print("\nR= lOr(P,Q)")
for x in table:
	print (x,lOr(*x))
    
print("\nR= IXor(P,Q)")
for x in table:
	print (x,lXor(*x))
    
print("\nR= lEquivalent(P,Q)")
for x in table:
	print (x,lEquivalent(*x))
    
    
    
    
    
    
    
    
    

