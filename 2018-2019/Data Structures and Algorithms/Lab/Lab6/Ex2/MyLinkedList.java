import java.util.NoSuchElementException;

public class MyLinkedList<Integer> implements ListInterface<Integer>
{
	private Node<Integer> head;
	public int size;
	
	public MyLinkedList()
	{
		this.head = null;
		this.size=0;
	}
	
	@Override
	public void add(int number)
	{
		Node<Integer> t=new Node<Integer>(number);
		t.setNext(head);
		head=t;
		size++;
	}
	
	public void print()
	{
		if(head != null)
		{
			Node<Integer> tmp = head;
			System.out.print("List: " + tmp.getData());
			tmp = tmp.getNext();
			while(tmp != null)
			{
				System.out.print(" -> " + tmp.getData());
				tmp = tmp.getNext();
			}
			System.out.println();
		}
		else
		{
			System.out.println("List is empty!");
		}
	}
	
	public boolean isEmpty()
	{
		if(size == 0) return true;
			return false;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int size)
	{
		this.size=size;
	}
	
	public int countEven()
	{
		Node<Integer> list=head;
		int c=0;
		for (int i=1;i<=getSize();i++)
		{
			if ((list.getData())%2==0)
			{
				c++;
			}
			list=list.getNext();
		}
		return c;
	}
	
	public int countOdd()
	{
		Node<Integer> list=head;
		int c=0;
		for (int i=1;i<=getSize();i++)
		{
			if ((list.getData())%2!=0)
			{
				c++;
			}
			list=list.getNext();
		}
		return c;
	}
}

	