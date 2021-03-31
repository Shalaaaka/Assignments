package com.example;

public class Data_Model 
{
	private String email;
	private String username;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public Data_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data_Model(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Data_Model [email=" + email + ", username=" + username + ", password=" + password + "]";
	}

}
