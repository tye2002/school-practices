import java.util.*;
import java.util.Scanner;

public class TestEx1
{
	public static void main (String[]args)
	{
		Student stu= new Student("Thien Y","221B Baker Street",5,6,7);
		System.out.println (stu.toString()+"\r\nMath="+stu.getScoreMath()+"  Physical="+stu.getScorePhysical()+
		"  Chemistry="+stu.getScoreChemistry());
		
	}
}