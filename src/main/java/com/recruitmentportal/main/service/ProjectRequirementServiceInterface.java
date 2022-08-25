package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.ProjectRequirement;

public interface ProjectRequirementServiceInterface {

	public List<ProjectRequirement> getAllRequirements();

	public boolean addnewEmployee(ProjectRequirement projectRequirement);

	public ProjectRequirement getEmployeeById(String employeeId);

	public List<ProjectRequirement> getAllStatus(String status);
	
	public List<Employee> getWorkBenchEmployees(ProjectRequirement projectRequirement);
	
	public boolean updateVacancy(ProjectRequirement projectRequirement);
	
	public ProjectRequirement getRequirementByRequirementId(String requirementId);

	public boolean  updateStatus(ProjectRequirement projectRequirement);

	public boolean  updateStatusToPublish(ProjectRequirement projectRequirement);
	
	public boolean updateRequirementVacancy(ProjectRequirement projectRequirement);
	
	public ProjectRequirement getEmployeeByRequirementId(String requirementId);




}
