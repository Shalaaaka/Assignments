package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address 
{
	@Value("India")
	private String country;
	@Value("State")
	private String State;
	@Value("413307")
	private int zip;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", State=" + State + ", zip=" + zip + "]";
	}
	public Address(String country, String state, int zip) {
		super();
		this.country = country;
		State = state;
		this.zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
