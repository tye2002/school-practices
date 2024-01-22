import java.util.Comparator;
public class StudentComparator implements Comparator 
{
 @Override
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		// for ascending order
		double avg = s1.getAvg() - s2.getAvg();
		if(avg > 0) return 1;
		else if(avg < 0) return -1;
		else return 0;
	}
}