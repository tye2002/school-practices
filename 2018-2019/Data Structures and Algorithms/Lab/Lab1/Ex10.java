import java.util.Scanner;
public class Ex10
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
    
        if (a%2==0)
            System.out.println(a+" is a even number.");
        else
            System.out.println(a+" is a odd number.");
    }
}