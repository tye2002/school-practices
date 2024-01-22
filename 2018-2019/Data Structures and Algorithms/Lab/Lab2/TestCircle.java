import java.util.*;
public class TestCircle
{
	public static void main (String[]args)
	{
		Circle Cir=new Circle ();
		
		System.out.println ("Circle 1:"+"\r\n"+"Color: " + Cir.getColor()+"\r\n"+"Radius: " + 
		Cir.getRadius()+"\r\n"+"Area: " + Cir.getArea());
		
		Circle Cir1=new Circle (5.00,"yellow");
		System.out.println ("\r\n"+"Circle 2:"+"\r\n"+"Color: " + Cir1.getColor()+"\r\n"+"Radius: " + 
		Cir1.getRadius()+"\r\n"+"Area: " + Cir1.getArea());
	}
}