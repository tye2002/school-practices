import java.util.Scanner;
public class Ex9
{
    public static void main (String[]args)
    {
        int max=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 number:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        if ((a>b)&&(a>c))
            max=a;
        if ((b>a)&&(b>c))
            max=b;
        if ((c>b)&&(c>a))
            max=c;
        System.out.println("Max="+ max);

        
    }
}