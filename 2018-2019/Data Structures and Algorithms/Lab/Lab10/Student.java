public class Student 
{
	private String name;
	private double mathematics,programming,DSA1;
	public Student()
	{
		this.name = "";
		this.mathematics = 0;
		this.programming = 0;
		this.DSA1 = 0;
	}
	public Student(String name, double mathematics,double programming, double DSA1)
	{
		this.name = name;
		this.mathematics = mathematics;
		this.programming = programming;
		this.DSA1 = DSA1;
	}
	public double getAvg()
	{
		return (double) (this.mathematics +this.programming+this.DSA1)/3;
	}
	@Override
	public String toString()
	{
		return this.name;
	}
}