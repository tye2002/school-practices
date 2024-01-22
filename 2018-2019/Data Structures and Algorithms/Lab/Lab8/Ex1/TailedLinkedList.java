import java.util.NoSuchElementException;

public class TailedLinkedList<E> implements ListInterface<E> 
{
	private Node <E> head;
	private Node <E> tail;
	private int numNode;
	
	public TailedLinkedList()
	{
		head = null;
		tail=null;
		numNode = 0;
	}
	
	@Override
	public void addFirst(E item)
	{
		head = new Node<E>(item, head);
		numNode++;
		if (numNode==1)
			tail=head;
	}
	
	@Override
	public void addAfter(Node<E> curr, E item)
	{
		if(curr == null)
		{
			head= new Node<E> (item,head);
			if (tail==null)
				tail=head;
		}
		else
		{
			curr.setNext(new Node<E>(item, curr.getNext()));
			if (curr==tail)
				tail=curr.getNext();
		}
		
		numNode++;
	}
	
	@Override
	public void addLast(E item)
	{
		if(head != null)
		{
			tail.setNext(new Node <E> (item));
			tail=tail.getNext();	
		}
		else
		{
			tail=new Node<E>(item);
			head=tail;
		}
		numNode++;
	}
	
	@Override
	public E removeFirst() throws NoSuchElementException
	{
		return removeAfter(null);
	}
	
	@Override
	public E removeAfter(Node<E> curr) throws NoSuchElementException
	{
		E tmp;
		if(curr == null)
		{
			if (head!=null)
			{
				tmp=head.getData();
				head=head.getNext();
				numNode--;
				if (head==null)
					tail=null;
				return tmp;
			}
			else
			{
				throw new NoSuchElementException("Can't remove element from an empty list");
			}
		}
		else
		{
			Node<E> delNode = curr.getNext();
			if(delNode != null)
			{
				tmp= delNode.getData();
				if (delNode.getNext()==null)
					tail=curr;
				curr.setNext(delNode.getNext());
				numNode--;
				return tmp;
				
			}
			else
			{
				throw new NoSuchElementException("No next node to remove");
			}	
		}
	}
	
	@Override
	public E removeLast() throws NoSuchElementException
	{
		if(head == null)
		{
			throw new NoSuchElementException("Can't remove element from an empty list");
		}	
		else
		{
			Node<E> preNode = null;
			Node<E> delNode = head;
			while(delNode.getNext() != null)
			{
				preNode = delNode;
				delNode = delNode.getNext();
			}
			preNode.setNext(delNode.getNext());
			delNode.setNext(null);
			numNode--;
			return delNode.getData();
		}
	}
	
	@Override
	public void print() throws NoSuchElementException
	{
		if (head==null)
			throw new NoSuchElementException ("List is empty");
		Node <E> tmp=head;
		System.out.print("List:"+tmp.getData());
		for (int i=1;i<numNode;i++)
		{
			tmp=tmp.getNext();
			System.out.print("->"+tmp.getData());
		}
	}
	
	@Override
	public boolean isEmpty()
	{
		if(numNode == 0) return true;
			return false;
	}
	
	@Override
	public E getFirst() throws NoSuchElementException
	{
		if(head == null)
		{
			throw new NoSuchElementException("Can't get element from an empty list");
		}
		else
		{
			return head.getData();
		}
	}
	public Node<E> getHead()
	{
		return head;
	}
	
	
	public Node <E> getTail()
	{
		return tail;
	}
	
	@Override
	public int size()
	{
		return numNode;
	}
	
	@Override
	public boolean contains(E item)
	{
		Node<E> tmp = head;
		while(tmp != null)
		{
			if(tmp.getData().equals(item))
				return true;
			tmp = tmp.getNext();
		}
		return false;
	}
}

