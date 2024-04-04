public class UFDS_Array {
    
	private int[] parent, rank;
	
	public UFDS_Array (int n){
		makeSet(n);
	}
	
	public void makeSet(int n){
		parent = new int[n];
		rank = new int[n];
		for (int i=0; i<n; ++i){
			parent[i] = i;
		}
	}
	
	public int findSet(int i){
		if (parent[i] == i)
			return i;
		else {
			int ret = findSet(parent[i]);
			parent[i] = ret;
			return ret;
		}
	}
	
	public void unionSet(int x, int y){
		int id_x = findSet(x);
		int id_y = findSet(y);
		
		if (id_x != id_y) {
			if (rank[id_x] > rank[id_y])
				parent[id_y] = id_x;
			else {
				parent[id_x] = id_y;
				if (rank[id_x] == rank[id_y])
					rank[id_y] = rank[id_y] + 1;
			}
		}
	}
	
	public int countSet(){
	    int count = 0;
	    for(int i = 0; i < parent.length; ++i){
	        if(parent[i] == i){
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
	    for(int i = 0; i < parent.length; ++i){
	        System.out.print("   " + i);
	    }
	    System.out.println();
	    System.out.print("p[i]");
	    for(int i = 0; i < parent.length; ++i){
	        System.out.print("   " + parent[i]);
	    }
	    System.out.println();
	    System.out.print("r[i]");
	    for(int i = 0; i < parent.length; ++i){
	        System.out.print("   " + rank[i]);
	    }
	   		
	}
	
	public static void main(String[] args)  
	{ 
		UFDS_Array set = new UFDS_Array(10);
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