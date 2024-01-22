import java.util.Scanner;

public class Ex13
{
	public static void main (String[]args)
	{
		float per;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter marks of 5 subjects:");

		int phys=input.nextInt();
        int chem=input.nextInt();
        int bio=input.nextInt();
		int math=input.nextInt();
		int com=input.nextInt();
		
		per=(phys+chem+bio+math+com)*10/5;
		if (per>90)
			System.out.println("Grade A");
		if ((per>80)&&(per<90))
			System.out.println("Grade B");
		if ((per>70)&&(per<80))
			System.out.println("Grade C");
		if ((per>60)&&(per<70))
			System.out.println("Grade D");
		if ((per>40)&&(per<60))
			System.out.println("Grade E");
		if (per<40)
			System.out.println("Grade F");

	}
}