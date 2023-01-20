package Task2012023;
import java.util.*;
class Pedda
{
	String village;
	int distance;
	public Pedda(String village,int distance)
	{
		this.village=village;
		this.distance=distance;
	}
}
class VillageComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Pedda p1=(Pedda)o1;
		Pedda p2=(Pedda)o2;
		return p1.village.compareTo(p2.village);
	}
}
class DistanceComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Pedda p1=(Pedda)o1;
		Pedda p2=(Pedda)o2;
		if(p1.distance<p2.distance)
		{
			return -1;
		}
		else if(p1.distance==p2.distance)
		{
			return 0;
		}
		else
		{
			return 1;
		}
			
	}
}
public class HashSett2 {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(new Pedda("gudivada",5));
	h.add(new Pedda("siriwada",6));
	h.add(new Pedda("kandrakota",8));
	ArrayList a=new ArrayList(h);
	System.out.println("sorted by village");
	Collections.sort(a,new VillageComparator());
	Iterator i=a.iterator();
	while(i.hasNext())
	{
		Pedda p1=(Pedda)i.next();
		System.out.println(p1.village+" "+p1.distance);
	}
	System.out.println("sorted by distance");
	Collections.sort(a,new DistanceComparator());
	Iterator ii=a.iterator();
	while(ii.hasNext())
	{
		Pedda p2=(Pedda)ii.next();
		System.out.println(p2.distance+" "+p2.village);
	}
}
}
