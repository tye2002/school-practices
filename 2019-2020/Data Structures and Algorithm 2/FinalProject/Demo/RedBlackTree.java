import java.util.*;

class Node {
	int key;
	Node parent; 
	Node L; // left child
	Node R; // right child
	int color; // black: 0; red: 1
}

public class RedBlackTree {
	private Node root;
	private Node NULL;

	private void traversal_pre(Node node) {
		if (node != NULL) {
			System.out.print(node.key + " ");
			traversal_pre(node.L);
			traversal_pre(node.R);
		} 
	}

	private void traversal_in(Node node) {
		if (node != NULL) {
			traversal_in(node.L);
			System.out.print(node.key + " ");
			traversal_in(node.R);
		} 
	}

	private void traversal_post(Node node) {
		if (node != NULL) {
			traversal_post(node.L);
			traversal_post(node.R);
			System.out.print(node.key + " ");
		} 
	}

	private Node search(Node node, int key) {
		if (node == NULL || key == node.key) {
			return node;
		}

		if (key < node.key) {
			return search(node.L, key);
		} 
		return search(node.R, key);
	}

	// fix the rb tree modified by the delete operation
	private void fixDelete(Node x) {
		Node s;
		while (x != root && x.color == 0) {
			if (x == x.parent.L) {
				s = x.parent.R;
				if (s.color == 1) {
					// case 2
					s.color = 0;
					x.parent.color = 1;
					rotateLeft(x.parent);
					s = x.parent.R;
				}

				if (s.L.color == 0 && s.R.color == 0) {
					// case 3
					s.color = 1;
					x = x.parent;
				} else {
					if (s.color == 0 && x.parent.color == 1){
						//case 4
						s.color = 1;
						x.parent.color = 0;
					}

					if (s.R.color == 0) {
						// case 5
						s.L.color = 0;
						s.color = 1;
						rotateRight(s);
						s = x.parent.R;
					} 

					// case 6
					s.color = x.parent.color;
					x.parent.color = 0;
					s.R.color = 0;
					rotateLeft(x.parent);
					x = root;
				}
			} else {
				s = x.parent.L;
				if (s.color == 1) {
					// case 2
					s.color = 0;
					x.parent.color = 1;
					rotateRight(x.parent);
					s = x.parent.L;
				}

				if (s.R.color == 0 && s.R.color == 0) {
					// case 3
					s.color = 1;
					x = x.parent;
				} else {
					if (s.color == 0 && x.parent.color == 1){
						//case 4
						s.color = 1;
						x.parent.color = 0;
					}
					if (s.L.color == 0) {
						// case 5
						s.R.color = 0;
						s.color = 1;
						rotateLeft(s);
						s = x.parent.L;
					} 

					// case 6
					s.color = x.parent.color;
					x.parent.color = 0;
					s.L.color = 0;
					rotateRight(x.parent);
					x = root;
				}
			} 
		}
		x.color = 0;
	}


	private void replace(Node u, Node v){
		if (u.parent == null) {
			root = v;
		} else if (u == u.parent.L){
			u.parent.L = v;
		} else {
			u.parent.R = v;
		}
		v.parent = u.parent;
	}

	private void delete(Node node, int key) {
		// find the node containing key
		Node z = NULL;
		Node x, y;
		while (node != NULL){
			if (node.key == key) {
				z = node;
			}

			if (node.key <= key) {
				node = node.R;
			} else {
				node = node.L;
			}
		}

		if (z == NULL) {
			System.out.println("Couldn't find key in the tree");
			return;
		} 

		y = z;
		int yOriginalColor = y.color;
		if (z.L == NULL) {
			x = z.R;
			replace(z, z.R);
		} else if (z.R == NULL) {
			x = z.L;
			replace(z, z.L);
		} else {
			y = min(z.R);
			yOriginalColor = y.color;
			x = y.R;
			if (y.parent == z) {
				x.parent = y;
			} else {
				replace(y, y.R);
				y.R = z.R;
				y.R.parent = y;
			}

			replace(z, y);
			y.L = z.L;
			y.L.parent = y;
			y.color = z.color;
		}
		if (yOriginalColor == 0){
			fixDelete(x);
		}
	}
	
	// fix the red-black tree
	private void fixInsert(Node k){
		Node u;
		while (k.parent.color == 1) {
			if (k.parent == k.parent.parent.R) {
				u = k.parent.parent.L; // uncle
				if (u.color == 1) {    // case 2
					u.color = 0;
					k.parent.color = 0;
					k.parent.parent.color = 1;
					k = k.parent.parent;
				} else {
					if (k == k.parent.L) {
						// case 3.1
						k = k.parent;
						rotateRight(k);
					}
					// case 3.2
					k.parent.color = 0;
					k.parent.parent.color = 1;
					rotateLeft(k.parent.parent);
				}
			} else {
				u = k.parent.parent.R; // uncle

				if (u.color == 1) {
					// mirror case 2
					u.color = 0;
					k.parent.color = 0;
					k.parent.parent.color = 1;
					k = k.parent.parent;	
				} else {
					if (k == k.parent.R) {
						// mirror case 3.1
						k = k.parent;
						rotateLeft(k);
					}
					// mirror case 3.2
					k.parent.color = 0;
					k.parent.parent.color = 1;
					rotateRight(k.parent.parent);
				}
			}
			if (k == root) {
				break;
			}
		}
		root.color = 0;
	}

	private void print(Node root, String indent, boolean last) {
		// print the tree structure on the screen
	   	if (root != NULL) {
		   System.out.print(indent);
		   if (last) {
		      System.out.print("R----");
		      indent += "     ";
		   } else {
		      System.out.print("L----");
		      indent += "|    ";
		   }
            
           String sColor = root.color == 1?"RED":"BLACK";
		   System.out.println(root.key + "(" + sColor + ")");
		   print(root.L, indent, false);
		   print(root.R, indent, true);
		}
	}

	public RedBlackTree() {
		NULL = new Node();
		NULL.color = 0;
		NULL.L = null;
		NULL.R = null;
		root = NULL;
	}

	// Pre-Order traversal
	// Node.L Subtree.R Subtree
	public void pre() {
		traversal_pre(this.root);
	}

	// In-Order traversal
	// L Subtree . Node . R Subtree
	public void in() {
		traversal_in(this.root);
	}

	// Post-Order traversal
	// L Subtree . R Subtree . Node
	public void post() {
		traversal_post(this.root);
	}

	// search the tree for the key k
	// and return the corresponding node
	public Node searchTree(int k) {
		return search(this.root, k);
	}

	// find the node with the min key
	public Node min(Node node) {
		while (node.L != NULL) {
			node = node.L;
		}
		return node;
	}

	// find the node with the max key
	public Node max(Node node) {
		while (node.R != NULL) {
			node = node.R;
		}
		return node;
	}

	// find the successor of a given node
	public Node successor(Node x) {
		// if the R subtree is not null,
		// the successor is the Lmost node in the
		// R subtree
		if (x.R != NULL) {
			return min(x.R);
		}

		// else it is the lowest ancestor of x whose
		// L child is also an ancestor of x.
		Node y = x.parent;
		while (y != NULL && x == y.R) {
			x = y;
			y = y.parent;
		}
		return y;
	}

	// find the predecessor of a given node
	public Node predecessor(Node x) {
		// if the L subtree is not null,
		// the predecessor is the Rmost node in the 
		// L subtree
		if (x.L != NULL) {
			return max(x.L);
		}

		Node y = x.parent;
		while (y != NULL && x == y.L) {
			x = y;
			y = y.parent;
		}

		return y;
	}

	// rotate L at node x
	public void rotateLeft(Node x) {
		Node y = x.R;
		x.R = y.L;
		if (y.L != NULL) {
			y.L.parent = x;
		}
		y.parent = x.parent;
		if (x.parent == null) {
			this.root = y;
		} else if (x == x.parent.L) {
			x.parent.L = y;
		} else {
			x.parent.R = y;
		}
		y.L = x;
		x.parent = y;
	}

	// rotate R at node x
	public void rotateRight(Node x) {
		Node y = x.L;
		x.L = y.R;
		if (y.R != NULL) {
			y.R.parent = x;
		}
		y.parent = x.parent;
		if (x.parent == null) {
			this.root = y;
		} else if (x == x.parent.R) {
			x.parent.R = y;
		} else {
			x.parent.L = y;
		}
		y.R = x;
		x.parent = y;
	}

	// insert the key to the tree in its appropriate position
	// and fix the tree
	public void insert(int key) {
		// Ordinary Binary Search Insertion
		Node node = new Node();
		node.parent = null;
		node.key = key;
		node.L = NULL;
		node.R = NULL;
		node.color = 1; // new node must be red

		Node y = null;
		Node x = this.root;

		while (x != NULL) {
			y = x;
			if (node.key < x.key) {
				x = x.L;
			} else {
				x = x.R;
			}
		}

		// y is parent of x
		node.parent = y;
		if (y == null) {
			root = node;
		} else if (node.key < y.key) {
			y.L = node;
		} else {
			y.R = node;
		}

		// if new node is a root node, simply return
		if (node.parent == null){
			node.color = 0;
			return;
		}

		// if the grandparent is null, simply return
		if (node.parent.parent == null) {
			return;
		}

		// Fix the tree
		fixInsert(node);
	}

	public Node getRoot(){
		return this.root;
	}

	// delete the node from the tree
	public void deleteNode(int key) {
		delete(this.root, key);
	}

	// print the tree structure on the screen
	public void printTree() {
        print(this.root, "", true);
	}
	
	public static void main(String [] args){
    	RedBlackTree bst = new RedBlackTree();
		System.out.println("Insert 30");
        bst.insert(30);
    	bst.printTree();
		System.out.println("Insert 15");
    	bst.insert(15);
    	bst.printTree();
		System.out.println("Insert 6");
    	bst.insert(6);
    	bst.printTree();
		System.out.println("Insert 96");
    	bst.insert(96);
    	bst.printTree();
		System.out.println("Insert 32");
    	bst.insert(32);
    	bst.printTree();
		System.out.println("Insert 10");
    	bst.insert(10);
    	bst.printTree();
		System.out.println("Insert 45");
    	bst.insert(45);
    	bst.printTree();
		System.out.println("Insert 70");
    	bst.insert(70);
    	bst.printTree();
		System.out.println("Delete 5");
    	bst.deleteNode(5);
		bst.printTree();
		System.out.println("Delete 6");
    	bst.deleteNode(6);
		bst.printTree();
		System.out.println("Delete 32");
    	bst.deleteNode(32);
    	bst.printTree();
		System.out.println("Delete 15");
    	bst.deleteNode(15);
    	bst.printTree();
	}
}