################---1---################ Done
def sum(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	#result
	C = ''
	carry = 0
	#Go through the string
	for i in range(max_len - 1, -1, -1):
		r = carry
		r += 1 if a[i] == '1' else 0
		r += 1 if b[i] == '1' else 0
		C = ('1' if r%2 ==1 else '0') + C
		#Compute the carry
		carry = 0 if r < 2 else 1
	if carry !=0 : C = '1' + C
	return C.zfill(max_len)
	
################---2---################ Done
def dif(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	#result
	C = ''
	#Go through the string
	for i in range(max_len - 1):
		if a[i] == '0' and b[i] == '1':
			C += 'error'
			return C
		else:
			not_b = bitwiseNot(b)
			nega_b = sum(not_b,'1')
			C = sum(a,nega_b)
			C = C[1:]
			return C.lstrip('0')

################---3---################ Done
def prod(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	C =''
	for i in range(max_len - 1, -1, -1):
		if b[i] == '1':
			C = sum(C,a)
		a+='0'
	return C.lstrip("0")

################---4---################ Done
def bitwiseAnd(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	#result
	C = ''
	#Go through the string
	for i in range(max_len):
		if((a[i] == '1') and (b[i] == '1')):
			C += '1'
		else:
			C += '0'
	for i in range(len(C)):
		if C[i] == '1':
			return C.lstrip('0')
		else:
			continue
	C = '0'
	return C

################---5---################ Done
def bitwiseOr(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	#result
	C = ''
	#Go through the string
	for i in range(max_len):
		if((a[i] == '1') or (b[i] == '1')):
			C += '1'
		else:
			C += '0'
	return C.lstrip("0")

################---6---################ Done
def bitwiseXor(A,B):
	max_len = max(len(A),len(B))
	a = A.zfill(max_len)
	b = B.zfill(max_len)
	#result
	C = ''
	#Go through the string
	for i in range(max_len): 
		if (a[i] == b[i]): 
			C += '0'
		else: 
			C += '1'
	return C.lstrip("0")

################---7---################ Done
def bitwiseNot(A):
	C =''
	for i in range(len(A)):
		if A[i]== '1':
			C += '0'
		else:
			C += '1'
	for i in range(len(C)):
		if C[i] == '1':
			return C.lstrip('0')
		else:
			continue
	C = '0'
	return C

################---8---################ Done
def bitwiseLeftShift(A):
	C = ''
	C += A[1:]+A[0]
	return C.lstrip("0")
	
################---9---################ Done
def bitwiseRightShift(A):
	C = ''
	C += A[len(A)-1]+A[:-1]
	return C.lstrip("0")
	
################---10---################ Done
def	 bin2Hex(A):
	Hex = {"0000": "0",
			"0001": "1",
			"0010": "2",
			"0011": "3",
			"0100": "4",
			"0101": "5",
			"0110": "6",
			"0111": "7",
			"1000": "8",
			"1001": "9",
			"1010": "A",
			"1011": "B",
			"1100": "C",
			"1101": "D",
			"1110": "E",
			"1111": "F"
			}
	i = 0
	C = ''
	while (len(A) % 4 != 0):
		A = "0" + A
	while (i < len(A)):
		C = C + Hex[A[i:i + 4]]
		i = i + 4
	C = C.lstrip("0")
	C = "0" if len(C) == 0 else C
	return C   
