import java.util.*;
import java.util.Scanner;

public class TestIn
{
	public static void main (String[]args)
	{
		Scanner input= new Scanner (System.in);
		
		System.out.println ("ID of item:");
		String ID=input.nextLine();
		
		System.out.println ("Description of item:");
		String desc=input.nextLine();
		
		System.out.println ("Quantity of item:");
		int qty=input.nextInt();
		
		System.out.println ("Price of 1 item:");
		double price=input.nextDouble();
				
		InvoiceItem ite= new InvoiceItem (ID,desc,qty,price);
		
		System.out.println (ite.toString());
		System.out.println ("Total price: "+ite.getTotal());
		
		System.out.println ("\r\nChange quantity and price:");
		qty=input.nextInt();
		ite.setQty(qty);
		price=input.nextDouble();
		ite.setUnitPrice(price);
		
		System.out.println (ite.toString());
		System.out.println ("Total price after changing quantity and price: "+ite.getTotal());
		
	}
}