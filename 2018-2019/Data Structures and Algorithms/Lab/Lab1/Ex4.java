import java.util.Scanner;

public class Ex4
{
     
    public static void main(String[] args) 
	{
        Scanner input=new Scanner (System.in);
        
		System.out.println("Enter specified days:");
		int days=input.nextInt();
		int year=days/365;
		int week=(days-year*365)/7;
		int day=days-year*365-week*7;
		System.out.print(days+" after convert is " +year+" years "+week+" weeks "+day+" day ");
    }
}