package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.ProjectRequirement;

@Repository
public class ProjectRequirementRepository implements ProjectRequirementRepositoryInterface {

	private static final String INSERT_NEW_DETAILS = "INSERT INTO project_requirement VALUES ('REQ'||project_requirement_sequence.NEXTVAL,?,?,?,?,?,?,?)";
	private static final String GET_SINGLE_DETAILS = "SELECT * FROM project_requirement WHERE employee_id=?";
	private static final String GET_SINGLE_REQUIREMENT_DETAILS = "SELECT * FROM project_requirement WHERE requirement_id=?";
	private static final String GET_SINGLE_EMPLOYEE_BY_REQUIREMENT_ID = "SELECT * FROM project_requirement WHERE requirement_id=?";
	private static final String GET_ALL_DETAILS = " SELECT * FROM project_requirement ORDER BY requirement_id";
	private static final String GET_ALL_STATUS = " SELECT * FROM project_requirement WHERE status=?";
	private static final String GET_WORKBENCH_EMPLOYEES = "SELECT * FROM employee_details WHERE project_id=1 AND experience>=? AND technical_expertise_1=? AND technical_expertise_2=? AND technical_expertise_3=?";
	private static final String UPDATE_REQUIREMENT_VACANCY = "UPDATE project_requirement SET no_of_vacancies = no_of_vacancies - 1 WHERE requirement_id=?";
	private static final String UPDATE_STATUS_APPROVED = " UPDATE project_requirement SET status=? WHERE requirement_id=?";
	private static final String UPDATE_STATUS_TO_PUBLISHED = " UPDATE project_requirement SET status=? WHERE requirement_id=?";
	private static final String UPDATE_REQUIREMENT_VACANCY_BY_REQUIREMENT_ID = "UPDATE project_requirement SET no_of_vacancies = no_of_vacancies - 1 WHERE requirement_id=?";


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ProjectRequirement> getAllRequirements() {
		ProjectRequirementRowMapper projectRequirementRowMapper = new ProjectRequirementRowMapper();
		List<ProjectRequirement> query = jdbcTemplate.query(GET_ALL_DETAILS, projectRequirementRowMapper);

		return query;
	}

	@Override
	public boolean addnewEmployee(ProjectRequirement projectRequirement) {

		Object[] args = { projectRequirement.getExperience(), projectRequirement.getTechnicalExpertise1(),
				projectRequirement.getTechnicalExpertise2(), projectRequirement.getTechnicalExpertise3(),
				projectRequirement.getNoofVacancies(), projectRequirement.getEmployee().getEmployeeId(),
				projectRequirement.getStatus() };
		int count = jdbcTemplate.update(INSERT_NEW_DETAILS, args);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public ProjectRequirement getEmployeeById(String employeeId) {
		ProjectRequirementRowMapper projectRequirementRowMapper = new ProjectRequirementRowMapper();
		Object[] args = { employeeId };
		ProjectRequirement singleEmployee = jdbcTemplate.queryForObject(GET_SINGLE_DETAILS, projectRequirementRowMapper,
				args);
		return singleEmployee;
	}

	@Override
	public List<ProjectRequirement> getAllStatus(String status) {
		Object[] args = { status };
		ProjectRequirementRowMapper projectRequirementRowMapper = new ProjectRequirementRowMapper();
		List<ProjectRequirement> allstatus = jdbcTemplate.query(GET_ALL_STATUS, projectRequirementRowMapper, args);
		return allstatus;
	}

	@Override
	public List<Employee> getWorkBenchEmployees(ProjectRequirement projectRequirement) {
		System.out.println(projectRequirement);
		Object[] args = { projectRequirement.getExperience(), projectRequirement.getTechnicalExpertise1(),
				projectRequirement.getTechnicalExpertise2(), projectRequirement.getTechnicalExpertise3() };
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee> workbench = jdbcTemplate.query(GET_WORKBENCH_EMPLOYEES, employeeRowMapper, args);
		return workbench;
	}

	@Override
	public boolean updateVacancy(ProjectRequirement projectRequirement) {
		Object[] args = { projectRequirement.getRequirementId() };
		int updatedvacancy = jdbcTemplate.update(UPDATE_REQUIREMENT_VACANCY, args);
		if (updatedvacancy > 0) {
			return true;
		}
		return false;
	}

	@Override
	public ProjectRequirement getRequirementByRequirementId(String requirementId) {
		Object[] args = { requirementId };
		ProjectRequirementRowMapper projectRequirementRowMapper = new ProjectRequirementRowMapper();
		ProjectRequirement singlerequirement = jdbcTemplate.queryForObject(GET_SINGLE_REQUIREMENT_DETAILS,
				projectRequirementRowMapper, args);
		return singlerequirement;

	}

	@Override
	public boolean updateStatus(ProjectRequirement projectRequirement) {
		Object[] args = {projectRequirement.getStatus(), projectRequirement.getRequirementId() };
		int updatedstatus = jdbcTemplate.update(UPDATE_STATUS_APPROVED, args);
		
		if (updatedstatus > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateStatusToPublish(ProjectRequirement projectRequirement) {
		Object[] args = {projectRequirement.getStatus(), projectRequirement.getRequirementId() };
		int updatestatustopublish = jdbcTemplate.update(UPDATE_STATUS_TO_PUBLISHED, args);
		
		if (updatestatustopublish > 0) {
			return true;
		}
		return false;	}



	@Override
	public boolean updateRequirementVacancy(ProjectRequirement projectRequirement) {
		Object[] args = {projectRequirement.getRequirementId()};
		int updaterequirementvacancy = jdbcTemplate.update(UPDATE_REQUIREMENT_VACANCY_BY_REQUIREMENT_ID, args);
		
		if (updaterequirementvacancy > 0) {
			return true;
		}
		return false;	
		}

	@Override
	public 	ProjectRequirement getEmployeeByRequirementId(String requirementId) {
		ProjectRequirementRowMapper projectRequirementRowMapper = new ProjectRequirementRowMapper();
		ProjectRequirement object = jdbcTemplate.queryForObject(GET_SINGLE_EMPLOYEE_BY_REQUIREMENT_ID,projectRequirementRowMapper, requirementId);
		return object;
	}


	
	}



