# Requirements:
The Essay will focus on calculation of base 2 numbers which are widely use in computer.

1. sum(A,B): return a string C which represent the sum of 2 numbers
represented by strings A and B.
    * For example: sum(’1100’,’1101’)=’11001’
2. dif(A,B): return a string C which represent the different of 2 numbers represented by strings A and B.
    * For example: dif(’101’,’100’)=’1’; if A<B return C=’error’
3. prod(A,B): return a string C which represent the product of 2 numbers
represented by strings A and B.
    * For example: prod(’10’,’100’)=’1000’
4. bitwiseAnd(A,B): return a string C which represent the bit by bit "and"of 2 strings of bits A and B.
    * For example: bitwiseAnd(’101011’,’111101’)=’101001’ | bitwiseAnd(’10’,’101’)=’0’
5. bitwiseOr(A,B): return a string C which represent the bit by bit "or"of 2 strings of bits A and B.
    * For example: bitwiseOr(’1100’,’10’)=’1110’
6. bitwiseXor(A,B): return a string C which represent the bit by bit "Xor"of 2 strings of bits A and B.
    *  For example: bitwiseXor(’1000’,’1011’)=’11’
7. bitwiseNot(A): return a string C which represent the bit by bit "Not"of string of bits A.
    * For example: bitwiseNot(’1100’)=’11’ | bitwiseNot(’111’)=’0’
8. bitwiseLeftShift(A): return a string C which represent the left shifted string of bits A.
    * For example: bitwiseLeftShift(’10010’)=’101’; | bitwiseLeftShift(’11010’)=’10101’
9. bitwiseRightShift(A): return a string C which represent the right shifted string of bits A.
    * For example: bitwiseRightShift(’10011’)=’11001’
10. bin2Hex(A): return a string C which represent the Hexadecimal form of A.
    * For example: Bin2Hex(’10011’)=’13’; Bin2Hex(’10011111’)=’9F’;

# Testing
Run **Score.py** to get the score for all implemented functions.