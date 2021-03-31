package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question9.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student.toString());
		((AbstractApplicationContext) context).close();
	}

}
