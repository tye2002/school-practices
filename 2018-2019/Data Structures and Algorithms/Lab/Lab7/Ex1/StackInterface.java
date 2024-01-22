import java.util.NoSuchElementException;

public interface StackInterface <E> 
{
	public E peek () throws NoSuchElementException;
	public void push (E item);
	public E pop () throws NoSuchElementException;
	public void print();
	public boolean isEmpty();
	public Node <E> getHead();
	public int size();
	public boolean contains(E item);
}