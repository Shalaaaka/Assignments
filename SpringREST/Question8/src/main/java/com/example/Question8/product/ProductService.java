package com.example.Question8.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepo pr;
	
	//Fetch information of all Products.
		public List<Product> getAllProducts()
		{
			List<Product> product=new ArrayList<Product>();
			pr.findAll()//iteration
			.forEach(product::add);
			return product;
		}
		
		//Add a new product information
		public void addProduct(Product product)
		{
			pr.save(product);
		}
		//Update product information
				public void updateProduct(String name,Product product)
				{
					pr.save(product);
				}
		
		/*Fetch information of specific product
		public Product getProduct(String name)
		{
			return pr.findOne(name);
		}
		
		
		
		//Delete existing product information
		public void deleteProduct(String name)
		{
			pr.delete(name);
		}*/
}
