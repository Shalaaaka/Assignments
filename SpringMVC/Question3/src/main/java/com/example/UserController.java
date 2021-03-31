package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
	@RequestMapping("/login")  
	public String submit(@ModelAttribute ("data") Data_Model data,Model model)
	{
		if((data.getUsername().equals("Shalaka"))&&(data.getPassword().equals("123")))
		{
			model.addAttribute("message", "welcome "+ data.getUsername());
			return "success.jsp";
		}
		model.addAttribute("message","Wrong username and password");
		return "error.jsp";
	}
}
	   

/*public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		  String username=request.getParameter("username");  
	      String password=request.getParameter("password");
	      String message;
	      if(username.equals("Shalaka") && password.equals("123"))
	      {
	    	  message = "Welcome " +username + ".";
		      return new ModelAndView("success.jsp", 
		    		  "message", message);  
	 
	      }
	      else
	      {
	    	  message = "Wrong username and password.";
	    	  return new ModelAndView("error.jsp", 
	    			  "message", message);
	      }
	   }*/
