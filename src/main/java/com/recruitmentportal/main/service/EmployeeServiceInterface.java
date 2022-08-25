package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.Employee;

public interface EmployeeServiceInterface {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(String employeeId);
	public boolean addEmployee(Employee employee );
	public Employee getEmployeeByLoginId(String loginId);
	public boolean updateEmployee(Employee employee);

}
