import java.util.*;
import java.lang.Math;

public class P {
	
	public static double pRecursive (double n) {
		if (n<1) throw new RuntimeException ("Underflow error in expression.");
		else if (n==1)	return 3;
		else return Math.pow(2,n)+n*n+pRecursive(n-1);
	}
	
	public static double pStack (double n){
		Stack<Double> s= new Stack <Double>();
		s.push(n);
		double P=3;
		
		while (!s.isEmpty())
		{
			double curr=s.pop();
			if (curr==1)
				return 3;
			
			for (double i=curr;i>1;i--)
			{
				s.push(Math.pow(2,i)+i*i);
				P+=s.pop();
			}
		}
		return P;
	}
	public static void main (String[]args){
		System.out.print("N=");
		Scanner input= new Scanner (System.in);
		double n=input.nextDouble();
		System.out.println("P use recursive="+pRecursive(n));
		System.out.println("P use stack="+pStack(n));

	}
	
	
}