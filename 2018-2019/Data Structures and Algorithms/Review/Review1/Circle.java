public class Circle implements Shape 
{
    protected double radius;
	
	public Circle () //default
	{
		this.radius=1.0;
	}
	
	public Circle (double radius) //parameter
	{
		this.radius=radius;
	}
	
	public Circle (Circle c) // copy
	{
		this.radius=c.radius;
	}
	
    public double getArea () 
	{
		return 3.14 * radius * radius; 
    }
	
    public double getPerimeter () 
	{
        return 3.14 * 2 * radius;
    }
	
    public String toString () {
        return "radius="+radius;
    }
}
