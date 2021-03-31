import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
class Trader 
{
    private String name;
    private String city;

	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
}
public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders)
	{
		List<String> cities=new ArrayList<String>();
		cities=traders.stream().map(Trader::getCity).distinct().collect(toList());
		System.out.println(cities);
		return null;
		
	}
	public static List<String> tradersFromPuneSortByName(List<Trader> traders)
	{
		List<String> list=new ArrayList<String>();
		list=traders.stream().sorted(Comparator.comparing(Trader::getCity)).map(Trader::getName).collect(toList());
		System.out.println(list);
		return null;

	}
	public static String allTrader3Names(List<Trader> traders)
	{
		String names=traders.stream().map(Trader::getName).distinct().sorted().reduce("", (n1, n2) -> n1 + n2);
		System.out.println(names);
		return null;
	}
	public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders)
	{
		boolean IndoreBased=traders.stream().anyMatch(e->e.getCity().matches("Indore"));
		System.out.println(IndoreBased);
		return null;
	}
    public static void main(String[] args)
	{
		ArrayList<Trader> trader=new ArrayList<Trader>();
		Trader t1=new Trader("Shalaka","Pune");
		Trader t2=new Trader("Neha","Mumbai");
		Trader t3=new Trader("Smita","Delhi");
		Trader t4=new Trader("Sneha","Indore");
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
		trader.add(t4);
		printUniqueCities(trader);
		tradersFromPuneSortByName(trader);
		allTrader3Names(trader);
		areAnyTradersFromIndore(trader);
		
	}
}