package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	@Override
	@Transactional
	public List<Employee> get() {
	return employeeDao.get();
	}

	@Override
	@Transactional
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
