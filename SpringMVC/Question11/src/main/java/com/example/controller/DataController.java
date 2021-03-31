package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class DataController extends AbstractController 
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String output = ServletRequestUtils.getStringParameter(request, "output");
		
		Map<String,String> empdata = new HashMap<String,String>();
		empdata.put("Shalaka", "$1000");
		empdata.put("Amana", "$2000");
		empdata.put("Megha", "$3000");
		empdata.put("Raveena", "$4000");
		
		if(output ==null || "".equals(output))
		{
			return new ModelAndView("empsummary","empdata",empdata);
			
		}
		else if("PDF".equals(output.toUpperCase()))
		{
			return new ModelAndView("pdfempsummary","empdata",empdata);
			
		}
		else
		{
			return new ModelAndView("empsummary","empdata",empdata);
			
		}
	}

}
