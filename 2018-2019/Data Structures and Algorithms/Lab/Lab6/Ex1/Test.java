public class Test {
public static void main(String[] args)
{
	MyLinkedList<Fraction> list = new MyLinkedList<>();
	
	list.addFirst(new Fraction(1, 2));
	list.addLast(new Fraction(3, 4));
	list.print();
	
	list.addFirst(new Fraction(9, 2));
	list.addLast(new Fraction(5, 4));
	list.print();
	
	Node<Fraction> curr=list.getCurr(new Fraction (3,4));
	
	list.addAfter(curr,new Fraction(9,8));
	list.print();
	
	list.removeCurr(curr);
	list.print();
	
	System.out.println("Size="+list.size());
	System.out.println("Contain 2/4? "+list.contains(new Fraction(2,4)));

	
	System.out.println("First="+list.getFirst());
	System.out.println("Empty ? "+list.isEmpty());
	
	Node<Fraction> curr1=list.getCurr(new Fraction (1,2));
	list.removeAfter(curr1);
	list.print();
	
	list.removeFirst();
	list.print();
	
	System.out.println("First="+list.getFirst());
	
	list.removeLast();
	list.print();
	
	
	
	
}
}
