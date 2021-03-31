package com.example;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("question3.xml");
        BankAccount bankaccount = (BankAccount)context.getBean("bankAccount");
        System.out.println(bankaccount.toString());
        BankAccountController bankAccountController=(BankAccountController)context.getBean("bankAccountController");
        BankAccountServiceImpl bankAccountServiceImpl=(BankAccountServiceImpl)context.getBean("bankAccountServiceImpl");
        Scanner n = new Scanner(System.in);
		double depositAmount = n.nextDouble();
		bankAccountController.deposit(bankaccount.getAccountId(), depositAmount);
		double withdrawAmount = n.nextDouble();
		bankAccountServiceImpl.withdraw(bankaccount.getAccountId(), withdrawAmount);
	}
}