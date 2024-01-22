public class Point3D extends Point2D
{
	private float z;
	
	public Point3D (float x, float y,float z)
	{
		super(x,y);
		this.z=z;
	}
	
	public Point3D()
	{
		super();
		this.z=0;
	}
	
	public float getZ()
	{
		return this.z;
	}
	
	public void setZ(float z)
	{
		this.z=z;
	}
	
	
	public void setXYZ(float x,float y,float z)
	{
		super.getX();
		super.getY();
		this.z=z;
	}
	
	public float [] getXYZ()
	{
		float [] xy= new float [3];
		xy[0]=getX();
		xy[1]=getY();
		xy[2]=getZ();
		return xy;
	}
	
	public String toString ()
	{
		return "("+getX()+","+getY()+","+getZ()+")";
	}
}
