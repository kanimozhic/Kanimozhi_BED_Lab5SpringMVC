package com.kanimozhi.greatlearning.EmployeeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanimozhi.greatlearning.EmployeeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}