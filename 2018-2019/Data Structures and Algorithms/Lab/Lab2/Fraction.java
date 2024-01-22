import java.util.*;

public class Fraction 
{
	private int numerator;
	private int denominator;

	public Fraction() 
	{
		this(1, 1);
	}

	public Fraction(int numerator, int denominator) 
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(Fraction f) 
	{
		this.numerator = f.getNumerator();
		this.denominator = f.getDenominator();
	}

	public int getNumerator() 
	{
		return numerator;
	}

	public void setNumerator(int numerator) 	
	{
		this.numerator = numerator;
	}

	public int getDenominator() 
	{
		return denominator;
	}

	public void setDenominator(int denominator) 
	{
		if (denominator == 0) 
		{
			System.out.println("Denominator can't equal 0");
		} 
		else 
		{
			this.denominator = denominator;
		}
	}

	public Fraction add(Fraction b) 
	{
		return new Fraction(numerator * b.getDenominator() + denominator * b.getNumerator(), denominator * b.getDenominator()).reducer();
	}

	public Fraction subtraction(Fraction b) 	
	{
		return new Fraction(numerator * b.getDenominator() - denominator * b.getNumerator(), denominator * b.getDenominator()).reducer();
	}

	public Fraction multiplication(Fraction b) 
	{
		return new Fraction(numerator * b.getNumerator(), denominator * b.getDenominator()).reducer();
	}

	public Fraction division(Fraction b) 
	{
		return new Fraction(numerator * b.getDenominator(), denominator * b.getNumerator()).reducer();
	}

	public Fraction reducer() 
	{
		int gcd = findGCD(getNumerator(), getDenominator());
		setNumerator(getNumerator() / gcd);
		setDenominator(getDenominator() / gcd);
		return this;
	}

	private int findGCD(int x, int y) 
	{
		int temp;
		while (y!=0)
		{
			temp=y;
			y=x%y;
			x=temp;
		}
		return x;
    }
	
	public String toString() 
	{
		return getNumerator() + "/" + getDenominator();
	}
}