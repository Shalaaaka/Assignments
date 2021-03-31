import java.util.function.Consumer; 
import java.util.function.Supplier; 
import java.util.function.Function;
import java.util.function.Predicate;  
import java.util.List;  
import java.util.ArrayList; 

public class Assignment4Q3 
{
    static Integer modifyValue(List<Integer> list)
	{
		return list.stream() .mapToInt(Integer::intValue).sum();  
		
	}

    static Boolean even(int number)
	{  
        if(number%2==0)  
            return true;  
        else return false;  
    }  

    static void display(String name)
	{
		System.out.println("hello " +name);
	}

    public static void main(String[] args) 
	{
		Consumer<String> consumer1 = (t)->System.out.println (t);
		consumer1.accept("shalaka");

		Consumer<String> consumer2 = Assignment4Q3::display;
		consumer2.accept("Shalaka");

		Supplier<Double> randomValue = () -> Math.random(); 
        System.out.println(randomValue.get()); 

		List<Integer> list = new ArrayList<Integer>();  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
         
        Function<List<Integer>, Integer> fun = Assignment4Q3::modifyValue;  
        int result = fun.apply(list);  
        System.out.println("Sum of list values: "+result);

		Predicate<Integer> predicate= Assignment4Q3::even; 
        System.out.println(predicate.test(10));  

		Predicate<Integer> pr = a -> (a > 18);   
        System.out.println(pr.test(10));  

	}
}