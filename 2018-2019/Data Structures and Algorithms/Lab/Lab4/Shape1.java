public abstract class Shape1 {
	
	protected String color;
	
	public Shape1 ()
	{
		this.color="";
	}
	public Shape1 (String color)
	{
		this.color=color;
	}
	
	public abstract double getArea ();
	
	public String getColor ()
	{
		return color;
	}
	
	public void setColor (String color)
	{
		this.color=color;
	}
}