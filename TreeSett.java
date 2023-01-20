package Task2012023;
import java.util.*;
	public class TreeSett {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparatorr());
		t.add("pawan");
		t.add("rakesh");
		t.add("nikhil");
		t.add("mahesh");
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			String tt=(String)i.next();
			System.out.println(tt);
		}
	}
	}
	class MyComparatorr implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			String s1=obj1.toString();
			String s2=obj2.toString();
			return -s2.compareTo(s1);
		}
	}

