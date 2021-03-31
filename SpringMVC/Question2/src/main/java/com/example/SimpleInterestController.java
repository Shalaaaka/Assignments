package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleInterestController 
{
	@RequestMapping("/simpleinterest")
	public String display(@ModelAttribute Data data,Model model)
	{
		String si="Simple Interest: "+data.calculate();
		model.addAttribute("answer",si);
		return "simpleInterest.jsp";
	}
}
