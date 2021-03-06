package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EmpDao;
import com.example.model.Emp;
import com.sun.tools.javac.util.List;

public class EmpController 
{
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String showform(Model model)
	{
		model.addAttribute("command",new Emp());
		return "empform";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("emp") Emp emp)
	{    
        dao.save(emp);    
        return "redirect:/viewemp"; 
    }   
	
	@RequestMapping("/viewemp")    
    public String viewemp(Model model)
	{    
        List<Emp> list=(List<Emp>) dao.getEmployees();    
        model.addAttribute("list",list);  
        return "viewemp";    
    }    
	
	@RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable int id, Model model)
	{    
        Emp emp=dao.getEmpById(id);    
        model.addAttribute("command",emp);  
        return "empeditform";    
    }   
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Emp emp)
	{    
        dao.update(emp);    
        return "redirect:/viewemp";    
    }   
	
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id)
	{    
        dao.delete(id);    
        return "redirect:/viewemp";    
    }     
}
