package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTest {

	@Test
	public void test() 
	{
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("question3.xml");
		BankAccount b = (BankAccount)context.getBean("bankAccount");
		assertEquals(true,context.containsBean("bankAccount"),"this should be true..");
		System.out.println("Test case runs");
	}
}
