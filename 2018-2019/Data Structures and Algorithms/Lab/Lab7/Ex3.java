import java.util.*;
public class Ex3 {
	
	public static void main (String[]args){
		
		Stack s = new Stack();
		Scanner input=new Scanner (System.in);
		System.out.print("The amount of characters: ");
		int n=input.nextInt();
		System.out.print("Enter "+n+" characters: ");
		for (int i=1;i<=n;i++)
		{
			String c=input.next();
			s.push(c);
		}
		System.out.print("Reverse: ");
		for (int i=1;i<=n;i++)
		{
			Object a=s.pop();
			System.out.print(a+" ");
		}
        }
}