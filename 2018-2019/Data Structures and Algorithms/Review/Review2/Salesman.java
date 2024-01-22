public class Salesman extends Employee 
{
    private int productQuantity;
	protected String name;
    protected String DOB;
    protected double basicPay;
	
    public Salesman () //default
	{
		this.name="";
        this.productQuantity =1;
        this.basicPay =1.0;
		this.DOB="";	
	}
	
	public Salesman (String name, String DOB, int productQuantity, double basicPay) //parameter
	{
		this.name=name;
        this.productQuantity = productQuantity;
        this.basicPay = basicPay;
		this.DOB=DOB;
    }
	
	public Salesman (Salesman s) //copy
	{
		this.name=s.name;
        this.productQuantity =s.productQuantity;
        this.basicPay = s.basicPay;
		this.DOB=s.DOB;	
	}
	
    public double getSalary () 
	{
        return productQuantity*0.05 + basicPay;
    }    
	
    public String toString () 
	{
        return "name="+name + " ; basicpay="+basicPay + " ; productQuantity=" +productQuantity + " ; DOB="+ DOB+" ; salary="+getSalary() ;
    }
}
