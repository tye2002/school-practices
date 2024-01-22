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

#Ex1
p = True
q = False

print("\np= "+str(p))
print("q= "+str(q))

print ("\nr=lImplies(p,q)= "+str(lImplies(p,q)))
print ("r=lAnd(p,q)= "+str(lAnd(p,q)))
print ("r=lOr(p,q)= "+str(lOr(p,q)))
print ("r=lXor(p,q)= "+str(lXor(p,q)))
print ("r=lNot(p)= "+str(lNot(p)))
print ("r=lEquivalent(p,q)= "+str(lEquivalent(p,q)))

