import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Fruit 
{
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public String getName() {
		return name;
	}	
	public int getCalories() {
		return calories;
	}	
	public int getPrice() {
		return price;
	}	
	public String getColor() {
		return color;
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
}

public class Assignment5Q1 
{
	 public static List<String> reverseSort(ArrayList<Fruit> fruits)
	{
		List<Fruit> list = new ArrayList<>();
        for(Fruit f : fruits)
        {
            if(f.getCalories()<100)
            {
                list.add(f);
            }
        }
		System.out.println("\nCase 1: ");
        list.stream().sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).map(Fruit::getName).forEach(System.out::println);
        return null;
	}

	public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits)
	{
		System.out.println("\nCase 2: ");
		fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName).forEach(System.out::println);
        return null;
	}
	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits )
	{
		List<Fruit> l = new ArrayList<>();
       for(Fruit f : fruits)
		   {
           if(f.getColor().equals("red"))
		  {
               l.add(f);
           }
       }
	   System.out.println("\nCase 3: ");
       l.stream().sorted(Comparator.comparingInt(Fruit::getPrice)).map(Fruit::getName).forEach(System.out::println);
       return null;
	}
	public static void main(String[] args)
	{

		ArrayList<Fruit> list = new ArrayList<>();
	   Fruit Banana = new Fruit("Banana",100,80,"yellow");
       Fruit Apple = new Fruit("Apple",120,200,"red");
       Fruit Orange  = new Fruit("Orange",60,120,"Orange");
       Fruit Guava = new Fruit("Guava",40,100,"green");
       
       
       list.add(Banana);
       list.add(Apple);
       list.add(Orange);
       list.add(Guava);

	   
       reverseSort(list);
       sort(list);
       filterRedSortPrice(list);
	}
	
}