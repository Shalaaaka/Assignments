package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question8.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student.toString());
		
		Data data=(Data)context.getBean("data");
		System.out.println(data.toString());
		((AbstractApplicationContext) context).close();
		
	}

}
