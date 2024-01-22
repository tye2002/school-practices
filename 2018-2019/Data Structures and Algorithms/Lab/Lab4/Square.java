public class Square extends Rectangle {
	
	public Square (double side)
	{
		super(side,side);
	}
	
	public Square (double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}
	
	public double getSide()
	{
		return getWidth();
	}
	
	public void setSide(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side)
	{
		super.setLength(side);
	}
	
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	
	public String toString ()
	{
		return "Square [side="+getWidth()+
		",color="+getColor()+
		",filled="+isFilled()+"]";
	}
}