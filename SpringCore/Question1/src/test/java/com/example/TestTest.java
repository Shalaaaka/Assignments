package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestTest {

	@Test
	void test() 
	{
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("question1.xml");
		Customer c=(Customer)context.getBean("details");
		assertEquals(true,context.containsBean("details"));
		System.out.println("Test case runs ");
	}

}
