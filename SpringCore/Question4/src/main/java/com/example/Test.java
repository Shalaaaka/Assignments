package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config_Class.class);
		Rectangle_Controller rectangle_Controller=(Rectangle_Controller)context.getBean("getRectangle_Controller",Rectangle_Controller.class);
		Rectangle rectangle=rectangle_Controller.createNewRectangle();
		System.out.println("Length: " + rectangle.getLength());
		System.out.println("Breadth: "+ rectangle.getBreadth());
		System.out.println("Area: "+ rectangle.Show());

	}

}
