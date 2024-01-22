public class Accountant extends Employee 
{
    private double rate;
	protected String name;
    protected String DOB;
    protected double basicPay;
	
    public Accountant () //default
	{
		this.name="";
        this.rate =1.0;
        this.basicPay =1.0;
		this.DOB="";
	}
	
	public Accountant (String name, String DOB, double rate, double basicPay) //parameter
	{
		this.name=name;
        this.rate = rate;
        this.basicPay = basicPay;
		this.DOB=DOB;
    }
	
	public Accountant (Accountant a) //copy
	{
		this.name=a.name;
        this.rate = a.rate;
        this.basicPay = a.basicPay;
		this.DOB=a.DOB;	
	}
	
    public double getSalary () 
	{
        return rate * basicPay + basicPay;
    }    
	
    public String toString () {
        return "name="+name + " ; basicpay="+basicPay + " ; rate=" +rate + " ; DOB="+ DOB+" ; salary="+getSalary() ;
    }
}
