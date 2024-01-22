import java.util.*;
public class Test1 
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<>();
		Scanner input= new Scanner (System.in);
		System.out.println("Enter size of list:");
		int n=input.nextInt();
		System.out.println("Enter a list of integers:");
		for (int i=1;i<=n;i++)
		{
			int k=input.nextInt();
			list.add(k);
		}
		list.print();
		System.out.println("Even= "+list.countEven());
		System.out.println("Odd= "+list.countOdd());
		
		
	}
}
