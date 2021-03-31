package com.example.Question3.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Question3.model.Address;

@RestController
public class Address_Controller 
{
	@ResponseBody
	@RequestMapping(value="/data/{zip}",method=RequestMethod.GET)
	public ArrayList<Address> getAddressList(@PathVariable ("zip") int zip)
	{
		Address a1=new Address(1,"MH","Pune","India");
		Address a2=new Address(2,"UK","Deheradoon","India");
		Address a3=new Address(3,"UP","Lucknow","India");
		Address a4=new Address(4,"MP","Bhopal","India");
		
		ArrayList <Address> list=new ArrayList<Address>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		return list;
	}
	
}