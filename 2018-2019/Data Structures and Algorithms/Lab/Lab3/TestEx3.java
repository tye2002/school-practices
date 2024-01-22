import java.util.*;
import java.util.Scanner;

public class TestEx3
{
	public static void main (String[]args)
	{
		Student1 stu= new Student1("Thien Y","221B Baker Street","Information Technology",2018,9000);
		System.out.println (stu.toString());
		
		Staff sta= new Staff("Thien Y","221B Baker Street","TDT University",9000);
		System.out.println (sta.toString());
		
	}
}