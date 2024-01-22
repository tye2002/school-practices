import java.util.*;
public class Ex6
{
	public static int a (int n)
	{
		if (n==1)
			return 3;
		else
			return 2*n+1+a(n-1);
	}
	
	public static double b (int n)
	{
		if (n==1)
			return (double)n/2;
		else
			return (double)n/2+b(n-1);
	}
	
	public static int fac (int n)
	{
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		else
			return n*fac(n-1);
	}
	
	public static int c (int n)
	{
		if (n==1)
			return 1;
		else
			return fac(n)+c(n-1);
	}
	
	public static double d (int n)
	{
		if (n==1)
			return 1;
		else
			return Math.sqrt(n)+c(n-1);
	}
	
	public static double e (int n)
	{
		if (n==1)
			return 1;
		else
			return fac(n)*c(n-1);
	}
	
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("N= ");
		int n=in.nextInt();
		System.out.println("Tong (2i+1) khi i tu 1 den "+n+" = "+a(n));		
		System.out.println("Tong (i/2) khi i tu 1 den "+n+" = "+b(n));		
		System.out.println("Tong (i!) khi i tu 1 den "+n+" = "+c(n));		
		System.out.println("Tong sqrt(i) khi i tu 1 den "+n+" = "+d(n));		
		System.out.print("Tich i! khi i tu 1 den "+n+" = "+e(n));		
	}
}