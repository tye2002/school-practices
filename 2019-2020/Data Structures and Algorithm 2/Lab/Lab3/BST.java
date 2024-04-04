import java.util.*;

public class BST 
{
	private class Node 
	{
		Integer key;
		Node left,right;
		int size;
		int height;
		
		public Node(Integer key,int size) 
		{
			this.key=key;
			this.size=size;
		}
	}
	
	public Node insert (Node x,Integer key)
	{
		if(x==null)
			return(new Node(key,1));
			
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = insert(x.left,key);
		else if (cmp > 0)
			x.right = insert(x.right,key);
		else 
			x.key = key;
			x.size = 1 + x.left.size + x.right.size;
		return x;
	}
	
	public void nlr(Node x)
	{
		if (x!=null)
		{
			System.out.print(x.key + " ");
			nlr(x.left);
			nlr(x.right);
		}
	}
	
	public void lnr(Node x)
	{
		if (x!=null)
		{
			lnr(x.left);
			System.out.print(x.key+" ");
			lnr(x.right);
		}
	}
	
	public void lrn(Node x)
	{
		if (x!=null)
		{
			lrn(x.left);
			lrn(x.right);
			System.out.print(x.key+" ");
		}
	}
	
	private Node search (Node x, Integer key)
	{
		if (x==null) return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			return search (x.left,key);
		else if (cmp > 0)
			return search (x.right,key);
		else
			return x;
	}
	
	private Node min (Node x)
	{
		if (x.left == null)
			return x;
		else
			return min(x.left);
	}
	
	private Node max (Node x)
	{
		if (x.right == null)
			return x;
		else
			return max (x.right);
	}
	
	static Node root; 
  
    /* A function that constructs Balanced Binary Search Tree  
     from a sorted array */
    Node sortedArrayToBST(Integer arr[], int start, int end) { 
  
        /* Base Case */
        if (start > end) { 
            return null; 
        } 
  
        /* Get the middle element and make it root */
        int mid = (start + end) / 2; 
        Node node = new Node(arr[mid],1); 
  
        /* Recursively construct the left subtree and make it 
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1); 
  
        /* Recursively construct the right subtree and make it 
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end); 
          
        return node; 
    } 
    
	void inorder() 
    { 
        lnr(root); 
    } 
	
	public Node deleteM(Node x)
	{
		if (x.right==null)
			return x.left;
		x.right=deleteM(x.right);
		return x;
	}
	
	void deleteMax()
	{
		deleteM(root);
	}
	
	void delete1(Integer key) 
    { 
        root = deleteKey(root, key); 
    } 
  
    /* A recursive function to insert a new key in BST */
    Node deleteKey(Node x, Integer key) 
    { 
        /* Base Case: If the tree is empty */
        if (x == null)  return x; 
  
        /* Otherwise, recur down the tree */
        if (key < x.key) 
            x.left = deleteKey(x.left, key); 
        else if (key > x.key) 
            x.right = deleteKey(x.right, key); 
  
        // if key is same as x's key, then This is the node to be deleted 
        else
        { 
            // node with only one child or no child 
            if (x.left == null) 
                return x.right; 
            else if (x.right == null) 
                return x.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            x.key = minValue(x.right); 
  
            // Delete the inorder successor 
            x.right = deleteKey(x.right, x.key); 
        } 
        return x; 
    } 
	
	int minValue(Node x) 
    { 
        int minv = x.key; 
        while (x.left != null) 
        { 
            minv = x.left.key; 
            x = x.left; 
        } 
        return minv; 
    } 
	
	public static void main (String[]args)
	{
		BST tree = new BST();  
		System.out.println("Insert numbers to tree (split by space):"); 
        Scanner scan = new Scanner(System.in);
		String s="";
		s+=scan.nextLine();
		
		String[] s_split = s.split(" ");
		int s_size=s_split.length;
		
        Integer [] arr = new Integer[s_size];
		for(int i=0; i<s_size; i++) 
		{
			arr[i] = Integer.parseInt(s_split[i]);
		}
		Arrays.sort(arr);
        int n = arr.length; 
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("\nInorder traversal of the given tree"); 
        tree.inorder();
		System.out.println("\n\nDelete max");
		tree.deleteMax();
		System.out.println("\nInorder traversal of the modified tree"); 
        tree.inorder();
		System.out.println("\n\nDelete 50");
		tree.delete1(50);
		System.out.println("\nInorder traversal of the modified tree"); 
		tree.inorder();

		
	}
}
