package com.example.Question7.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order 
{	
	@Id//primary key
	private String id;
	private String name;
	private String info;
	public Order() {
		super();
	}
	public Order(String id, String name, String info) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}
