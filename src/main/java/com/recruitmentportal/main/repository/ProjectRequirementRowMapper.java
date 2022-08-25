package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.ProjectRequirement;

public class ProjectRequirementRowMapper implements RowMapper<ProjectRequirement> {

	@Override
	public ProjectRequirement mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ProjectRequirement projectRequirement= new ProjectRequirement();
		
		Employee employee= new Employee();
		
		employee.setEmployeeId(rs.getString("employee_id"));
		
		projectRequirement.setEmployee(employee);
		
		 projectRequirement.setRequirementId(rs.getString("requirement_id"));
		 projectRequirement.setExperience(rs.getInt("experience"));
		 projectRequirement.setTechnicalExpertise1(rs.getString("technical_expertise_1"));
		 projectRequirement.setTechnicalExpertise2(rs.getString("technical_expertise_2"));
		 projectRequirement.setTechnicalExpertise3(rs.getString("technical_expertise_3"));
		 projectRequirement.setNoofVacancies(rs.getInt("no_of_vacancies"));
		 projectRequirement.setStatus(rs.getString("status"));
		
		
		return projectRequirement;
	}

}
