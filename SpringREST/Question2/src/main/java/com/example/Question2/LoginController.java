package com.example.Question2;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController 
{
	@GetMapping(value="/login")
	public String loginForm(Model model)
	{
		model.addAttribute("login", new Login());
	    return "login";
	}
	
	@PostMapping(value="/login",produces=MediaType.TEXT_PLAIN_VALUE)
		public String loginSubmit(@ModelAttribute ("login") Login login, Model model)
		{
			Login logindata=new Login();
			logindata.setUsername("Shalaka");
			logindata.setPassword("123");
			model.addAttribute("login", login);
			if (login.getUsername().equals(logindata.getUsername()))
			{
				if (login.getPassword().equals(logindata.getPassword()))
				{
					return "success";
				}
				else
				{
					return "error";
				}
			}
			else
			{
				return "error";
			}
		} 
}
	

 /* @GetMapping(value="/greeting")
  public String greetingForm(Model model) 
  {
    model.addAttribute("greeting", new Login());
    return "greeting";
  }

  @PostMapping(value="/greeting")
  public String greetingSubmit(@ModelAttribute ("greeting") Login greeting, Model model) 
  {
	  Greeting a1=new Greeting();
	  a1.setContent("shalaka");
	  model.addAttribute("greeting", greeting);
    if(greeting.getContent().equals(a1.getContent()))
    	return "result";
    return "greeting";
  }
}*/