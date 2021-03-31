package com.example.Assignment1Q2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass 
{
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home()
	{
		return ("<h1>Hello World</h1>");
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login()
	{
		return "login.html";
	}

}
