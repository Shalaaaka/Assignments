package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestTest {

	@Test
	void test() 
	{
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("question2.xml");
		Question_Case1 q1=(Question_Case1)context.getBean("case1");
		assertEquals(true,context.containsBean("case1"));
		System.out.println("Case 1 Test case runs");
		
		Question_Case2 q2=(Question_Case2)context.getBean("case2");
		assertEquals(true,context.containsBean("case2"));
		System.out.println("Case 2 Test case runs");
		
		Question_Case3 q3=(Question_Case3)context.getBean("case3");
		assertEquals(true,context.containsBean("case3"));
		System.out.println("Case 3 Test case runs");
	}

}
