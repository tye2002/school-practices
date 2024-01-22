def nextPrime(n):
    return find_prime_in_range(n, 100)

def find_prime_in_range(a, b):
    for p in range(a, b):
        for i in range(2, p):
            if p % i == 0:
                break
        else:
            return p
    return None

print("\nEx1:")
a = int(input('Next prime number of: '))
print (nextPrime(a+1))

def primeFacts(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors

print("\nEx2:")
b = int(input('Prime factors of number: '))
print (primeFacts(b))

def isPrime(n): 
    if n <= 1 : 
        return False
    for i in range(2, n): 
        if n % i == 0: 
            return False
    return True
  
def printPrime(n): 
    for i in range(2, n): 
        if isPrime(i): 
            print(i, end = " ") 
  
print("\nEx3:")
c = int(input('Print prime numbers smaller than: '))
printPrime(c)

def gcd(a,b):
    if (a == 0):
        return b
    if (b == 0):
        return a
    if (a == b):
        return a
    if (a > b):
        return gcd(a-b, b)
    return gcd(a, b-a)
 
print('\nEx5:')
n1 = int(input('a= '))
n2 = int(input('b= '))
print('GCD of', n1, 'and', n2, 'is', gcd(n1, n2))

def lcm(a,b):
  return (a*b)/gcd(a,b)

print('\nEx6:')
n3 = int(input('a= '))
n4 = int(input('b= '))
print('LCM of', n3, 'and', n4, 'is', int(lcm(n3, n4)))

def decimalToBinary(num):
    if num > 1:
        decimalToBinary(num // 2)
    print(num % 2, end='')

print('\nEx7:')
e = int(input('Enter any decimal number: '))
print('Convert ' + str(e) + ' to binary number = ')
decimalToBinary(e)

def decimalFracToBinary(num) : 
    binary = ""  
    Integral = int(num)
    fractional = num - Integral
    while (Integral) : 
        rem = Integral % 2
        binary += str(rem)
        Integral //= 2
    binary = binary[ : : -1] 
    binary += '.'
    k = 8
    while (k) : 
        fractional *= 2
        fract_bit = int(fractional)  
        if (fract_bit == 1) : 
            fractional -= fract_bit  
            binary += '1'
        else : 
            binary += '0'
        k -= 1
    return binary  

print('\nEx8:')
f = float(input('Enter any decimal number: '))
print('Convert ' + str(f) + ' to binary number = ' + str(decimalFracToBinary(f)))


def Hex(num) :  
    m = dict.fromkeys(range(16), 0)  
    digit = ord('0')  
    c = ord('a')
    for i in range(16): 
        if (i < 10) : 
            m[i] = chr(digit); 
            digit += 1; 
        else : 
            m[i] = chr(c); 
            c += 1
    res = ""
    if (not num) : 
        return "0"  
    if (num > 0) : 
        while (num) : 
            res = m[num % 16] + res  
            num //= 16  
    else : 
        n = num + 2**32  
        while (n) : 
            res = m[n % 16] + res  
            n //= 16  
    return res  

print('\nEx9:')
g = int(input('Enter any decimal number: '))
print('Convert ' + str(g) + ' to hexadecimal number = ' + str(Hex(g)))
