package com.toby.employeeProject.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.toby.employeeProject.JPARepository.EmployeeRepository;
import com.toby.employeeProject.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class EmployeeDao implements EmployeeDaoIntf {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return employee;

	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		Employee employee = employeeRepository.findById(id).get();
		return employee;
	}

	@Override
	@Transactional
	public ArrayList<Employee> getAllEmployees() {
		ArrayList<Employee> employees = (ArrayList<Employee>) employeeRepository.findAll();
		return employees;
	}

	@Override
	@Transactional
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Success";
	}

}
