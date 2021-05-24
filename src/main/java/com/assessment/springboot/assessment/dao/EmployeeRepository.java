package com.assessment.springboot.assessment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.springboot.assessment.entity.Employee;

@Repository
public interface EmployeeRepository extends 
JpaRepository<Employee, Integer> {


}
