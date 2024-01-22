
print("Ex1 + 2:")
print ("15 * 2 + 7 * 8 = " + str(15 * 2 + 7 * 8))
print ("20 - 15 + 15 * 2 = " + str(20 - 15 + 15 * 2))
print ("20 + 30 - 3 * 15 + 5^2 = "+ str(20 + 30 - 3 * 15 + 5**2))
print ("(4/6+ 2/6) / (5/2 + 1/2) = " + str(round((4/6+ 2/6) / (5/2 + 1/2),2)))
print ("14/2 + 7 = " + str(14/2 + 7))
print ("(5 * 2) / (5 - 20 * 3^2 + 30) = " + str (round((5 * 2) / (5 - 20 * 3**2 + 30),2)))

def sumN(n):
    sumN = 0
    if n>0:
        for i in range (0,n+1):
            sumN += i
    else:
        for i in range (n,0):
            sumN += i
    return sumN

print("\nEx3:")
n = int(input("n= "))
print ("sumN(n) =" + str(sumN(n)))

def space(s):
    print("a:" + str(s.replace(" ","")))
    print("b:" + str(s.replace(" ","_")
))

print("\nEx4:")
s = input("Input a string:")
space(s)  
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    