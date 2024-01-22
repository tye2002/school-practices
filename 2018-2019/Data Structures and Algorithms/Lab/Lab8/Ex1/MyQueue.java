import java.util.*;

class MyQueue <E> implements QueueInterface<E> 
{
	private TailedLinkedList<E> list;
	
	public MyQueue ()
	{
		list=new TailedLinkedList <E> ();
	}
	
	public boolean isEmpty ()
	{
		return list.isEmpty();
	}
	
	public void offer (E item)
	{
		list.addLast(item);
	}
	
	public E peek() 
	{
		if (isEmpty())
			return null;
		return list.getFirst();
	}
	
	public E poll () throws EmptyStackException
	{
		E item=peek();
		if (!isEmpty())
			list.removeFirst();
		return item;
	}
	
	public void print()
	{
		list.print();
	}
	
	public int size()
	{
		return list.size();
	}
	
	public boolean contains(E item)
	{
		return list.contains(item);
	}
}