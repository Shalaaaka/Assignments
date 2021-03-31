package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question7.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student.toString());
		
		Numbers numbers=(Numbers)context.getBean("numbers");
		System.out.println(numbers.toString());
		
		List_Map_Test lmt=(List_Map_Test)context.getBean("listmaptest");
		System.out.println(lmt.toString());
	}

}
