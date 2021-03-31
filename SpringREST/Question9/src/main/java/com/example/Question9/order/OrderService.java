package com.example.Question9.order;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService 
{
	@Autowired
	private OrderRepo or;
	
	/*private List<Order> orders=new ArrayList<Order>(Arrays.asList(
			new Order("1","Ram","Tea"),
			new Order("2","Sham","Coffe"),
			new Order("3","Seen","IceCream"),
			new Order("4","Geeta","Candy")
			));*/
	
	//Fetch information of all customers.
	public List<Order> getAllOrders()
	{
		List<Order> orders=new ArrayList<Order>();
		or.findAll()//iteration
		.forEach(orders::add);
		return orders;
	}
	
	//Add a new customer information
	public void addOrder(Order order)
	{
		or.save(order);
	}
	//Update customer information
		public void updateOrder(String id,Order order)
		{
			or.save(order);
		}
	
	/*Fetch information of specific customer
	public Order getOrder(String id)
	{
		return or.findOne(id);
	}
	
	
	
	//Delete existing customer information
	public void deleteOrder(String id)
	{
		or.delete(id);
	}*/

}
