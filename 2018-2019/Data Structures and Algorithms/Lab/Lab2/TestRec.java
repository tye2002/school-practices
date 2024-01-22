import java.util.*;
import java.util.Scanner;

public class TestRec
{
	public static void main (String[]args)
	{
		
		Rectangle myRec=new Rectangle ();
		
		System.out.println (myRec.toString());
		System.out.println ("Area= " + myRec.getArea());	
		System.out.println ("Perimeter= " + myRec.getPerimeter());
		
		System.out.println ("\r\n"+"Add another rectangle:");
		
		Scanner input= new Scanner (System.in);
		System.out.print("Length=");
		float length= input.nextFloat();
		System.out.print("Width=");
		float width= input.nextFloat();
		
		myRec.setLength(length);
		myRec.setWidth(width);
		
		System.out.println (myRec.toString());
		System.out.println ("Area= " + myRec.getArea());	
		System.out.println ("Perimeter= " + myRec.getPerimeter());
	}
}