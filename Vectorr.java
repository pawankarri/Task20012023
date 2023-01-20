package Task2012023;
import java.util.*;
public class Vectorr {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("pawan");
	v.add("satya");
	v.add("manikanta");
	v.add("prasad");
	v.add("bobby");
	System.out.println(v);
	Collections.sort(v,new Vcomparator());
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
		String v1=(String)e.nextElement();
		System.out.println(v1);
	}
}
}
class Vcomparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=(String)o2;
		return -s1.compareTo(s2);
	}
}
