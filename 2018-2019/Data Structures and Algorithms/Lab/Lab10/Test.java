import java.util.Arrays;
public class Test 
{
	public static void print(Student[] arr) 
	{
		for(Student s : arr) 
		{
			System.out.print(s + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Student[] students = new Student[5];
		students[0] = new Student("Huynh Le Thien Y",6.4,7.3,8.9);
		students[1] = new Student("To Gia An",9.5,10,9.2);
		students[2] = new Student("To Gia Bao",5,4,3);
		students[3] = new Student("Tim Hwang",6.3,8.3,6.5);
		students[4] = new Student("Nguyen Pham Thanh Truc",6.2,9.7,9.2);
		print(students);
		Arrays.sort(students, new StudentComparator());
		print(students);
	}
}