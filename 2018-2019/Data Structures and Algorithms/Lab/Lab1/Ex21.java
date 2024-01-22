import java.util.Scanner;

public class Ex21
{
	public static void main (String[]args)
	{
		int a;
		Scanner input= new Scanner (System.in);
		do {
		System.out.println("Enter a number: ");
		a=input.nextInt();
		if (a<0)
			System.out.println ("Please enter a positive integer!");
		} while (a<0);
		if (count(a)==2)
			System.out.println(a + " is a Prime number.");
		else
			System.out.println(a + " is not a Prime number.");
	}
	
	public static int count (int a)
	{
		int c=0;
		for (int i=1;i<=a;i++)
			if (a%i==0)
				c++;
		return c;
	}
}