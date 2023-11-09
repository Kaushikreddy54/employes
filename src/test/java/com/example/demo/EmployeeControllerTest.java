/*package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.Employee.Employee;
import com.example.demo.Employee.EmployeeController;
import com.example.demo.Employee.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest (controllers = EmployeeController.class)
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockBean
	private EmployeeService service;
	
	private List<Employee> employees;
	
	private Optional<Employee> employeeById;
	
	private Employee emp;
	
	private Employee updateEmployee;
	
	private Employee deleteEmployee;
	
	@BeforeEach
	void setUp()
	{
		employees = List.of(new Employee("j07af2","E1","JOHN","CENA",987654321,"J1",40000,"M01","D1"), new Employee("z85fb3","E2","MARK","HENRY",798563412,"J2",60000,"M02","D2"), new Employee("w65nl4","E3","CHRIS","GEORGE",896754231,"J3",120000,"M03","D3"), new Employee("s49oi5","E4","JOSEPH","WILLY",639854217,"J4",180000,"M04","D4"));
		emp = new Employee("1234567","E5","ABCD","EFGH",754698213,"J5",250000,"M05","D5");
		employeeById = Optional.of(new Employee("1234567","E5","ABCD","EFGH",754698213,"J5",250000,"M05","D5"));
	}
	
	@Test
	//@Disabled
	void createEmployeeTest() throws Exception
	{
		Mockito.when(service.create(Mockito.any(Employee.class))).thenReturn(emp);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/employee")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(emp).getBytes(StandardCharsets.UTF_8))
				.accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		Assertions.assertThat(result).isNotNull();
		String empJson = result.getResponse().getContentAsString();
		Assertions.assertThat(empJson).isNotEmpty();
		Assertions.assertThat(empJson).isEqualToIgnoringCase(mapper.writeValueAsString(emp));
	}
	
	@Test
	//@Disabled
	void getEmployeesTest() throws Exception
	{
		Mockito.when(service.getAll()).thenReturn(employees);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/employees")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		Assertions.assertThat(result).isNotNull();
		String empJson = result.getResponse().getContentAsString();
		Assertions.assertThat(empJson).isEqualToIgnoringCase(mapper.writeValueAsString(employees));
	}
	
	@Test
	//@Disabled
	void getEmployeeByIdTest() throws Exception
	{
		String id = "65412256956f9843dc665ff2";
		Mockito.when(service.getById(id)).thenReturn(employeeById);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/employee/65412256956f9843dc665ff2")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		Assertions.assertThat(result).isNotNull();
		String empJson = result.getResponse().getContentAsString();
		Assertions.assertThat(empJson).isNotEqualToIgnoringCase(mapper.writeValueAsString(employeeById));
	}
	
	@Test
	//@Disabled
	void updateEmployeeByIdTest() throws Exception
	{
		String id = "65412256956f9843dc665ff2";
		Mockito.when(service.update(id, emp)).thenReturn(emp);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.put("/employee/65412256956f9843dc665ff2")
				.contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsString(emp).getBytes(StandardCharsets.UTF_8))
				.accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		Assertions.assertThat(result).isNotNull();
		String empJson = result.getResponse().getContentAsString();
		Assertions.assertThat(empJson).isEqualToIgnoringCase(mapper.writeValueAsString(emp));
	}
	
	@Test
	//@Disabled
	void deleteEmployeeByIdTest() throws Exception
	{
		String id = "65412256956f9843dc665ff2";
		
		Mockito.when(service.getById(id)).thenReturn(null);
		
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.delete("/employee/65412256956f9843dc665ff2"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Assertions.assertThat(result).isNotNull();
	}

}*/
