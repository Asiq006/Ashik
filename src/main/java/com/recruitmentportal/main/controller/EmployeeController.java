package com.recruitmentportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.service.EmployeeServiceInterface;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("hrportalapi/employee")

public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	
	
	@RequestMapping(value = "allemployees" , method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
		return allEmployees;
	}
	
	@RequestMapping( value= "employeedetails/{employeeId}" , method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable String employeeId) {
		Employee employeeById = employeeServiceInterface.getEmployeeById(employeeId);
		return employeeById;
	}
	
	@RequestMapping( value= "addemployee" , method = RequestMethod.POST)
	public boolean addEmployee(@RequestBody Employee employee) {
		boolean addEmployee = employeeServiceInterface.addEmployee(employee);
		return addEmployee;
	}
	
	@RequestMapping( value= "employeedetails/byloginid/{loginId}" , method = RequestMethod.GET)
	public Employee getEmployeeByLoginId(@PathVariable String loginId) {
		Employee employeeByLoginId = employeeServiceInterface.getEmployeeByLoginId(loginId);
		return employeeByLoginId;
	}
	
	@RequestMapping( value= "updateemployee" , method = RequestMethod.PUT)
	public boolean updateEmployee(@RequestBody Employee employee) {
		return employeeServiceInterface.updateEmployee(employee);
		
		
	}
}
