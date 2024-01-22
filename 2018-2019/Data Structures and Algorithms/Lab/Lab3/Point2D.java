public class Point2D
{
	private float x,y;
	
	public Point2D (float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	
	public Point2D()
	{
		this.x=0;
		this.y=0;
	}
	
	public float getX()
	{
		return this.x;
	}
	
	public void setX(float x)
	{
		this.x=x;
	}
	
	public float getY()
	{
		return this.y;
	}
	
	public void setY(float y)
	{
		this.y=y;
	}
	
	public void setXY(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	
	public float [] getXY()
	{
		float [] xy= new float [2];
		xy[0]=getX();
		xy[1]=getY();
		return xy;
	}
	
	public String toString ()
	{
		return "("+getX()+","+getY()+")";
	}
}
