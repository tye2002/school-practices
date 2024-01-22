import java.util.Scanner;


public class Ex31
{
	public static void main (String[]args)
	{
		int[] arr;
		arr= new int[100];
		Scanner input=new Scanner (System.in);
		System.out.println ("Enter a size of array:");
		int n=input.nextInt();
		System.out.println("Enter elements of array:");
		
		for (int i=0;i<n;i++)
			arr[i]=input.nextInt();
		
		System.out.println ("Array:");
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");	
			
		System.out.println ("Sum of even numbers in array:"+sum(arr,n));
	}
	public static int sum (int arr[],int n)
	{
		int sum=0;
		for (int i=0;i<n;i++)
		{
			if (arr[i]%2==0)
				sum+=arr[i];
		}
		return sum;
	}
	
}