package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Data 
{
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		System.out.println("Setting Name");
		Name = name;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("inside init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("inside destroy");
	}

	@Override
	public String toString() {
		return "Data [Name=" + Name + "]";
	}
	

}
