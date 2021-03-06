package com.example.Question5.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees=new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	/*public Employee getEmployee(String id)
	{
		return employeeRepository.findOne(id);
	}*/
	
	public void addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String id,Employee employee)
	{
		employeeRepository.save(employee);
	}
	/*public void deleteEmployee(String id)
	{
		employeeRepository.delete(id);
	}*/
}
