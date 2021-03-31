package com.example;

import javax.annotation.Resource;

public class College 
{
	private String college_Name;
	
	@Resource(name="myStudent")
	private Student student;

	public String getCollege_Name() {
		return college_Name;
	}

	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [college_Name=" + college_Name + ", student=" + student + "]";
	}

	public College(String college_Name, Student student) {
		super();
		this.college_Name = college_Name;
		this.student = student;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
