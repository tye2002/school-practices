import java.util.Scanner;
 
public class Ex22
{
   public static void main(String [] args)
   {
      int a, sum = 0, temp, rem, c= 0;
 
      Scanner input = new Scanner(System.in);
      System.out.println("Input a number:");      
      a = input.nextInt();
 
      temp = a;
     
     
      while (temp != 0) {
         c++;
         temp = temp/10;
      }
 
      temp = a;
 
      while (temp != 0) {
         rem = temp%10;
         sum = sum + power(rem, c);
         temp = temp/10;
      }
 
      if (a == sum)
         System.out.println(a + " is an Armstrong number.");
      else
         System.out.println(a + " isn't an Armstrong number.");        
   }
   
   static int power(int n, int r) {
      int i, p = 1;
 
      for (i= 1; i <= r; i++)
         p = p*n;
 
      return p;  
   }
}