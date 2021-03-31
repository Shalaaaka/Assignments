package com.example.Question12.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Question12.exception.AccountException;
import com.example.Question12.model.AccountError;

@ControllerAdvice
public class ExceptionAdvice 
{
	@ExceptionHandler(AccountException.class)
	public ResponseEntity<AccountError> mapException(AccountException ae)
	{
		AccountError error=new AccountError(HttpStatus.INTERNAL_SERVER_ERROR,ae.getMessage());
		return new ResponseEntity<AccountError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
