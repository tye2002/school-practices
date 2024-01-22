import java.util.*;

public class Test {
    public static void main (String [] args) {
        Accountant acc1 = new Accountant ();
        Accountant acc2 = new Accountant ("ThienAn","A34",5,150);
        System.out.println(acc1.toString ()+" "+acc2.toString ());
        Salesman sl1 = new Salesman ();
        Salesman sl2 = new Salesman ("GianY","A53",4,5);
		System.out.println(sl1.toString ()+" "+sl2.toString ());
		Accountant acc3= new Accountant (acc2);
		Salesman sl3= new Salesman (sl2);
		System.out.println (acc3.toString()+" "+sl3.toString());
		

    }
}
