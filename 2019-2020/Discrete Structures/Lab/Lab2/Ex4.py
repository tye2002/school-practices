import itertools
def lImplies (a,b):
	if a:
		return b
	else:
		return True

def lEquivalent(a,b):
    if a==b:
        return True
    else:
        return False

#Ex4
n=2
table=list(itertools.product([True,False],repeat=n))

n=3
table1=list(itertools.product([True,False],repeat=n))

def f1(p,q):
    return lImplies(lImplies(p or q, p and q),not(p) or not(q))
    
print("\np V q -> p ^ q -> ~p V ~q")
for x in table:
	print (x,f1(*x))
    
def f2(p,q,r):
    return lImplies(not(p) or (q and r),r)
    
print("\n~p V (q ^ r) -> r")
for x in table1:
	print (x,f2(*x))

def f3(p,q,r):
    return lImplies(p,q) and lImplies(q,r)
    
print("\n(p->q) ^ (q->r)")
for x in table1:
	print (x,f3(*x))    
    
def f4(p,q,r):
    return lEquivalent((p or (q and r)),((p or q) and (p or r)))
    
print("\n(p V (q ^ r)) <-> ((p V q) ^ (p V r))")
for x in table1:
	print (x,f4(*x))
    
def f5(p,q,r):
    return lImplies((p or q),(r or True))
    
print("\np V q -> r V t")
for x in table1:
	print (x,f5(*x))
    
def f6(p,q,r):
    return lImplies(lImplies((p or True),q), lImplies(r,True))
    
print("\np V t -> q -> (r -> t)")
for x in table1:
	print (x,f6(*x))

    
    
    
    
    

