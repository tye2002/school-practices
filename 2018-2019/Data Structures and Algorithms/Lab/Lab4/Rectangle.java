public class Rectangle extends Shape2 {
	
	protected double length;
	protected double width;
	
	public Rectangle ()
	{
		super();
		this.length=0;
		this.width=0;
	}
	
	public Rectangle (double width, double length)
	{
		this.length=length;
		this.width=width;
	}
	
	public Rectangle ( double width,double length,String color, boolean filled)
	{
		this.length=length;
		this.width=width;
		this.color=color;
		this.filled=filled;
	}
	
	public double getWidth ()
	{
		return width;
	}
	
	public void setWidth (double width)
	{
		this.width=width;
	}
	
	public double getLength ()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length=length;
	}
	
	public double getArea ()
	{
		return this.length*this.width;
	}
	
	public double getPerimeter ()
	{
		return (this.length+this.width)*2;
	}
	
	public String toString ()
	{
		return "Rectangle [length="+length+",width="+width+
		",color="+color+
		",filled="+filled+"]";
	}
}