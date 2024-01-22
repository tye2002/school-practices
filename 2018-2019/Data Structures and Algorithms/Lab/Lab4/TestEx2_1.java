public class TestEx2_1 {
	
	public static void main (String[]args)
	{
		Shape s= new Triangle (4,5);
		System.out.println (s.toString());
		System.out.println ("Area= " + s.getArea());
	}
}