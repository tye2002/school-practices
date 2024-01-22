import java.util.Scanner;

public class Ex1 
{
     
    public static void main(String[] args) 
	{
        Scanner input=new Scanner (System.in);
        String Name,Phone;
        int Date;
        System.out.println("Name:");
        Name=input.nextLine();
        System.out.println("Date of birth:");
        Date=input.nextInt();
		System.out.println("Phone number:");
        Phone=input.next();
        System.out.print("Your name is " + Name + ", your date of birth is " + Date + " and your phone number is " + Phone);
                 
    }
}