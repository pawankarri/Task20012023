package Task2012023;
import java.util.*;
class Tlr
{
	int roomno;
	int sharing;
	String name;
	public Tlr(int roomno,int sharing,String name)
	{
		this.roomno=roomno;
		this.sharing=sharing;
		this.name=name;
	}
}
class RoomnoComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Tlr t1=(Tlr)o1;
		Tlr t2=(Tlr)o2;
		if(t1.roomno>t2.roomno)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
class SharingComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Tlr t1=(Tlr)o1;
		Tlr t2=(Tlr)o2;
		if(t1.sharing>t2.sharing)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
class StreetComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Tlr t1=(Tlr)o1;
		Tlr t2=(Tlr)o2;
		return t1.name.compareTo(t2.name);
	}
}
public class LinkedListt {
public static void main(String[] args) {
	LinkedList a=new LinkedList();
a.add(new Tlr(506,4,"pawan"));
a.add(new Tlr(203,4,"satya"));
a.add(new Tlr(307,5,"draveen"));
System.out.println("sorted by roomno:");
Collections.sort(a,new RoomnoComparator());
Iterator ll=a.iterator();
while(ll.hasNext())
{
	Tlr ee=(Tlr)ll.next();
	System.out.println(ee.roomno+" "+ee.name+" "+ee.sharing);
}
System.out.println("sorted by name:");
Collections.sort(a,new StreetComparator());
Iterator l=a.iterator();
while(l.hasNext())
{
	Tlr ee=(Tlr)l.next();
	System.out.println(ee.name+" "+ee.roomno+" "+ee.sharing);
}
System.out.println("sorted by sharing:");
Collections.sort(a,new SharingComparator());
Iterator s=a.iterator();
while(s.hasNext())
{
	Tlr ee=(Tlr)s.next();
	System.out.println(ee.sharing+" "+ee.roomno+" "+ee.name);
}
}
}
