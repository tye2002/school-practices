import java.util.*;
public class Ex2
{
	public static int fac (int n)
	{
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		else
			return n*fac(n-1);
	}
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("N=");
		int n=in.nextInt();
		System.out.print("Factorial of "+n+" = "+fac(n));		
	}
}