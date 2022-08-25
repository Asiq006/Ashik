package com.recruitmentportal.main.repository;

import java.util.List;

import com.recruitmentportal.main.pojo.Employee;


public interface EmployeeRepositoryInterface {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(String employeeId);
	public boolean addEmployee(Employee employee );
	public Employee getEmployeeByLoginId(String loginId);
	public boolean updateEmployee(Employee employee);

}
