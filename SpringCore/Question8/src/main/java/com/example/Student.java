package com.example;

public class Student 
{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}
	
	public void init()
	{
		System.out.println("inside init");
	}
	
	public void destroy()
	{
		System.out.println("inside destroy");
	}

	public String toString() {
		return "Student [age=" + age + "]";
	}

}
