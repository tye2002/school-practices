public class Cylinder extends Circle 
{
    private double height;
    
	public Cylinder () //default
	{
		super();
		this.height=1.0;
	}
	
	public Cylinder (double height, double radius) // parameter
	{
		super(radius);
		this.height=height;
	}
	
	public Cylinder (Cylinder c) //copy
	{
		super(c.radius);
		this.height=c.height;
	}
    public double getVol () 
	{
        return getArea()* height;
    }
    public double getLSurface () 
	{
        return 3.14*2*radius*height;
    }
    public String toString () 
	{
        return "radius="+radius+" ; height= " + height;
    }
}
