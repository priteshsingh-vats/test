package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
	

}
