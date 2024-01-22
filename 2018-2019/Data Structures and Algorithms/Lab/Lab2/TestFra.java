import java.util.Scanner;

public class TestFra 
{
  public static void main(String[] args) 
  {
	Scanner input= new Scanner (System.in);
	
	System.out.println ("Enter 2 fraction:");
	System.out.print("a.num=");
	int a1=input.nextInt();
	System.out.print("a.den=");
	int a2=input.nextInt();
	
	System.out.print("b.num=");
	int b1=input.nextInt();
	System.out.print("b.den=");
	int b2=input.nextInt();
	
    Fraction a = new Fraction(a1,a2);
    Fraction b = new Fraction(b1,b2);
	System.out.println(a1+"/"+a2+" add "+b1+"/"+b2+" = "+a.add(b).toString());
	System.out.println(a1+"/"+a2+" sub "+b1+"/"+b2+" = "+a.subtraction(b).toString()); 
    System.out.println(a1+"/"+a2+" mul "+b1+"/"+b2+" = "+a.multiplication(b).toString()); 
	System.out.println(a1+"/"+a2+" div "+b1+"/"+b2+" = "+a.division(b).toString());
  }
}