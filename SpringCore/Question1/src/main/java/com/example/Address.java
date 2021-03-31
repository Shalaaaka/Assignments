package com.example;

public class Address 
{
	private String country;
	private String state;
	private String city;
	private String street;
	private int zip;
	
	public Address(String country, String state, String city, String street, int zip) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.street = street;
		this.zip = zip;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", street=" + street + ", zip="
				+ zip + "]";
	}


}
