package com.example.Question12.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Question12.dao.AccountDao;
import com.example.Question12.exception.AccountException;
import com.example.Question12.model.Account;

@Service
public class AccountService 
{
	@Autowired
	private AccountDao dao;
	
	@PostConstruct
	public void addAccount()
	{
		List<Account> account=new ArrayList<>();
		account.add(new Account(1,"Shalaka","2000"));
		account.add(new Account(2,"Smita","4000"));
		dao.saveAll(account);

	}
	
	public String getData(String name) throws AccountException
	{
		Account account=null;
		String amount = null;
		try {
			account=dao.findByName(name);
			amount=account.getAmount();
			
		}catch(Exception e) {
			throw new AccountException("Not found"+name);
		}
		return amount;
	}
}
