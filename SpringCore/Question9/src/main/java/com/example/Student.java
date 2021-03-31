package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements DisposableBean, InitializingBean
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing method of Student bean is invoked!");		
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method of Student bean is invoked!");		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
