package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question5.xml");
		College college=(College)context.getBean("college",College.class);
		System.out.println(college.toString());
		
		Data data=(Data)context.getBean("data");
		System.out.println(data.getCollege());
	}

}
