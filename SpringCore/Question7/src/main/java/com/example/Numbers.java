package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("numbers")
public class Numbers 
{
	@Value("#{10+10}")
	private int a;
	@Value("#{100-50}")
	private int b;
	@Value("#{1==1}")
	private boolean equal;
	@Value("#{11>10?true:false}")
	private String ternary;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public boolean isEqual() {
		return equal;
	}
	public void setEqual(boolean equal) {
		this.equal = equal;
	}
	public String getTernary() {
		return ternary;
	}
	public void setTernary(String ternary) {
		this.ternary = ternary;
	}
	@Override
	public String toString() {
		return "Numbers [a=" + a + ", b=" + b + ", equal=" + equal + ", ternary=" + ternary + "]";
	}
	

}
