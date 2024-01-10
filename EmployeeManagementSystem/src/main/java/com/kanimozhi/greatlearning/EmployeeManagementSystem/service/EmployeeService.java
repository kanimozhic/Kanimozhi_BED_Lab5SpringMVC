package com.kanimozhi.greatlearning.EmployeeManagementSystem.service;

import java.util.List;

import com.kanimozhi.greatlearning.EmployeeManagementSystem.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

	void deleteEmployeeById(Long id);
}