import java.util.*;
public class Ex5
{
	public static int num (int n)
	{
		if (n/10==0)
			return 1;
		else
			return num(n/10)+1;
	}
	
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("Enter a positive integer: ");
		int n=in.nextInt();
		System.out.print("Number of digits of "+n+" = "+num(n));		
	}
}