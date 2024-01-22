import java.util.Scanner;

public class Ex14
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=input.nextInt();
		System.out.println("First digit: "+first(a));
		System.out.println("Last digit: "+last(a));
	}
	
	public static int first(int a)
	{
		int first=0;
		while (a>10)
			a=a/10;
		return a;
	}
	public static int last(int a)
	{
		int last=0;
		last=a%10;
		return last;
	}
}