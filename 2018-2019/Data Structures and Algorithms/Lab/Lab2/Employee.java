public class Employee
{
	private int ID,salary;
	private String firstName,lastName;
		
	
	public Employee (int ID, int salary, String firstName, String lastName)
	{
		this.ID=ID;
		this.salary=salary;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public int getID ()
	{
		return ID;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public String getName() 
	{
    return getFirstName() + " " + getLastName();
	}
	
	public int getSalary ()
	{
		return salary;
	}
	
	public void setSalary (int salary)
	{
		this.salary=salary;
	}
	
	public int getAnnualSalary ()
	{
		return getSalary()*12 ;
	}
	
	public int raiseSalary (int percent)
	{
		return percent*getSalary()*12;
	}
	
	public String toString ()
	{
		return "Employee[ID="+getID()+", name="+getName()
		+",salary="+getSalary()+"]";
	}
}