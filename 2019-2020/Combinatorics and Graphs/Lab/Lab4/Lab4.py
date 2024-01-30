import sys

def Minimal_Change(n):
	if n==1:
		return [[1]]
	result = []
	pers = Minimal_Change(n-1)
	
	for p,per in enumerate(pers):
		if p//2==0:
			rangei = range (len(per),-1,-1)
		else:
			rangei = range (len(per)+1)
			
		for i in rangei:
			temp= per.copy()
			temp.insert(i,n)
			result.append(temp)
		
	return result
	
def print_list(s):
	for l in s:
		print(l)

def swap(A,k):
	if A[k][1]==1:
		A[k],A[k-1] = A[k-1],A[k]
	else:
		A[k],A[k+1]=A[k+1],A[k]
		
def mobile(A,k):
	if A[k][1]==1:
		if k == 0:
			return False
		return A[k][0] > A[k-1][0]
	else:
		if k == len(A) - 1:
			return False
		return A[k][0] > A[k+1][0]
	
def JohnsonTrotter(n):
	perm = [[i,1] for i in range(1,n+1)]
	result=[[e[0] for e in perm]]
	while True:
		mobiles = [perm[i] for i in range(len(perm)) if mobile (perm,i)]
		if len(mobiles) == 0:
			return result
		largest_mobile = max (mobiles)
		swap(perm, perm.index(largest_mobile))
		for e in perm:
			if e[0] > largest_mobile[0]:
				e[1]=-e[1]
		result.append([e[0] for e in perm])
			
def main():
	paramters = sys.argv
	if paramters[1] == 'JohnsonTrotter':
		print("JohnsonTrotter")
		print_list(JohnsonTrotter(int(paramters[2])))

	elif paramters[1] == 'Minimal_Change':
		print("Minimal_Change")
		print_list(Minimal_Change(int(paramters[2])))
	else:
		print("Invalid input")
		
if __name__ == '__main__':
	main()
	