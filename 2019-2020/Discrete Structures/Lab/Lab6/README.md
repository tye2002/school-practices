# Exercises:
1. On his return from Troy, Odyssey visit many islands due to either accident or on his own accord. One time, on a certain island, the local ask him to play a game where they have to declare a number of gold coins which is larger than the numbers of villagers and can’t be fairly divide among them every time they query him and he can’t declare the same number twice during his stay. If he can do that, they will let his crews stay for free and spare them some foods. If not, they will take all his gold coins for the stay.
Knowing he will need the coins for his way home, as he only know that the villager is less than a 100, write Python function nextPrime(n) to return such number that is right next to n to help Odyssey safely leave the island with all his gold coins. For example: nextPrime(3) is 5 and nextPrime(8) is 11.

2. Another time, Odyssey meet a door that give him many numbers and tell
him to write down a single number as hint for another crew and tell him
if the crew can’t tell all the numbers he will not let them pass and he
change the numbers every time a crew give a wrong answer. After many
failed attempts, Odyssey give the crew a Python function primeFact(p)
to return a list which contains the prime factorization of p; for example:
60 ! 2; 2; 3; 5. Then tell his crew to count the number of same numbers
such as two of 2 and one of 3 then one of 5 and give two, one, one to the door the answer. And that, is how Odyssey and his crews pass the door of question.

3. When he reach his homeland, there is a war going on for his kinghood.
There are many contests to be the king of Ithaca since he was gone for many years. To avoid chaotic situation, Odysseus ask the god to turn him
into an old man and participate in the contest to be king. The first contest demand participants to state as many as possible numbers that can’t be divided. Write Python function printPrime(N) using to print all the Prime number ni, ni < N to help Odyssey pass the first contest.

4. Finally, after many contests, the last contest given the following algorithm
and ask what the result is with n = 10, 20, 5:
Input: Integer n
Output: List O
Step0: if n<2: return [] else: proceed to step 1
Step1: Initiate O=[2]
Step2: i = 3
Step3: Flag = True
Step4: j = 0
Step5: if i%O[j]=0: Flag=False go to step 8
Step6: if j+1<length(O): j+=1;go to step 5
Step7: if Flag=True: O.append[i]
Step8: if i+2<n: i+=2; go to step 3; else: return O
Implement the algorithm to help Odyssey get back to his throne.

5. After finished the final contest, Odyssey asked by his son why an old man who probably don’t have much years to live himself enter the contest to
be the king. Then he ask his son a problem that is given 2 numbers can
he find the largest number that can be divide by both of them. His son
having a hard time to find by trying the numbers one by one. It was
then Odyssey Using Euclidean algorithm from theory slide, write Python
function gcd(a,b) to calculate greatest common divisor of 2 integers a and b.

6. Not agree with such a minor problem, the son demand Odyssey to give
another quiz. This time, he tell his son to find the smallest number that can divide 2 numbers he gave him. Like last time, the son try all the numbers that is smaller than the product of 2 given numbers. Odyssey then tell him the answer by function lcm(a,b) to calculate the least common multiple(lcm) of two integers. Run your code to find. Given gcd(a; b) × lcm(a; b) = ab. It was after this, His son agree that this old man have wisdom to be the king and replace his father. The god then turn Odyssey back into his original form and he reunion with his son and wife.

7. Aryabhata, who was born and lived in India around 500BC, is one of
the mathematician who invented the way of place-value notation in which
place-value base 10 111 mean 1 ∗ 102 + 1 ∗ 101 + 1 ∗ 100. One time, he
met a tribe that use only dash "−"to represent their numbers in which 10
dashes will be number 10. Aryabhata introduce a dot "o"to write in case
of not dash "−". Thank to this, the way to write number 10 reduce to
"−o−o"which is significantly shorter when the number increase. However,
traders who use Aryabhata base 10 sometimes have trouble to write theirs
numbers to the tribe. Because of that, he write a Python program to
convert a positive integer from base 10 to base 2 to help the traders convert their numbers to the tribe. ex: 5 ! 101; 15 ! 1111
hint:
6==2 = 3; 6%2 = 0
3==2 = 1; 3%2 = 1
1==2 = 0; 1%2 = 1
hence: 610 = 1102

8. After many generations, The traders need to write number of decimal
fraction to the tribe base 2 numbers. However, when they try the previous convert way it is not work at all. Write a Python program to convert a decimal fraction 0 ≤ n < 1 to binary. ex: 5:5 ! 101:1; 5:25 ! 101:01

9. Thank to the generations of trading, the tribe is growing into a very strong country. However, their population is so large now that the base 2 number is still really long to write. A tribal mathematician upgrade there base 2 number to base 16 to shorten there number writing way. But, this lead to the traders can’t communicate with the new country again. The traders ask their mathematician write a Python function to convert a positive integer from base 10 to base 16.

10. Finally, a great mathematician decided to write a Python function
convertbase(a,base1,base2) to convert list a which represent a number
from base1 to base2. For example: convertbase([1,1,1],10,16) will give
output [6,15] which represent the conversion of 11110 to 6F16 so that
they will never have to write function from the demand of traders.