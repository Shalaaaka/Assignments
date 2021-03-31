package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example")
public class Config_Class 
{
	@Bean
	public Rectangle_Controller getRectangle_Controller()
	{
		Rectangle_Controller rectangle_Controller=new Rectangle_Controller();
		return rectangle_Controller;
	}

}
