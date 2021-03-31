package com.example;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountepositoryImpl implements BankAccountRepository 
{
	BankAccount ba=new BankAccount();

	public double getBalance(long accountId) 
	{
		if(ba.getAccountId() == accountId) 
		{
			return ba.getAccountBalance();
		}
		else 
		{
				System.out.println("not valid ID");
		}
		return accountId;
	}

	public double updateBalance(long accountId, double newBalance)
	{	
		if(ba.getAccountId() == accountId) 
		{
			ba.setAccountBalance(newBalance);
			System.out.println("Balance Updated : "+ getBalance(accountId));
		}
		else 
		{
				System.out.println("not valid ID");
		}
		return accountId;
	}
	
	
}
