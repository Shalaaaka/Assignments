import java.util.*; 
import java.util.function.Consumer; 
public class Assignment4Q5 
{
	public static String processWords(List<String> list)
    {
		List<String> li=new ArrayList<String>();
		StringBuilder sb=new StringBuilder();
		System.out.println("\n");
		for(String s:list)
		{
			sb.append(s.charAt(0));
		}
		System.out.println("String of first letters: "+sb);
		return null;

    }

    public static void main(String[] args)
	{
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
		Consumer<String> consumer=(t)->System.out.println(t);
		list.forEach(consumer);

		processWords(list);
	}

    
}

