#Ex1
print("Ex 1:")
print ("a")
P ="Phong has Visa"
S1="If Phong can fly, Phong will go to America"
S2="If Phong has Visa, Phong will go to America"
S3="If Phong can speak English, Phong will go to America"
C ="Phong goes to America"
print ("P and S2 -> C")
print ("P:%s"%(P))
print ("S2:%s"%(S2))
print ("C:%s"%(C))

print ("\nb")
P ="It’s hot yesterday"
S1="If it’s hot, it will rain the next day"
S2="If and only if it’s not rain, Nam goes outside"
S3="If it’s not hot, Nam will go outside"
C ="Nam goes outside"
print ("P and ~S3 -> ~C")
print ("P:%s"%(P))
print ("S3:%s"%(S3))
print ("C:%s"%(C))

print ("\nc")
Q ="An wake up late"
R ="The traffic is flowing smooth"
S1="The traffic is always heavy on school day"
S2="If An wake up late, he will be late for school on school day"
S3="An only have to go to school on school day"
S4="If An don’t have to go to school, An can’t be late for school"
C ="An is late for school"
print ("Q and S1 -> C")
print ("Q:%s"%(Q))
print ("S1:%s"%(S1))
print ("C:%s"%(C))

#Ex2
import math 
print("\nEx 2:")
print("a: ∃x ∈ Z, 0 ≤ x ≤ 100, x^2 = 15^2 + 16^2")
flag = 0
for x in range(101):
    if x**2 == 15**2 + 16**2:
        flag = 1
        print("The given statement is correct when x=%s"%(x))
        break
if flag == 0:
    print("The given statement is incorrect for all values x within the given domain.")

print("\nb: ∃x ∈ Z, 0 ≤ x ≤ 100, x^2 = 12^2 + 16^2")
flag = 0
for x in range(101):
    if x**2 == 12**2+16**2:
        flag = 1
        print("The given statement is correct when x=%s "%(x))
        break
if flag == 0:
    print("The given statement is incorrect for all values x within the given domain.")

print("\nc: ∃x ∈ Z, −50 ≤ x ≤ 50, x^2 ≥ 99x")
flag = 0
for x in range(-50,51):
    if x**2 >= 99*x:
        flag = 1
        print("The given statement is correct when x=%s "%(x))
        break
if flag == 0:
    print("The given statement is incorrect for all values x within the given domain.")

print("\nd: ∃x ∈ Z, 50 ≤ x ≤ 100, x(x + 1)(x + 2)%6 != 0")
flag = 0
for x in range(50,101):
    if (x+1)*(x+2)%6 != 0:
        flag = 1
        print("The given statement is correct when x=%s "%(x))
        break
if flag == 0:
    print("The given statement is incorrect for all values x within the given domain.")

#Ex3
print("\nEx 3:")
print("a: ∀x ∈ Z, 0 ≤ x ≤ 100, x^3 >= x")
print("a: negated statement: ∃x ∈ Z, 0 ≤ x ≤ 100, x^3 < x")
flag = 0
for x in range(101):
    if x**3 < x:
        flag = 1
        print("The negated statement is correct when x=%s "%(x))
        break
if flag == 0:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

def checkPrime(num):
    if num > 1: 
        for i in range(2, num): 
            if (num % i) == 0: 
                return False 
                break
        else: 
            return True
    else: 
        return False

print("\nb: ∀x ∈ Z, 0 ≤ x ≤ 100, and x is even, x ∗ 3 + 1 is a prime number")
print("b: negated statement: ∃x ∈ Z, 0 ≤ x ≤ 100, and x is even, x ∗ 3 + 1 is not a prime number.")
flag = 0
for x in range(101):
    if x%2 == 0:
        if checkPrime(x * 3 + 1) == True:
            flag = 1
            print("The negated statement is correct when x=%s "%(x))
            break
if flag == 0:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\nc: ∀x ∈ Z, 1 ≤ x ≤ 100, and x is even, x ∗ 5 + 3 is a prime number")
print("c: negated statement: ∃x ∈ Z, 1 ≤ x ≤ 100,, and x is even, x ∗ 5 + 3 is not a prime number.")
flag = 0
for x in range(101):
    if x%2 == 0:
        if checkPrime(x * 5 + 3) == True:
            flag = 1
            print("The negated statement is correct when x=%s "%(x))
            break
if flag == 0:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\nd: ∀c ∈ Z, 0 < c ≤ 100, c%4 = 0, ∃a, b ∈ Z, c^2 = a^2 + b^2")
print("d: negated statement: ∃c ∈ Z, 0 < c ≤ 100, c%4 = 0, ∀a, b ∈ Z, c^2 != a^2 + b^2")
flag = 0
for c in range(4,101,4):
    flag2 = 0
    for a in range (1,c):
        for b in range(1,c):
            if c**2 == a**2 + b**2:
                flag2 = 1
                break
    if flag2 == 0:
        flag = 1
        break 
if flag == 0:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\ne: ∃c ∈ Z, 0 < c ≤ 100, c^2 ≤ c")
print("e: negated statement: ∀c ∈ Z, 0 < c ≤ 100, c^2 > c")
flag = 0
result = []
for c in range(1,101):
    if c**2 <= c :
        flag = 1
        break
if flag == 1:
    print("The given statement is correct.")
else:
    print("The negated statement is correct")
    print("The given statement is incorrect.")

#Ex4
print("\nEx 4:")
print("a:")
sum1 = 0
sum2 = 0
for x in range(11):
    for y in range(11):
        sum1 += (x+y)**2
        sum1 += (x+2*y)**2
if sum1 > sum2:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\nb:")
sum1 = 0
for x in range(11):
    sum1 += math.factorial(x)
if math.factorial(20) < sum1:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\nc:")
sum = 0
for x in range(11):
    sum += 3*(x**2)
if sum >= 10**3:
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

print("\nd:")
sum = 0
for x in range(5,11):
    sum += (4*(x**3) + 6*(x**2) + 2*x)
if sum > (10**4 + 2*(10**3) + 10**2 - 5**4 - 2*(5**3) - 5**2):
    print("The given statement is correct.")
else:
    print("The given statement is incorrect.")

#Ex5
print("\nEx 5:")
print("a")
G1 = "p → r"
G2 = "~p → q"
G3 = "q → s"
G4 = "G2 + G3 -> '~p -> s' , transitivity"
C = "G1 + G4 -> C = '~r-> s' "
print ("G1= %s"%( G1 ))
print ("G2= %s"%( G2 ))
print ("G3= %s"%( G3 ))
print ("G4= %s"%( G4 ))
print ("%s"%( C))
print("Proved")

print("\nb")
G1 = "p → (q → r)"
G2 = "p ∨ s"
G3 = "t → q"
G4 = "~s"
G5 = "G2 + G4 -> 'p', Elimination"
G6 = "G1 + G5 -> 'q -> r', Modus Ponens"
C = "G3 + G6 -> C = 't -> r'"
print ("G1= %s"%( G1 ))
print ("G2= %s"%( G2 ))
print ("G3= %s"%( G3 ))
print ("G4= %s"%( G4 ))
print ("G5= %s"%( G5 ))
print ("G6= %s"%( G6 ))
print ("%s"%( C))
print("Disproved")

print("\nd")
G1 ="p"
G2 = "p → r"
G3 = "p → (q ∨ ~r)"
G4 = "~q ∨ ~s"
G5 = "G1 + G2 -> 'r', Modus Ponens"
G6 = "G1 + G3 -> 'q ∨ ~r', Modus Ponens"
G7 = "G5 + G6 -> 'q', Elimination"
C = "G4 + G7 -> C = '~s'"
print ("G1= %s"%( G1 ))
print ("G2= %s"%( G2 ))
print ("G3= %s"%( G3 ))
print ("G4= %s"%( G4 ))
print ("G5= %s"%( G5 ))
print ("G6= %s"%( G6 ))
print ("G7= %s"%( G7 ))
print ("%s"%( C))
print("Disproved")






















