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
class Transaction 
{
    private Trader trader;
    private int year;
    private int value;
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [year=" + year + ", value=" + value + "]";
	}
	
}
public class Assignment5Q4 
{
	public static List<Transaction> sortTransactions(List <Transaction> transactions)
	{
		List<Transaction> transactions2011=new ArrayList<Transaction>();
		transactions2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(toList());
        transactions2011.forEach(System.out::println);
		return null;

	}
	public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions)
	{
		List<Trader> traders = transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Delhi")) .distinct().sorted(Comparator.comparing(Trader::getName)).collect(toList());
        System.out.println(traders);
		return null;
	}
	public static int highestTransaction(List<Transaction> transactions)
	{
		int highestValue = transactions.stream().map(Transaction::getValue).reduce(0, Integer::max);
        System.out.println(highestValue); 
		return highestValue;
	}
	public static int smallestTransaction(List<Transaction> transactions)
	{
		int smallestValue=transactions.stream().map(Transaction::getValue).reduce(Integer::min).get();
		System.out.println(smallestValue);
		return smallestValue;
	}
    public static void main(String[] args)
	{
		Trader t1=new Trader("Shalaka","Pune");
		Trader t2=new Trader("Neha","Mumbai");
		Trader t3=new Trader("Smita","Delhi");
		Trader t4=new Trader("Sneha","Indore");

		List<Transaction> transactions = Arrays.asList(
            new Transaction(t1, 20018, 500), 
            new Transaction(t2, 2016, 1000),
            new Transaction(t3, 2011, 200),
            new Transaction(t4, 2011, 800),	
            new Transaction(t1, 2008, 400),
            new Transaction(t2, 2019, 900)
        );	
		
		sortTransactions(transactions);
		transactionsValuesDelhi(transactions);
		highestTransaction(transactions);
		smallestTransaction(transactions);
	}
}