import java.util.Scanner;
public class Ex6
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        double a=input.nextDouble();
        if (a>=0)
            System.out.println(a);
        else
            System.out.println(-a);
    }
}
