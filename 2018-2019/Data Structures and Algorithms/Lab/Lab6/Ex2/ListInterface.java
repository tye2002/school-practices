import java.util.NoSuchElementException;

public interface ListInterface<Integer>
{
	public void add(int number);
	public void print();
	public boolean isEmpty();
	public int getSize();
	public int countEven();
	public int countOdd();
	
}