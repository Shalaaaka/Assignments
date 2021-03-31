package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	private static ApplicationContext context;

	public static void main(String[] args) 
	{
		context = new ClassPathXmlApplicationContext("question1.xml");
		Customer customer=(Customer)context.getBean("details");
		System.out.println(customer.toString());	
	}

}
