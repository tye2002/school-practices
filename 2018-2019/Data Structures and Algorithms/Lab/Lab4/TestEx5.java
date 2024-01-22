public class TestEx5 {
	
	public static void main (String[]args)
	{
		Movable m1 = new MovablePoint(5, 6, 10,20);     
		System.out.println(m1.toString());
		m1.moveUp();
		System.out.println(m1.toString());
   
		Movable m2 = new MovableCircle(2, 1, 2, 20,30); 
		System.out.println(m2.toString());
		m2.moveRight();
		System.out.println(m2.toString());

	}
}