package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 
{
	public static void main(String[] args) 
	{
		Assignment3Q2 a = new Assignment3Q2();
	    Assignment3Q2 b = new Assignment3Q2();
	     
		HashSet<String> hash=new HashSet(); 
		hash.add("City");
		hash.add("Area");
		hash.add("State");
		hash.add("Road");
		System.out.println("unordered hashSet: ");
		System.out.println(a.unordered(hash));
		
		LinkedHashSet<String> link=new LinkedHashSet();
		link.add("City");
		link.add("Area");
		link.add("State");
		link.add("Road");
		System.out.println("\nordered linkedHashSet: ");
		System.out.println(b.ordered(link));
		
	}
	public static HashSet unordered(HashSet hashSet)
	{
		HashSet<String> hash = new HashSet<>(hashSet);
        return hash;
	}
	public static LinkedHashSet ordered(LinkedHashSet linkedHashSet)
	{
		LinkedHashSet<String> link = new LinkedHashSet<>(linkedHashSet);
		return link;
	}
	

}
