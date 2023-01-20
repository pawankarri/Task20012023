package Task2012023;
import java.util.*;
class Student
{
	String subject;
	double points;
	public Student(String subject,double points)
	{
		this.subject=subject;
		this.points=points;
	}
}
	class SubjectComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			return s1.subject.compareTo(s2.subject);
		}
	}
public class Queuee {
public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue(new SubjectComparator());
	p.add(new Student("science",9.5));
	p.add(new Student("telugu",8.1));
	p.add(new Student("hindi",9.0));
	Iterator i=p.iterator();
	while(i.hasNext())
	{
		Student s=(Student)i.next();
		System.out.println(s.subject+" "+s.points);
	}
}
}
