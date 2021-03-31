import java.util.function.UnaryOperator;
import java.util.*;
public class Assignment4Q6 
{
	public static List<String> convertToUpperCase(List<String> list)
	{
		List<String> li=new ArrayList<String>();
		UnaryOperator<Boolean> uo = UnaryOperator.identity();
		for(String s:list)
		{
			li.replaceAll( e -> e.toUpperCase() );  
			System.out.println(uo.apply(true)); 
		}
		//System.out.Println(li);
		return null;
	}

    public static void main(String[] args)
	{
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		System.out.println(alphabets);
		alphabets.replaceAll( e -> e.toUpperCase() ); 
		System.out.println(alphabets);
		convertToUpperCase(alphabets);

	}

    
}