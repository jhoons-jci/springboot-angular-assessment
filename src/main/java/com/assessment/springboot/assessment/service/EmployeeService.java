package com.assessment.springboot.assessment.service;

import java.util.List;
import java.util.Optional;

import com.assessment.springboot.assessment.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	
	
	public void save(Employee theEmployee);
	

}
