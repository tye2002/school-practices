import java.util.Scanner;

public class Ex17
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		System.out.println("Number of all digits: "+num(a));
		
	}
	
	public static int num (int a)
	{
		int c=0;
		while (a!=0)
		{
			a=a/10;
			c++;
		}
		return c;
	}
}