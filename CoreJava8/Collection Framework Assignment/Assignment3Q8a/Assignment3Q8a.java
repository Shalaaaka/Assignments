import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 

public class Assignment3Q8a 
{
	public static void failFast(Map<String, String> cityCode)
	{
		Iterator iterator = cityCode.keySet().iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(cityCode.get(iterator.next()));
			cityCode.put("USA","New York");
		}
    }
    public static void main(String[] args)
	{
		Map<String, String> cityCode = new HashMap<String, String>(); 
		cityCode.put("India", "Delhi");
		cityCode.put("Germany", "Berlin");
		cityCode.put("England", "London");
		cityCode.put("France", "Paris");

		System.out.println(cityCode);
		failFast(cityCode);
	}
}