package Task2012023;
import java.util.*;
class Eidiko
{
	String name;
	String city;
    int empId;
    public Eidiko(String name,String city,int empId)
    {
    	this.name=name;
    	this.city=city;
    	this.empId=empId;
    }
}
    class NameeComparator implements Comparator
    {
    	public int compare(Object o1,Object o2)
    	{
    		Eidiko e1=(Eidiko)o1;
    		Eidiko e2=(Eidiko)o2;
    		return e1.name.compareTo(e2.name);
    	}
    }
    class CityComparator implements Comparator
    {
    	public int compare(Object o1,Object o2)
    	{
    		Eidiko e1=(Eidiko)o1;
    		Eidiko e2=(Eidiko)o2;
    		return e1.city.compareTo(e2.city);
    }
}
    class EmpidComparator implements Comparator
    {
    	public int compare(Object o1,Object o2)
    	{
    		Eidiko e1=(Eidiko)o1;
    		Eidiko e2=(Eidiko)o2;
    		if(e1.empId<e2.empId)
    		{
    			return -1;
    		}
    		else
    		{
    			return 1;
    		}
    		
    	}
    }

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(new Eidiko("pawan","kakinada",1007));
	a.add(new Eidiko("nikhil","warangal",1004));
	a.add(new Eidiko("imran","ongole",1003));
	a.add(new Eidiko("gopal","khammam",1008));
	a.add(new Eidiko("mahesh","sileru",1000));
	System.out.println("sorting by name:");
	Collections.sort(a,new NameeComparator());
	Iterator l=a.iterator();
	while(l.hasNext())
	{
		Eidiko e=(Eidiko)l.next();
		System.out.println(e.name+" "+e.city+" "+e.empId);
	}
	System.out.println();
	System.out.println("sorted by city:");
	Collections.sort(a,new CityComparator());
	Iterator ll=a.iterator();
	while(ll.hasNext())
	{
		Eidiko ee=(Eidiko)ll.next();
		System.out.println(ee.city+" "+ee.name+" "+ee.empId);
	}
	System.out.println("sorted by empid:");
	Collections.sort(a,new EmpidComparator());
	Iterator lll=a.iterator();
	while(lll.hasNext())
	{
		Eidiko i=(Eidiko)lll.next();
		System.out.println(i.empId+" "+i.name+" "+i.city);
	}
}
}
