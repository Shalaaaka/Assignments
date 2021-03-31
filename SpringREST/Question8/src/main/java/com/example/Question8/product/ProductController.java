package com.example.Question8.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController 
{
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/products")//default - GET
	public List<Product> getAllProducts()
	{
		return ps.getAllProducts();
	}
	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addOrder(@RequestBody Product products)
	{
		ps.addProduct(products);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/products/{id}")
	public void updateTopic(@RequestBody Product products ,@PathVariable String name)
	{
		ps.updateProduct(name,products);
	}
	
	/*@RequestMapping("/products/{id}")
	public Product getOrder(@PathVariable String name)
	{
		return ps.getProduct(name);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	public void deleteProduct(@PathVariable String name)
	{
		ps.deleteProduct(name);
	}*/

}
