package com.example.Assignment1Q3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass 
{
	@GetMapping("/")
	public String home()
	{
		return ("<h1>Hello World!</h1>");
	}
	
	/*@GetMapping("/user")
	public String user()
	{
		return ("<h1>Hello user!</h1>");
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return ("<h1>Hello admin!</h1>");
	}*/

}
