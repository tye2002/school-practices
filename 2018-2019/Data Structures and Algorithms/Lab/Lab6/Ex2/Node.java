public class Node<Integer>
{	
	private int data;
	private Node<Integer> next;
	
	public Node()
	{
		data = 0;
		next = null;
	}

	public Node(int data)
	{
		this.data=data;
	}

	public void setNext(Node<Integer> n)
	{
		next = n;
	}

	public boolean hasNext()
	{
		return next!=null;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}

	
}
