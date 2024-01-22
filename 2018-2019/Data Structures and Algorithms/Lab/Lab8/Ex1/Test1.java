import java.util.*;
public class Test1 {
	public static void main (String[]args) {
		MyQueue <Fraction> s= new MyQueue <Fraction> ();
		System.out.println ("Queue is empty ?"+ s.isEmpty());
		s.offer(new Fraction (3,4));
		s.offer(new Fraction (5,6));
		s.offer(new Fraction (1,6));
		s.offer(new Fraction (5,4));
		s.offer(new Fraction (15,16));

		s.print();
		System.out.println("Top of queue is "+ s.peek());
		s.offer(new Fraction (9,10));
		s.print();
		s.poll();
		
		s.offer(new Fraction (2,8));
		s.print();
		s.poll();
		s.poll();
		System.out.println ("Top of queue is "+ s.peek());
		s.print();
		System.out.println("Queue contains 3/4 ? "+ s.contains(new Fraction(3,4)));
		s.print();
		


	}
}