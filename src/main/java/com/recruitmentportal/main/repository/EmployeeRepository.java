package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.Employee;

@Repository
public class EmployeeRepository implements EmployeeRepositoryInterface {

	private static final String GET_ALL_EMPLOYEES="SELECT * FROM employee_details ORDER BY employee_id";
	private static final String GET_EMPLOYEE_BY_EMPLOYEE_ID="SELECT * FROM employee_details WHERE employee_id=?";
	private static final String ADD_EMPLOYEE="INSERT INTO employee_details VALUES ('MGS'||employee_main_sequence.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String GET_EMPLOYEE_BY_LOGIN_ID="SELECT * FROM employee_details WHERE login_id=?";
	private static final String UPDATE_EMPLOYEE_PROJECT_ID="UPDATE employee_details SET project_id=? WHERE employee_id=?";
	

	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> getAllEmployees() {
		EmployeeRowMapper employeeRowMapper= new EmployeeRowMapper();
		List<Employee> allemployees = jdbcTemplate.query(GET_ALL_EMPLOYEES, employeeRowMapper);
		return allemployees;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		EmployeeRowMapper employeeRowMapper= new EmployeeRowMapper();
		Object[] args = {employeeId};
		Employee employee = jdbcTemplate.queryForObject(GET_EMPLOYEE_BY_EMPLOYEE_ID, employeeRowMapper, args);
		return employee;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		Object[] args = {employee.getName(),employee.getDesignation(),employee.getSalary(),employee.getEmail(),employee.getTechnicalExpertise1(),
				employee.getTechnicalExpertise2(),employee.getTechnicalExpertise3(),employee.getExperience(),
				employee.getProjectDetails().getProjectId(),employee.getLoginDetails().getLoginId(),employee.getReportsTo()};
		int employeeadded = jdbcTemplate.update(ADD_EMPLOYEE, args);
		if (employeeadded>0) {
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployeeByLoginId(String loginId) {
		EmployeeRowMapper employeeRowMapper= new EmployeeRowMapper();
		Object[] args = {loginId};
		Employee employeeDetails = jdbcTemplate.queryForObject(GET_EMPLOYEE_BY_LOGIN_ID, employeeRowMapper, args);
		return employeeDetails;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Object[] args = {employee.getProjectDetails().getProjectId(),employee.getEmployeeId()};
		int employeeupdated = jdbcTemplate.update(UPDATE_EMPLOYEE_PROJECT_ID, args);
		if (employeeupdated>0) {
			return true;
		}
		return false;
	}

	
}
