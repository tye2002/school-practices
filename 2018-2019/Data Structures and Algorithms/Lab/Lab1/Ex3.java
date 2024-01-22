import java.util.Scanner;

public class Ex3
{
     
    public static void main(String[] args) 
	{
        Scanner input=new Scanner (System.in);
        
		System.out.println("Enter width and lenghth of a rectangle:");
		float w=input.nextInt();
		float l=input.nextInt();
		float per=(w+l)*2;
		float area=w*l;
		System.out.print("Perimeter="+per+" Area="+area);
    }
}