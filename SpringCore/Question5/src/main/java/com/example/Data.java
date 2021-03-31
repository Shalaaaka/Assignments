package com.example;

import javax.inject.Inject;

public class Data 
{
	@Inject
	private College college;
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
}
