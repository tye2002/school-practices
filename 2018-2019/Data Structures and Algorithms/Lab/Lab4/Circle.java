public class Circle extends Shape2 {
	
	protected double radius;
	
	public Circle ()
	{
		super();
		this.radius=0;
	}
	
	public Circle (double radius, String color, boolean filled)
	{
		super (color,filled);
		this.radius=radius;
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public void setRadius (double radius)
	{
		this.radius=radius;
	}
	
	public double getArea ()
	{
		return this.radius * this.radius * 3.14;
	}
	
	public double getPerimeter ()
	{
		return this.radius *3.14*2;
	}
	
	public String toString ()
	{
		return "Circle [radius="+radius+
		",color="+color+
		",filled="+filled+"]";
	}
}