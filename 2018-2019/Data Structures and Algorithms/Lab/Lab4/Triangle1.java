public class Triangle1 extends Shape1 {
	
	private double base;
	private double height;
	
	public Triangle1 ()
	{
		super ();
		this.base=0;
		this.height=0;
	}
	
	public Triangle1 (double base, double height, String color)
	{
		super (color);
		this.base=base;
		this.height=height;
	}
	
	public double getArea ()
	{
		return this.base * this.height *0.5;
	}
	
	public String toString ()
	{
		return "Triangle [base="+base+",height="+height+",color="+color+"]";
	}
}