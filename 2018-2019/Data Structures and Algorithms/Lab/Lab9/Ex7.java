import java.util.*;

public class Ex7 {
	public static int find (int n, int a[])
	{
		if (n==1)
			return a[0];
		return Math.min(a[n-1],find(n-1,a));
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
		System.out.println("Minium element in array is "+find(n,A)); 
	}
}