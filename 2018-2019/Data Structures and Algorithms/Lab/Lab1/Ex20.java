import java.util.Scanner;

public class Ex20
{
	public static void main (String[]args)
	{
		int rev=0,rem=0;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		int m=a;
		while(m!=0)
		{
			rem=m%10;
			rev=rev*10+rem;
			m/=10;
		}
		if (rev==a)
			System.out.println(a+" is palindrome.");
		else
			System.out.println(a+" is not palindrome.");

	}
}