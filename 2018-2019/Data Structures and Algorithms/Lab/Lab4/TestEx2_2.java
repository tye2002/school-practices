public class TestEx2_2 {
	
	public static void main (String[]args)
	{
		Shape1 s= new Triangle1 (4,5,"black");
		System.out.println (s.toString());
		System.out.println ("Area="+s.getArea());
	}
}