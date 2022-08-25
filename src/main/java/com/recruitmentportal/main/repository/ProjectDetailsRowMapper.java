package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.ProjectDetails;

public class ProjectDetailsRowMapper implements RowMapper<ProjectDetails> {

	@Override
	public ProjectDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		ProjectDetails projectDetails = new ProjectDetails();
			
    	projectDetails.setProjectId(rs.getInt("project_id"));
		projectDetails.setProjectName(rs.getString("project_name"));
		projectDetails.setProjectLocation(rs.getString("project_location"));

		return projectDetails;
	}

}
