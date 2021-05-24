package com.assessment.springboot.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.springboot.assessment.dao.EmployeeRepository;
import com.assessment.springboot.assessment.entity.Employee;

@Service
public class DatabaseEmployeeService implements EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
		
	}



	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);

	}



}
