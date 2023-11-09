package com.example.demo.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService es;
	
	@PostMapping("/employee")
	public Employee createEmployee (@Validated @RequestBody Employee emp)
	{
		return es.create(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return es.getAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById (@PathVariable String id)
	{
		return es.getById(id);
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee (@PathVariable String id, @Validated @RequestBody Employee emp)
	{
		return es.update(id, emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee (@PathVariable String id)
	{
		es.delete(id);
		return "Employee with id:" + id + "deleted successfully.";
	}

}
