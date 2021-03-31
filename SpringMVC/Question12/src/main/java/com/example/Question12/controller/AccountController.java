package com.example.Question12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Question12.exception.AccountException;
import com.example.Question12.service.AccountService;

@RestController
public class AccountController 
{
	@Autowired
	private AccountService service;
	
	@GetMapping("/getAmount/{name}")
	public String getAccountData(@PathVariable String name) throws AccountException
	{
		String amount=service.getData(name);
		return "amount"+name+"is"+amount;
	}

}
