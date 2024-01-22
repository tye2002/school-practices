import java.util.Scanner;
import java.util.regex.*;

public class Ex11
{
    public static void main (String[]args)
    {
        String a;
        boolean yn=true;
        Scanner input= new Scanner (System.in);
        System.out.println("Enter a character:");
        a=input.next();
        if (a.matches("[A-Za-z0-9]+")==yn)
        System.out.println(a+ " is a alphanumeric.");
        else 
        System.out.println(a+ " is not a alphanumeric.");

        

    }
}