public class Triangle implements Shape {
	private double base;
	private double height;

	public Triangle ()
	{
		this.base=0;
		this.height=0;
	}
	
	public Triangle (double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	
	public double getArea ()
	{
		return (this.base * this.height) * 0.5;
	}
	
	public String toString ()
	{
		return "Triangle["+"base="+ base +",height="+height+"]";
	}
}