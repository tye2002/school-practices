import java.util.*;

// Question 1: Wirte a code with the description of the UML chart
public class Main 
{
    public static void main (String [] args) 
	{
        Circle c = new Circle ();
		Circle c1= new Circle (c);
		Circle c2= new Circle (5.6);
		Cylinder c3 = new Cylinder ();
		Cylinder c4= new Cylinder (5.9,7.6);
		Cylinder c5= new Cylinder (c4);
		System.out.println (c.getArea()+" "+c1.getArea()+" "+c.getPerimeter()+" "+c1.getPerimeter());
		System.out.println (c2.getArea()+" "+c2.getPerimeter());
		System.out.println (c3.getVol()+" "+c4.getVol()+" "+c3.getPerimeter()+" "+c4.getPerimeter());
		System.out.println (c5.getVol()+" "+c5.getPerimeter());
		System.out.println (c4.getLSurface()+" "+c5.getLSurface());
		System.out.println (c.toString());
		System.out.println (c1.toString());
		System.out.println (c2.toString());
		System.out.println (c3.toString());
		System.out.println (c4.toString());
		System.out.println (c5.toString());
    }
}
