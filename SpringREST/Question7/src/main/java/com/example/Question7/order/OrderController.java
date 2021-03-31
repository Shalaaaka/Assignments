package com.example.Question7.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController 
{
	@Autowired
	private OrderService os;
	
	@RequestMapping("/orders")//default - GET
	public List<Order> getAllOrders()
	{
		return os.getAllOrders();
	}
	
	/*@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable String id)
	{
		return os.getOrder(id);
	}*/
	
	@RequestMapping(method=RequestMethod.POST,value="/orders")
	public void addOrder(@RequestBody Order order)
	{
		os.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/orders/{id}")
	public void updateTopic(@RequestBody Order order ,@PathVariable String id)
	{
		os.updateOrder(id,order);
	}
	
	/*@RequestMapping(method=RequestMethod.DELETE,value="/orders/{id}")
	public void deleteOrder(@PathVariable String id)
	{
		os.deleteOrder(id);
	}*/
}
