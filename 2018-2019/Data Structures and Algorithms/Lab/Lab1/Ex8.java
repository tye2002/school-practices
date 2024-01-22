import java.util.Scanner;
public class Ex8
{
    public static void main (String[]args)
    {
        int max=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int a=input.nextInt();
        int b=input.nextInt();
        if (a>b)
            max=a;
        if (a<b)
            max=b;
        System.out.println("Max="+ max);

        
    }
}