import java.util.*;
public class Ex1 {

	public static void selectionSort(int [] a)
	{
		int n=a.length;
		for (int i=0; i<n-1;i++)
		{
			int min_index=i;
			for (int j=i+1;j<n;j++)
			{
				if (a[j]<a[min_index])
					min_index=j;
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
		}
		System.out.println ("Selection sort:"+Arrays.toString(a));
	}

	public static void bubbleSort(int[] a)
	{
		int n=a.length;
		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-1;j++)
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		}
		System.out.println ("Bubble sort: " +Arrays.toString(a));
	}

	public static void insertionSort (int[] a)
	{
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while (j>=0 && a[i]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println ("Insertion sort: " + Arrays.toString(a));
	}

	public static int[] mergeSort(int[] a,int f, int l)
	{	
		if (f<l)
		{
		int m=(f+l)/2;
		
		mergeSort(a,f,m);
		mergeSort(a,m+1,l);
		}
		return a;
	}

	private static int part(int[] a,int low, int high)
	{
		int pivot=a[high];
		int i=low-1;
		for (int j=low;j<high;j++)
		{
			if (a[j]<=pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		
		return i++;
	}

	public static int[] quickSort (int[] a,int low, int high)
	{
		if (low<high)
		{
			int p=part(a,low,high);
			
			quickSort (a,low,p-1);
			quickSort (a,p+1,high);
		}
		return a;
	} 
	
	public static void main (String[]args)
	{
		int[] a= {5,2,3,8,10,4,6,20,32,11};
		selectionSort(a);
		bubbleSort(a);
		insertionSort(a);
		System.out.println ("Quick sort: " + Arrays.toString(quickSort(a,0,a.length-1)));
		System.out.println ("Merge sort: " + Arrays.toString(mergeSort(a,0,a.length-1)));
	}
	
}
	
	
