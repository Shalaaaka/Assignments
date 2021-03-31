import java.util.*; 

public class Assignment4Q7 
{
	
    public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("apple",1);
		map.put("Banana",2);
		map.put("Cat",3);
		map.put("Dog",4);

		System.out.println("Initial Mappings are: " + map); 
		
		System.out.println("Set View: "+map.entrySet());
		
	}
    
}

