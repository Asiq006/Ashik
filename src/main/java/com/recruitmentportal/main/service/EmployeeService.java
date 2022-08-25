package com.recruitmentportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepositoryInterface.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		return employeeRepositoryInterface.getEmployeeById(employeeId);
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeRepositoryInterface.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeByLoginId(String loginId) {
		return employeeRepositoryInterface.getEmployeeByLoginId(loginId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeRepositoryInterface.updateEmployee(employee);
	}


}
