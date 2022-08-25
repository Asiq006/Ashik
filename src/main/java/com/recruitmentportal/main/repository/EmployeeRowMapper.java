package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.LoginDetails;
import com.recruitmentportal.main.pojo.ProjectDetails;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee= new Employee();
		
		ProjectDetails projectDetails= new  ProjectDetails();
		projectDetails.setProjectId(rs.getInt("project_id"));
		
		LoginDetails loginDetails= new LoginDetails();
		loginDetails.setLoginId(rs.getString("login_id"));
		
		employee.setEmployeeId(rs.getString("employee_id"));
		employee.setName(rs.getString("employee_name"));
		employee.setDesignation(rs.getString("designation"));
		employee.setSalary(rs.getDouble("salary"));
		employee.setEmail(rs.getString("email"));
		employee.setTechnicalExpertise1(rs.getString("technical_expertise_1"));
		employee.setTechnicalExpertise2(rs.getString("technical_expertise_2"));
		employee.setTechnicalExpertise3(rs.getString("technical_expertise_3"));
		employee.setExperience(rs.getInt("experience"));
		employee.setReportsTo(rs.getString("reports_to"));
		employee.setProjectDetails(projectDetails);
		employee.setLoginDetails(loginDetails);
		
		return employee;
	}

}
