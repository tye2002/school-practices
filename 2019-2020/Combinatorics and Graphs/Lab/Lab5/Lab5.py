import sys

def rSubsetsLex(r,n):
	subsets=[]
	P=list(range(1,r+1))
	subsets.append(P)	
	j=r-1
	while True:
		P=P.copy()
		j_old=j
		while j>=0 and P[j]==n-r+j+1:
			j=j-1
		if j>=0:
			P[j]=P[j]+1
			if j != j_old:
				for k in range(j+1,r):
					P[k]=P[k-1]+1
				j=r-1
			subsets.append(P)
		else: break
	return subsets


def print_list(s):
	for l in s:
		print(l)

def main():
	parameters = sys.argv
	if parameters[1] == 'rSubsetsLex':
		print("rSubsetsLex")
		print_list(rSubsetsLex(int(parameters[2]),int(parameters[3])))
	else:
		print("Invalid input")
		
if __name__ == '__main__':
	main()