package com.example.demo.Employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="EMPLOYEE")
public class Employee {
	
	/*public Employee(String string, String string2, String string3, String string4, int i, String string5, int j,
			String string6, String string7)
	{
		
	}*/
	
	@Id
	public String id;
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private int phoneNum;
	private String jobId;
	private int salary;
	private String managerId;
	private String deptId;

}
