import java.util.concurrent.CopyOnWriteArrayList; 
import java.util.Iterator; 

public class Assignment3Q8b 
{
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list)
	{
		Iterator it = list.iterator();
		{
			while (it.hasNext())
			{
				Integer number = (Integer)it.next(); 
				System.out.println(number);
				if(number==14)
				{
					list.add(15);
				}
			}
		}
		return null;

	}
    public static void main(String args[])
	{
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 11,12,13,14}); 
		System.out.println(list);

	}
}