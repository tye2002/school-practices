import java.util.Scanner;
 
public class Ex25
{
   public static void main(String [] args)
   {
		int a;
 
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("Input a number:");      
		a = input.nextInt();
		if (a<0)
			System.out.println("Please enter a positive number!");
		} while (a<0);
		System.out.println ("Armtrong number between 1 to "+a+":");
		for (int t=1; t<=a;t++)
			if (t == sum(t))
				System.out.println(t);
		      
	}
   
	static int power(int n, int r) 
	{
		int i, p = 1;
 
		for (i= 1; i <= r; i++)
			p = p*n;
 
		return p;  
   }
   
   static int sum (int a)
   {
	   int temp,rem,sum=0;
	temp = a;
 
		while (temp != 0) 
		{
			rem = temp%10;
			sum = sum + power(rem, count(a));
			temp = temp/10;
		}
		return sum;
   }
   
   static int count (int a)
   {
	   int temp,c=0;
	   temp = a;
     
     
		while (temp != 0) 
		{
			c++;
			temp = temp/10;
		}
		return c;
   }
}