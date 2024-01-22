import java.util.*;

public class Ex8 {
	public static int sum (int n, int a[])
	{
		if (n==1)
			return a[0];
		return a[n-1]+sum(n-1,a);
	}
	
	public static void main (String[]args)
	{
		Scanner in= new Scanner (System.in);
		System.out.print ("size of array: ");
		int n=in.nextInt();
		int A[]=new int[n];
		System.out.println("Enter array:");
		for (int i=0;i<n;i++)
		{
			int x=in.nextInt();
			A[i]=x;
		}
		System.out.println("Sum of all elements in array is "+sum(n,A)); 
	}
}