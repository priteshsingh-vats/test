package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employee")
	public List<Employee> getEmp()
	{
		return empService.get();
	}
	@GetMapping("/xyz")
	public String hello()
	{
		return "Hello";
	}
}
