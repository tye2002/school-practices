import java.util.Scanner;

public class Ex5
{
     
    public static void main(String[] args) 
	{
        Scanner input=new Scanner (System.in);
        
		System.out.println("Enter the Celsius degree:");
		float celsius=input.nextFloat();
		double fahren=(celsius*1.8)+32.0;
		System.out.print(celsius+" C = "+fahren+" F");
		
    }
}