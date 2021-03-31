import java.util.*; 
public class Assignment4Q4 
{
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		ArrayList<String> list=new ArrayList<String>();
		for(String word:employeeList)
		{
			if (word.length()%2==1)
			{
				list.add(word);
			}
		}
		System.out.println("Odd length words (before removing): "+list);
		list.removeIf(n->(n.length()%2==1));
		System.out.println("Odd length words removed: "+list);
		return list;

	}

    public static void main(String[] args)
	{
		ArrayList<String> emp = new ArrayList<>();
		emp.add("Shalaka");
		emp.add("Sona");
		emp.add("Megha");
		emp.add("Neha");
		
		System.out.println("Total words: "+emp);
		removeOddLength(emp);
		
	}
}




        