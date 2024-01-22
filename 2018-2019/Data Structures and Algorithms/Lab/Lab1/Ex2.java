import java.util.Scanner;

public class Ex2
{
     
    public static void main(String[] args) 
	{
        Scanner input=new Scanner (System.in);
        int a,b;
		System.out.println("Enter two number:");
		a=input.nextInt();
		b=input.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		float div=a/b;
		float rem=a%b;
		System.out.print("Add="+add+" Sub="+sub+" Mul="+mul+" Div="+div+" Rem="+rem);
    }
}