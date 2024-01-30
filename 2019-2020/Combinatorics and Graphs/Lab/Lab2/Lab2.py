import sys
def MixedRadix(a,b):
	f1=open(a,'r')
	f2=open(b,'w')
	n=0
	for s in f1:
		num=s.split(" ")
		n+=len(num)
	for i in range(n):
		j=int(num[i])
		for k in range(j):
			if k < int(num[i]):
				f2.write(str(k)+' ')
		f2.write('\n')		
	f2.close()
	f1.close()
	
def Display(a):
	f1=open(a,'r')
	for a in f1:
		n=int(a)
		if (n <= 0): 
			return
	  
		# 'graycode' will store all generated codes 
		graycode = list()	
		
		# Start with the gray code sequence
		graycode.append("0") 
		graycode.append("1") 
	   
		i = 2
		j = 0
		while(True): 
	  
			if i >= 1 << n: 
				break
		  
			# generated arr[] in reverse order.	 
			for j in range(i - 1, -1, -1): 
				graycode.append(graycode[j]) 
	  
			# append 0 to the original 
			for j in range(i): 
				graycode[j] = "0" + graycode[j] 
	  
			# append 1 to the copy
			for j in range(i, 2 * i): 
				graycode[j] = "1" + graycode[j] 
			i = i << 1
	  
		for i in range(len(graycode)): 
			print(graycode[i]+' ')		
	f1.close()
	
def GrayCode(a,b):
	f1=open(a,'r')
	f2=open(b,'w')
	for a in f1:
		n=int(a)
		if (n <= 0): 
			return
	  
		graycode = list()	
		
		graycode.append("0") 
		graycode.append("1") 
	   
		i = 2
		j = 0
		while(True): 
	  
			if i >= 1 << n: 
				break
		  
			for j in range(i - 1, -1, -1): 
				graycode.append(graycode[j]) 
	  
			for j in range(i): 
				graycode[j] = "0" + graycode[j] 
	  
			for j in range(i, 2 * i): 
				graycode[j] = "1" + graycode[j] 
			i = i << 1
	  
		for i in range(len(graycode)): 
			f2.write(graycode[i]+' ')		
	f2.close()
	f1.close()
	
def xor_c(a, b): 
	return '0' if(a == b) else '1'; 
   
def flip(c): 
	return '1' if(c == '0') else '0'; 
  
def BinarytoGraycodes(a,b):
	f1=open(a,'r')
	f2=open(b,'w')
	
	for bin in f1:
		gc = ""
		gc = gc + bin[0]; 
	   
		for i in range(1,len(bin)):	 
			gc += xor_c(bin[i - 1],bin[i]); 
		f2.write(gc)
		
	f2.close()
	f1.close()
	
def GraycodestoBinary(a,b): 
	f1=open(a,'r')
	f2=open(b,'w')
	
	for gc in f1:
		bin = ""
		bin = bin + gc[0]; 
	   
		for i in range(1,len(gc)):
			if (gc[i]=='0'):
				bin = bin + bin[i-1]
			else:
				bin += flip(bin[i - 1]); 
		f2.write(bin)
		
	f2.close()
	f1.close() 
	
if __name__ == '__main__':
	paramters = sys.argv
	if paramters[1] == 'testcaseM.txt':
		MixedRadix(paramters[1],paramters[2])
	if paramters[1] == 'testcaseD.txt':
		Display(paramters[1])
	if paramters[1] == 'testcaseG.txt':
		GrayCode(paramters[1],paramters[2])
	if paramters[1] == 'testcaseB2G.txt':
		BinarytoGraycodes(paramters[1],paramters[2])
	if paramters[1] == 'testcaseG2B.txt':
		GraycodestoBinary(paramters[1],paramters[2])
	