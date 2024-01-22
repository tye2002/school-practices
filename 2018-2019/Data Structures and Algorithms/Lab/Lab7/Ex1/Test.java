import java.util.*;
public class Test {
	public static void main (String[]args) {
		MyStack <Fraction> s= new MyStack <Fraction> ();
		System.out.println ("Stack is empty ?"+ s.isEmpty());
		s.push(new Fraction (3,4));
		s.push(new Fraction (5,6));
		s.print();
		System.out.println ("Top of stack is "+ s.peek());
		s.push(new Fraction (9,10));
		s.print();
		System.out.println ("Top of stack is and pop it "+ s.pop());
		s.push(new Fraction (2,8));
		s.print();
		s.pop();
		s.print();
		s.pop();
		s.print();
		System.out.println ("Top of stack is "+ s.peek());
		s.print();
		System.out.println ("Stack contains 3/4 ? "+ s.contains(new Fraction(3,4)));
		s.print();
		


	}
}