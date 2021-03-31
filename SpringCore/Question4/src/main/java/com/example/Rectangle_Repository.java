package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class Rectangle_Repository 
{
	public Rectangle createNewRectangle()
	{
		Rectangle r=new Rectangle(10,5);
		return r;
	}
}
