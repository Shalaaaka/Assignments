package com.example.Question5.employee;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	
	private EmployeeService employeeservice;
	
	@RequestMapping("/topics")//default - GET
	public List<Employee> getAllEmployees()
	{
		return employeeservice.getAllEmployees();
	}
	
	/*@RequestMapping("/topics/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return employeeservice.getEmployee(id);
	}*/
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeservice.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{id}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable String id)
	{
		employeeservice.updateEmployee(id,emp);
	}
	
	/*@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		employeeservice.deleteEmployee(id);
	}*/
	

}
