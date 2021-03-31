package com.example.Question12.model;

public class AccountError 
{
	private int error;
	private String msg;
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public AccountError(int error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}
	

}
