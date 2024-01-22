import java.util.*;
public class Ex3
{
	public static int pow (int n)
	{
		if (n==0)
			return 1;
		if (n==1)
			return 2;
		else
			return 2*pow(n-1);
	}
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("N=");
		int n=in.nextInt();
		System.out.print("2^"+n+" = "+pow(n));		
	}
}