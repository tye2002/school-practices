import java.util.Scanner;

public class Ex15
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		System.out.println("Sum of all digits: "+sum(a));
		
	}
	
	public static int sum (int a)
	{
		int sum=0,digit=0;
		while (a!=0)
		{
			digit=a%10;
			sum+=digit;
			a=a/10;
		}
		return sum;
	}
}