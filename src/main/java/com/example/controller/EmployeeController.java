package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Address;
import com.example.beans.Employee;
import com.example.exception.EmployeeNotFoundException;
@RestController
public class EmployeeController {

	List<Employee> list=new ArrayList<>();
	@GetMapping("/hello-world")
	public String helloService() {
		return "Hello World";
	}
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1,"Raj Kumar",new Address(100,"Delhi"));
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		
		list.add(new Employee(2,"Raju",new Address(100,"Patna")));
		list.add(new Employee(3,"Laju",new Address(100,"Gaya")));
		list.add(new Employee(4,"Taju",new Address(100,"Chapra")));
		return list;
	}
	
//	@GetMapping("/employee/{id}/{firstName}/{lastName}")
//	public Employee getEmployeePathVar(@PathVariable("id") int id,@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
//		return new Employee(id,firstName,lastName);
//	}
//	
//	@GetMapping("/employee/query")
//	public Employee getEmployeeRequestParam(@RequestParam(name="id") int id,@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName") String lastName) {
//		return new Employee(id,firstName,lastName);
//	}
	
	@PostMapping("/empSave")
	public Employee saveEmployee(@RequestBody Employee employee) {
		list.add(employee);
		return employee;
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employee.setName("John");
		list.add(employee);
		return employee;
	}
	
	@PutMapping("/errUpdate")
	public Employee errUpdate() {
		throw new EmployeeNotFoundException();
	}
}
