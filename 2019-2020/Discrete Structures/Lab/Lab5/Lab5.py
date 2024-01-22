print ("Ex1:")
P ="You get good grade in the midterm exam"
Q ="You understand how to solve all the exercises in the book"
print("P:" + str(P))
print("Q:" + str(Q))
print("P <-> Q")
print ("Q ^ ~P")
print ("Q -> P")

print("\nEx2:")
a = "You get good grade in the midterm exam if and only if you understand how to solve all the exercises in the book"
print("a:" + str(a))
c = "You will get good grade in the midterm exam if you understand how to solve all the exercises in the book"
print("c:" + str(c))

print("\nEx3:")
print("Given: Q -> P : You will get good grade in the midterm exam if you understand how to solve all the exercises in the book")
print("Negation: Q ^ ~P : You understand how to solve all the exercises in the book, but you did not get good grade in the midterm exam")
print("Converse: P -> Q : If you get good grade in the midterm exam then you understand how to solve all the exercises in the book.")
print("Contrapositive: ~P -> ~Q : If you don't get good grade in the midterm exam then you don't understand how to solve all the exercises in the book.")

print("\nEx4:")

print("a")
p="Phong has Visa"
q="Phong can fly"
r="Phong can speak English"
t="Phong goes to America"
print ("Let:\n p:%s\n q:%s\n r:%s\n t:%s"%(p,q,r,t))
S1 = "q -> t"
S2 = "p -> t"
S3 = "r -> t"
C = "t"
print ("S1:%s\nS2:%s\nS3:%s\nC:%s\n"%(S1,S2,S3,C))

print("\nb")
p ="An wake up late"
q ="the traffic is flowing smooth"
not_q ="the traffic is heavy"
r ="school day"
s ="An have go to school"
v ="An is late for school"
print ("Let:\n p:%s\n q:%s\n ~q:%s\n r:%s\n s:%s\n v:%s"%(p,q,not_q,r,s,v))
S1 = "~q ^ r"
S2 = "p -> (v ^ r)"
S3 = "s ^ r"
S4 = "~s -> ~v"
C = "v"
print ("S1:%s\nS2:%s\nS3:%s\nS4:%s\nC:%s\n"%(S1,S2,S3,S4,C))

print("\nEx5:")
print("a:")
S2 = "p -> t"
P = "p"
C = "S2 + P -> C= 't' , Modus Ponens"
print("S1="+S1)
print("P="+P)
print(C)

print("\nEx6:")
import math
def isOdd(a):
  if a%2==0:
    return False
  else:
    return True

def isPrime(a):
  if (a <= 1) : 
    return False
  if (a <= 3) : 
    return True
  if (a % 2 == 0 or a % 3 == 0) : 
    return False
  i = 5
  while(i * i <= n) : 
    if (a % i == 0 or a % (i + 2) == 0) : 
      return False
    i = i + 6
  return True

def isSquare(a):
  root = math.sqrt(a)
  if root ** 2 == a:
    return True
  else:
    return False

def isGreater(a,b):
  if a>b:
    return True
  else:
    return False

def isEqual(a,b):
  if a==b:
    return True
  else:
    return False

A=[
[2 ,0 ,5 ,0 ,3 ,0],
[3 ,0 ,0 ,0 ,0 ,0],
[0 ,6 ,2 ,0 ,5 ,0],
[3 ,0 ,9 ,0 ,25 ,0],
[0 ,0 ,2 ,4 ,5 ,0],
[0 ,0 ,0 ,0 ,0 ,5]
]
n = len(A)
print("a:")
flag = 0
for i in range(n):
  for j in range(n):
    if ((isOdd(A[i][j]) == False) and (isPrime(A[i][j]) == True)):
      print("True")
      flag = 1
      break
  if flag == 1:
    break
if flag == 0:
  print("False")

print("\nb:")
import itertools
def lImplies (a,b):
	if a:
		return b
	else:
		return True

def stateB(A,n):
    flag = 0
    for i in range(n):
        for j in range(n):
            p = isOdd(A[i][j])
            q = isSquare(A[i][j])
            if lImplies(p,q) == True:
                flag += 1
            else:
                return False
    if flag == n*n:
      return True  
print(stateB(A,n))

print("\nc:")
def stateC(A,n):
    flag = 0
    for i in range(n):
        for j in range(n):
            p = isOdd(A[i][j])
            q = isGreater(A[i][j],2)
            if lImplies(p,q) == True:
              flag += 1
            else:
              return False
    if flag == n*n:
      return True   
print(stateC(A,n))
      
print("\nd:")
flag = 0
for i in range(n):
  for j in range(n):
    p = isPrime(A[i][j])
    q = isGreater(A[i][j],3)
    r = isEqual(A[i][j],3)
    if lImplies(p,q or r) == True:
      print("True")
      flag = 1
      break
  if flag == 1:
    break
if flag == 0:
  print("False")
