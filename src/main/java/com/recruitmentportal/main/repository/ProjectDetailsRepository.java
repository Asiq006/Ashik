package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.ProjectDetails;

@Repository
public class ProjectDetailsRepository implements ProjectDetailsRepositoryInterface {

	private static final String INSERT_NEW_DETAILS = "INSERT INTO project_details VALUES (?,?,?)";
	private static final String GET_SINGLE_DETAILS = "SELECT * FROM project_details WHERE project_id=?";
	private static final String GET_ALL_DETAILS = " SELECT * FROM project_details ORDER BY project_id";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ProjectDetails> getAllDetails() {

		ProjectDetailsRowMapper projectDetailsRowMapper = new ProjectDetailsRowMapper();
		List<ProjectDetails> details = jdbcTemplate.query(GET_ALL_DETAILS, projectDetailsRowMapper);
		return details;
	}

	@Override
	public boolean addnewDetails(ProjectDetails projectDetails) {

		Object[] args = { projectDetails.getProjectId(), projectDetails.getProjectName(),
				projectDetails.getProjectLocation() };
		int count = jdbcTemplate.update(INSERT_NEW_DETAILS, args);
		if (count > 0) {
			return true;
		}

		return false;

	}

	@Override
	public ProjectDetails getSingleDetails(int project_id) {

		Object[] args = { project_id };
		ProjectDetailsRowMapper projectDetailsRowMapper = new ProjectDetailsRowMapper();
		ProjectDetails projectDetails = jdbcTemplate.queryForObject(GET_SINGLE_DETAILS, projectDetailsRowMapper, args);

		return projectDetails;
	}

}
