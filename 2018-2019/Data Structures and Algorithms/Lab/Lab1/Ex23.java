import java.util.Scanner;
 
public class Ex23
{
   public static void main(String [] args)
   {
		int a, sum = 0;
 
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number:");      
		a = input.nextInt();
 
		for (int i=1;i<a;i++)
		{
			if (a%i==0)
			{
				sum+=i;
			}
		}
		
		if (sum == a)
			System.out.println(a + " is a Perfect number.");
		else
			System.out.println(a + " isn't a Perfect number.");      
   }
}