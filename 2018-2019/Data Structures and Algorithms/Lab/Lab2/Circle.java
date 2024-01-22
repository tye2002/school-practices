public class Circle
{
	private double radius;
	private String color;
	
	public Circle ()
	{
		this (1.0,"red");
	}
	
	public Circle (double radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	public double Circle (double r)
	{
		r=r*r*3.14;
		return r;
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public String getColor ()
	{
		return color;
	} 
	
	public double getArea ()
	{
		double r;
		r=this.radius;
		return Circle(r);
	}
}