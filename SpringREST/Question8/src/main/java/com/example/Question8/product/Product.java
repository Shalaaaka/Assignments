package com.example.Question8.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	private String name;
	private String quantity;
	private String info;
	public Product() {
		super();
	}
	public Product(String name, String quantity, String info) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.info = info;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", info=" + info + "]";
	}
	
}
