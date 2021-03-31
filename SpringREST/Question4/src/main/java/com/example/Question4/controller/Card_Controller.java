package com.example.Question4.controller;

import java.util.ArrayList;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Question4.model.Card;
import com.example.Question4.service.Card_Service;



@RestController
public class Card_Controller 
{
	Card_Service cardservice;
	
	@RequestMapping(value="/data",method=RequestMethod.GET)
	public ArrayList<Card> addCard(@Valid @RequestBody Card card)
	{
		return cardservice.addCard(card);
	}
}
