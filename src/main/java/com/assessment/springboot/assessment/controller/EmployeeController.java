package com.assessment.springboot.assessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.springboot.assessment.entity.Employee;
import com.assessment.springboot.assessment.service.EmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/")
public class EmployeeController 
{
		@Autowired
		private EmployeeService employeeService;

		
		@GetMapping("/list")
		public List<Employee> getAll(){
			return employeeService.getAll();
		}
		

		@PostMapping("/form")
		public Employee create(@RequestBody Employee theEmployee) {
			
			employeeService.save(theEmployee);
			return theEmployee;
		}

	
		
		
		
	}