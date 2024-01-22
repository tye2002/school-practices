import java.util.Scanner;
 
public class Ex26
{
   public static void main(String [] args)
   {
		int a;
 
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Input a number:");      
		a = input.nextInt();
		if (a<0)
			System.out.println("Please enter a positive number !");
		} while (a<0);
		System.out.println("Perfect number between 1 to "+a+":");
		
		for (int i=1;i<a;i++)
		{
			if (sum(i)==i)
				System.out.println(i);
		}
			    
   }
   static int sum (int a)
   {
	   int sum=0;
	   for (int i=1;i<a;i++)
		{
			if (a%i==0)
			{
				sum+=i;
			}
		}
		return sum;
   }
}