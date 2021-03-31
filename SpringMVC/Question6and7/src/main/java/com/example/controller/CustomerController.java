package com.example.controller;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Customer;

@Controller
public class CustomerController 
{
	@RequestMapping("/registration")
	public String home(Model model)
	{
		model.addAttribute("cus",new Customer());
		return "registration.jsp";
	}
	
	@RequestMapping("/result")
	public String show(@Valid @ModelAttribute("cus") Customer customer,BindingResult br)
	{
		if(br.hasErrors())  
        {  
			System.out.println("Error occured");
            return "registration.jsp";  
        }  
        else  
        {  
        return "success.jsp";  
        }   
	}

}
