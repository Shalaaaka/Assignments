package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rectangle_Service 
{
	@Autowired
	Rectangle_Repository rectangle_Repository;
	public Rectangle createNewRectangle()
	{
		return rectangle_Repository.createNewRectangle();
	}
}
