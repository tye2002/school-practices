import java.util.Scanner;

public class Ex16
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		System.out.println("Product of all digits: "+pro(a));
		
	}
	
	public static int pro (int a)
	{
		int sum=1,digit=0;
		while (a!=0)
		{
			digit=a%10;
			sum*=digit;
			a=a/10;
		}
		return sum;
	}
}