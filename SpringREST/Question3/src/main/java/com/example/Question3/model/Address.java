package com.example.Question3.model;

public class Address 
{
	private int zip;
	private String state;
	private String city;
	private String country;
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [zip=" + zip + ", state=" + state + ", city=" + city + ", country=" + country + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int zip, String state, String city, String country) {
		super();
		this.zip = zip;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
