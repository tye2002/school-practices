public class Fraction
{
	private int numer;
	private int denom;
	
	public Fraction ()
	{
		this.numer=0;
		this.denom=1;
	}
	
	public Fraction (int x, int y)
	{
		this.numer=x;
		this.denom=y;
	}
	
	public Fraction (Fraction another)
	{
		this.numer=another.numer;
		this.denom=another.denom;
	}
	public String toString ()
	{
		return this.numer+"/"+this.denom;
	}
	
	public boolean equals (Object f)
	{
		if (f instanceof Fraction)
		{
			Fraction f1=(Fraction) f;
			return this.numer==f1.numer && this.denom==f1.denom;
		}
		else
			return false;
	}
}