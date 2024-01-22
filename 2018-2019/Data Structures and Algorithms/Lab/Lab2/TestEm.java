import java.util.*;
import java.util.Scanner;

public class TestEm
{
	public static void main (String[]args)
	{
		String F,L;
		Scanner input= new Scanner (System.in);
		
		System.out.print("Increase the salary by the percent: ");
		int p=input.nextInt();
		
		System.out.println("ID:");
		int ID=input.nextInt();
		input.nextLine();
		System.out.println("First name:");
		F=input.nextLine();
		
		System.out.println("Last name:");
		L=input.nextLine();
		
		System.out.println("Salary:");
		int sal=input.nextInt();
		
		Employee myEm=new Employee (ID,sal,F,L);
		
		System.out.println (myEm.toString());
		System.out.println ("Annual salary: "+ myEm.getAnnualSalary());
		System.out.println ("Annual salary after raise "+p+" times of month salary:"+ myEm.raiseSalary(p));
		
		System.out.print("\r\nNew salary:");
		sal=input.nextInt();
		myEm.setSalary(sal);
		
		System.out.println (myEm.toString());
		System.out.println ("Annual salary: "+ myEm.getAnnualSalary());
		System.out.println ("Annual salary after raise "+p+" times of month salary:"+ myEm.raiseSalary(p));
	}
}