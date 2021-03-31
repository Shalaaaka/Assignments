package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller("RectangleController")
public class Rectangle_Controller 
{
	@Autowired
	Rectangle_Service rectangle_Service;
	
	public Rectangle createNewRectangle()
	{
		return rectangle_Service.createNewRectangle();
	}
	
}
