import java.util.*;

public interface QueueInterface<E> 
{
	public boolean isEmpty ();
	
	public E peek();
	
	public E poll() throws EmptyStackException;
	
	public void offer (E item);
	
	public void print();
	
	public int size();
	
	public boolean contains(E item);
}