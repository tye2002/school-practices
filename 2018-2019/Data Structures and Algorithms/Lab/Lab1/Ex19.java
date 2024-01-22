import java.util.Scanner;

public class Ex19
{
	public static void main (String[]args)
	{
		int rev=0,rem=0;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}
		System.out.println("After reverse number: "+rev);
	}
}