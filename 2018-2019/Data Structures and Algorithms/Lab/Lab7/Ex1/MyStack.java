import java.util.*;

class MyStack<E> implements StackInterface<E> 
{
	private MyLinkedList<E> list;
	
	public MyStack ()
	{
		list= new MyLinkedList <E> ();
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public E peek () throws EmptyStackException 
	{
		try
		{
			return list.getFirst();
		}
		catch (NoSuchElementException e)
		{
			throw new EmptyStackException();
		}
	}
	
	public E pop () throws EmptyStackException
	{
		E tmp=peek ();
		list.removeFirst();
		return tmp;
	}
	
	public void push (E item)
	{
		list.addFirst(item);
	}
	
	public void print()
	{
		list.print();
	}
	
	public Node <E> getHead()
	{
		return list.getHead();
	}
	
	public int size()
	{
		return list.size();
	}
	
	@Override
	public boolean contains(E item)
	{
		return list.contains(item);
	}
}