import java.util.Scanner;


public class Ex28
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
		System.out.println("");
		System.out.println ("Min number in array:"+min(arr,n));
	}
	
	public static int min(int arr[],int n)
	{
		int min=arr[0];
		for (int i=0;i<n;i++)
		{
			if (min>arr[i])
				min=arr[i];
		}
		return min;
		
	}
	
}