import sys
def ex1(a):
    with open ('SquareBoard.txt','w') as f:
        for i in range (1,a):
            for j in range (1,a):
                f.write('# ')
            f.write('#\n')
    f.close()

def ex2(a):
    with open ('CozaLozaWoza.txt','w') as f1:
        c=0
        for j in range (1,a):
            if j % 3 == 0:
                f1.write(' Coza ')
            elif j % 5 == 0:
                f1.write(' Loza ')
            elif j % 7 == 0:
                f1.write(' Woza ')
            elif j % 3 == 0 and j % 5 == 0:
                f1.write(' CozaLoza ')
            else:
                f1.write(' '+str(j)+' ')
            c+=1
            if c==11:
                f1.write('\n')
                c=0
    f1.close()

def ex3(a):
    f2=open(a,"r")
    f3=open("FileCounter.txt","w")
    lines=0
    character=0
    sentence=0
    word=0
    for line in f2:
        lines+=1
        character+=len(line)
        wordlist=line.split()
        word+=len(wordlist)
    f3.write('Characters: '+str(character)+'\n')
    f3.write('Lines: '+str(lines)+'\n')
    f3.write('Words: '+str(word)+'\n')            
    f3.close()
    f2.close()
    
def ex4(a):
    f4=open("CheckVowelsDigits.txt","w")
    a=a.lower()
    countvowel=0
    countdigit=0
    count=0
    length=len(a)
    for x in a:
        if x is 'a' or x is 'e' or x is 'o' or x is 'u' or x is 'i':
            countvowel+=1
    for y in a:
        if y.isdigit():
            countdigit+=1
    count=countvowel+countdigit
    pervowel=round(countvowel/count,4) * 100
    perdigit=round(countdigit/count,4) * 100
    f4.write ('String: ' + a + '\n')
    f4.write ('Number of vowels: ' + str(countvowel) + '(' + str(pervowel) + '%)' + '\n')
    f4.write ('Number of digits: ' + str(countdigit)  + '(' + str(perdigit) + '%)' + '\n' )
    f4.close()
    
def ex5(a):
    f5=open("PhoneKeyPad.txt","w")
    a=a.lower()
    for x in a:
        if x is 'a' or x is 'b' or x is 'c':
            f5.write('2')
        if x is 'd' or x is 'e' or x is 'f':
            f5.write('3')
        if x is 'g' or x is 'h' or x is 'i':
            f5.write('4')
        if x is 'j' or x is 'k' or x is 'l':
            f5.write('5')
        if x is 'm' or x is 'n' or x is 'o':
            f5.write('6')
        if x is 'p' or x is 'q' or x is 'r' or x is 's':
            f5.write('7')
        if x is 't' or x is 'u' or x is 'v':
            f5.write('8')
        if x is 'w' or x is 'x' or x is 'y' or x is 'z':
            f5.write('9')           
    f5.close()

def ex6():
    f6=open("SetOperations.txt","w")
    A={1,2,3,4,5,6,7,8};
    B={2,4,5,6};
    C={4,7,9};
    
    D=A|B
    E=A&B
    F=A-B
    H=A^B
    f6.write("Union(A,B): "+ str(D)+'\n')
    f6.write("Union(A,B,C): "+ str(D|C)+'\n')
    f6.write("Intersection(A,B): "+ str(E)+'\n')
    f6.write("Intersection(A,B,C): "+ str(E&C)+'\n')
    f6.write("Disjoint(A,B): "+ str(F)+'\n')
    f6.write("Symmetric difference(A,B) :" + str(H)+'\n') 
    f6.close()  
    
    
if __name__ == '__main__':
    paramters = sys.argv
    if paramters[1] == 'ex1':
        ex1(int(paramters[2]))
    elif paramters[1] == 'ex2':
        ex2(int(paramters[2]))
    elif paramters[1] == 'ex3':
        ex3(paramters[2])
    elif paramters[1] == 'ex4':
        ex4(paramters[2])
    elif paramters[1] == 'ex5':
        ex5(paramters[2])
    elif paramters[1]== 'ex6' :
        ex6()
    else:
        print('There is nothing to do')