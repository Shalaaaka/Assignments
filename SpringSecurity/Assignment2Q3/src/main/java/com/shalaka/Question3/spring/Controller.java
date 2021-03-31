package com.shalaka.Question3.spring;
import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shalaka.Question3.bean.Student;

@RestController
@RequestMapping("/app")
public class Controller {
	@RequestMapping
	public String login() {
 		return "customLogin";
 	} 	
	@RequestMapping("/secure/home")
	public String homePage(Model model) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Shankar"));
		list.add(new Student(2, "Vishnu"));
		list.add(new Student(3, "Bhahma"));
		model.addAttribute("list", list);
 		return "home";
 	}    
}