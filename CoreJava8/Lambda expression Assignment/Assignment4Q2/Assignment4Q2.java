import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Assignment4Q2
{
	private int totalPrice;
	private String status;
	public int getTotalPrice()
	{
		return totalPrice;
	}
	
	public String getStatus()
	{
		return status;
	}
	Assignment4Q2(int totalPrice, String status) 
	{
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders)
{
	ArrayList<Assignment4Q2> list=new ArrayList<>();
	for(Assignment4Q2 a: orders)
	{
		if(a.getTotalPrice()<1000)
		{
			System.out.println(a.totalPrice);
		}
	}

	for(Assignment4Q2 a: orders)
	{
		int count=0;
		if(a.getStatus()=="Accepted")
		{
			System.out.println("Order Accepted");
		}
	}
	return null;
}

    public static void main(String[] args)
	{
		ArrayList<Assignment4Q2> orders=new ArrayList<Assignment4Q2>();
		Assignment4Q2 order1=new Assignment4Q2(2000,"Accepted");
		Assignment4Q2 order2=new Assignment4Q2(4000,"Accepted");
		Assignment4Q2 order3=new Assignment4Q2(200,"Completed");
		Assignment4Q2 order4=new Assignment4Q2(800,"Completed");

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);

		listOfOrders(orders);
		
	}
}



