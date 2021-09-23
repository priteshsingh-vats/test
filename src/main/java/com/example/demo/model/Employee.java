package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int employeecode;
	String employeename;
	String location;
	String email;
	Date dob;
	public int getEmployeeCode() {
		return employeecode;
	}
	public void setEmployeeCode(int employeeCode) {
		employeecode = employeeCode;
	}
	public String getEmployeeName() {
		return employeename;
	}
	public void setEmployeeName(String employeeName) {
		employeename = employeeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employee(int employeeCode, String employeeName, String location, String email, Date dob) {
		super();
		employeecode = employeeCode;
		employeename = employeeName;
		location = location;
		email = email;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
