package com.toby.employeeProject.JPARepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toby.employeeProject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
