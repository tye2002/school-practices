public class TestEx3 {
	
	public static void main (String[]args)
	{
		Shape2 s1= new Circle (3,"black",true);
		System.out.println (s1.toString());
		System.out.println ("Area="+s1.getArea()+
							"\r\nPerimeter="+s1.getPerimeter());
							
		s1= new Rectangle (3,4,"black",true);
		System.out.println (s1.toString());
		System.out.println ("Area="+s1.getArea());
		
		s1= new Square (3,"black",true);
		System.out.println (s1.toString());
		System.out.println ("Area="+s1.getArea());
	}
}