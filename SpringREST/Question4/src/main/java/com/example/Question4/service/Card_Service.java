package com.example.Question4.service;

import java.util.ArrayList;

import com.example.Question4.model.Card;

public class Card_Service 
{
	public ArrayList<Card> addCard(Card card)
	{
		Card c=new Card("1111","1213242","2331324","2313435");
		ArrayList <Card> card1=new ArrayList<Card>();
		card1.add(c);
		return card1;
	}

}
