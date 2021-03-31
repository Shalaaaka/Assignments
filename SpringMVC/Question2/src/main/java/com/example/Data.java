package com.example;

public class Data 
{
	private int amount;
	private int rate;
	private int time;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Data [amount=" + amount + ", rate=" + rate + ", time=" + time + "]";
	}
	
	public int calculate()
	{
		return ((amount*rate*time)/100);
	}

}
