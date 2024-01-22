import java.util.Scanner;
public class Ex7
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a year:");
        int a=input.nextInt();
        if ((a%4==0)&&(a %100!=0))
            System.out.println(a+" is a leap year.");
            if ((a%400==0)&&(a %100==0))
            System.out.println(a+" is a leap year.");
            else
            System.out.println(a+"is not a leap year.");
            
    }
}