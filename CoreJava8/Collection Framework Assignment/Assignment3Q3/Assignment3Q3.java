package hashset;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {

	public static void main(String[] args) 
	{
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		aList.add("four");
		
		List<String> reverse = traverseReverse(aList);
		System.out.println(reverse);
	}
	
	public static List traverseReverse(ArrayList aList)
	{
		List reverse = new ArrayList<>(aList.size());
		 
        ListIterator li = aList.listIterator(aList.size());
        while (li.hasPrevious()) {
            reverse.add(li.previous());
        }
		return reverse;
	}
}
