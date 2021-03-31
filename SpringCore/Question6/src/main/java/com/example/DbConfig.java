package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value="${classpath:dbConfig.properties}")
@Component
public class DbConfig 
{
	@Value("${dburl}")
	private String dburl;
	
	private String username;
	
	@Value("${password}")
	private String password;
	
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
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
	@Override
	public String toString() {
		return "DbConfig [dburl=" + dburl + ", username=" + username + ", password=" + password + "]";
	}
	public DbConfig(String dburl, String username, String password) {
		super();
		this.dburl = dburl;
		this.username = username;
		this.password = password;
	}
	public DbConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
