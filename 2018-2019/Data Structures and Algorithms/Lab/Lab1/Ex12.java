import java.util.Scanner;

public class Ex12
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter 3 angles of triangle:");

		int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
		if (a+b+c==180)
			System.out.println("Triangle is valid.");
		else
			System.out.println("Triangle is not valid.");

	}
}