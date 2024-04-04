import java.util.*;
//Ex4,6a,9 not done
//Ex6(b,c),7 not test
public class BST 
{
	private class Node 
{
	Integer key;
	Node left,right;
	int size;
	int height;
	
	public Node(Integer key,int size, int height) 
	{
		this.key=key;
		this.size=size;
		this.height=height;
	}
	
	void insert(int key) 
    { 
        x = insertRec(x, key); 
    }
	
	public Node insertRec (Node x, Integer key)
	{
		if(x==null)
			return(new Node(key,1,1));
			
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			x.left = insertRec(x.left,key);
		else if (cmp > 0)
			x.right = insertRec(x.right,key);
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
        Node node = new Node(arr[mid],1,1); 
  
        /* Recursively construct the left subtree and make it 
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1); 
  
        /* Recursively construct the right subtree and make it 
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end); 
          
        return node; 
    } 
  
    /* A utility function to print inorder traversal of BST */
    void BSTascending(Node node) { 
        if (node == null) { 
            return; 
        } 
        BSTascending(node.left); 
		System.out.print(node.key + " ");
        BSTascending(node.right); 
    } 
	
	public boolean contains(Node root, Integer key)
	{
		if (root == null) return false;
		if (root.key == key) return true;
		if (root.key > key) return contains(root.left, key);
		return contains(root.right, key);
	}
	
	private int heightKey (Node x)
	{
		return x.height;
	}
	
	private int height(Node x)
	{
		if (x == null) 
            return 0; 
        else 
        { 
            int L_height = height(x.left); 
            int R_height = height(x.right); 
   
            if (L_height > R_height) 
				return (L_height + 1); 
            else 
				return (R_height + 1);
		}
	}
	
	public Integer sumKey(Node x)
	{
		return x.key+x.left.key+x.right.key;
	}
	
	public Integer sum(Node root)
	{
		if (root == null) return 0;  
		return (root.key + sum(root.left) + sum(root.right));
	}
      
	public static void main (String[]args)
	{
		BST tree = new BST(); 
		System.out.println("Numbers (split by space):"); 
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
        System.out.println("All the keys of a BST in ascending order:"); 
        tree.BSTascending(root);
		
		System.out.print("\nEnter a key to check if it's in the tree: ");
        int k = scan.nextInt();
		scan.close();
		System.out.println(tree.contains(root,k));
		System.out.print("Sum of all keys in tree: ");
		System.out.println(tree.sum(root));
	}
}
