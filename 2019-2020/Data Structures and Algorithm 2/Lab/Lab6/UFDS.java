import java.util.*;
public class UFDS {
	private Vector<Integer> parent,rank;
	
	public UFDS (int n){
		makeSet(n);
	}
	
	public void makeSet(int n){
		parent = new Vector<Integer>(n);
		rank = new Vector<Integer>(n);
		for (int i=0; i<n; i++){
			parent.add(i);
			rank.add(0);
		}
	}
	
	public int findSet(int i){
		if (parent.get(i) == i)
			return i;
		else {
			int ret = findSet(parent.get(i));
			parent.set(i,ret);
			return ret;
		}
	}
	
	public void unionSet (int x, int y){
		int id_x = findSet(x);
		int id_y = findSet(y);
		
		if (id_x != id_y) {
			if (rank.get(id_x) > rank.get(id_y))
				parent.set(id_y,id_x);
			else {
				parent.set(id_x,id_y);
				if (rank.get(id_x) == rank.get(id_y))
					rank.set(id_y, rank.get(id_y)+1);
			}
		}
	}
	public int countSet(){
	    int count = 0;
	    for(int i = 0; i < parent.size(); ++i){
	        if(parent.get(i) == i){
	            ++count;
	        }
	    }
	    return count;
	}
	
	public boolean isSameSet(int x, int y){
	    return findSet(x) == findSet(y);
	}
	
	public void print(){
		System.out.println("===========UFDS===========");
	    
	    System.out.print("i   ");
	    for(int i = 0; i < parent.size(); ++i){
	        System.out.print("   " + i);
	    }
	    System.out.println();
	    System.out.print("p[i]");
	    for(int i = 0; i < parent.size(); ++i){
	        System.out.print("   " + parent.get(i));
	    }
	    System.out.println();
	    System.out.print("r[i]");
	    for(int i = 0; i < parent.size(); ++i){
	        System.out.print("   " + rank.get(i));
	    }
	   		
	}
	
	public static void main(String[] args)  
	{ 
		UFDS set = new UFDS(10);  	  
		set.unionSet(8, 9);
		set.unionSet(0, 1);
		set.unionSet(1, 9);
		set.unionSet(3, 4);
		set.unionSet(4, 9);
		set.unionSet(5, 9);
		set.unionSet(6, 7);
		set.unionSet(7, 9);
		set.print();
	}
}

