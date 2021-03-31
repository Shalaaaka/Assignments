package com.example.CustomerApplication.model;

import java.io.Serializable;

public class Customer implements Serializable 
{
    private String fname;
    private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Customer(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	} 
    
}
