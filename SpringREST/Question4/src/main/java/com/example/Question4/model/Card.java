package com.example.Question4.model;

import javax.validation.constraints.Size;

public class Card 
{
	@Size(min=15,max=15,message="Valid length: 15 digits")
	private String enroute;
	
	@Size(min=16,max=19,message="Valid length: 16 to 19 digits")
	private String jcb;
	
	@Size(min=16,max=16,message="Valid length: 16 digits")
	private String mastercard;
	
	@Size(min=19,max=19,message="Valid length: 19 digits")
	private String visa;
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(String enroute, String jcb, String mastercard, String visa) {
		super();
		this.enroute = enroute;
		this.jcb = jcb;
		this.mastercard = mastercard;
		this.visa = visa;
	}
	@Override
	public String toString() {
		return "Card [enroute=" + enroute + ", jcb=" + jcb + ", mastercard=" + mastercard + ", visa=" + visa + "]";
	}
	public String getEnroute() {
		return enroute;
	}
	public void setEnroute(String enroute) {
		this.enroute = enroute;
	}
	public String getJcb() {
		return jcb;
	}
	public void setJcb(String jcb) {
		this.jcb = jcb;
	}
	public String getMastercard() {
		return mastercard;
	}
	public void setMastercard(String mastercard) {
		this.mastercard = mastercard;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}

}
