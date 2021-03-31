package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question2.xml");
		Question_Case1 question1=(Question_Case1) context.getBean("case1");
		System.out.println(question1.toString());
		Question_Case2 question2=(Question_Case2) context.getBean("case2");
		System.out.println(question2.toString());
		Question_Case3 question3=(Question_Case3) context.getBean("case3");
		System.out.println(question3.toString());
	}

}
