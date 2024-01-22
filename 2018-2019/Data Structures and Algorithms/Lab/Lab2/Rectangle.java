public class Rectangle
{
	private float length;
	private float width;
	
	public Rectangle ()
	{
		this.length=1.0f;
		this.width=1.0f;
	}
	
	public Rectangle (float length, float width)
	{
		this.length=length;
		this.width=width;
	}
	
	public float getLength ()
	{
		return length;
	}
	
	public void setLength (float length)
	{
		this.length=length;
	}
	
	public float getWidth ()
	{
		return width;
	}
	
	public void setWidth (float width)
	{
		this.width=width;
	}
	
	public double getArea ()
	{
		double area;
		area=getLength()*getWidth();
		return area;
	}
	
	public double getPerimeter ()
	{
		double per;
		per=(getLength()+getWidth())*2;
		return per;
	}
	
	public String toString ()
	{
		return "Rectangle[length="+getLength()+", width="+getWidth()+"]";
	}
}