import java.util.*;
public class Ex4
{
	public static int pow (int x, int n)
	{
		if (n==0)
			return 1;
		if (n==1)
			return x;
		else
			return x*pow(x,n-1);
	}
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("X=");
		int x=in.nextInt();
		System.out.print ("N=");
		int n=in.nextInt();
		System.out.print(x+"^"+n+" = "+pow(x,n));		
	}
}