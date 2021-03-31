package com.example.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.custom.ContactNumberConstraint;

public class Customer 
{
	@NotEmpty
	@Pattern(regexp="^[a-zA-Z0-9]{8,20}",message="Username should be alphanumeric and between 8 to 20 characters. ")
	//@Pattern(regexp="\\S+$", message = "No white space allowed")
	private String username;
	
	@NotEmpty
	@Size(min = 8, max = 20, message = "Your password must between 8 to 20 characters")
	@Pattern (regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$",message="Password should contain at least one upper- case letter, lower-case letter, a digit or special character")
	private String password;
	
	@NotEmpty
	@Email
	private String email;
	
	//Custom Validation
	@ContactNumberConstraint
	private String contact;
	private String city;
	
	@NotEmpty
	@Pattern (regexp="^[1-9][0-9]{5}$", message="zipcode should be 6-digits")
	private String zipcode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
