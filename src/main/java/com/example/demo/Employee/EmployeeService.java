package com.example.demo.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository er;
	
	public Employee create (Employee emp)
	{
		return er.save(emp);
	}
	
	public List<Employee> getAll()
	{
		return er.findAll();
	}
	
	public Optional<Employee> getById(String id)
	{
		return er.findById(id);
	}
	
	public Employee update (String id,Employee emp)
	{
		emp.setId(id);
		return er.save(emp);
	}
	
	public String delete (String id)
	{
		er.deleteById(id);
		return "Employee with id:" + id + "deleted successfully.";
	}

}
