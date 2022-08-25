package com.recruitmentportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.ProjectRequirement;
import com.recruitmentportal.main.repository.ProjectRequirementRepositoryInterface;

@Service
public class ProjectRequirementService implements ProjectRequirementServiceInterface {

	@Autowired
	private ProjectRequirementRepositoryInterface projectRequirementRepository;

	@Override
	public List<ProjectRequirement> getAllRequirements() {
		return projectRequirementRepository.getAllRequirements();
	}

	@Override
	public boolean addnewEmployee(ProjectRequirement projectRequirement) {
		return projectRequirementRepository.addnewEmployee(projectRequirement);
	}

	@Override
	public ProjectRequirement getEmployeeById(String employeeId) {
		return projectRequirementRepository.getEmployeeById(employeeId);
	}

	@Override
	public List<ProjectRequirement> getAllStatus(String status) {
		return projectRequirementRepository.getAllStatus(status);
	}

	public List<Employee> getWorkBenchEmployees(ProjectRequirement projectRequirement) {
		return projectRequirementRepository.getWorkBenchEmployees(projectRequirement);
	}

	@Override
	public boolean updateVacancy(ProjectRequirement projectRequirement) {
	
		return projectRequirementRepository.updateVacancy(projectRequirement);
	}

	@Override
	public ProjectRequirement getRequirementByRequirementId(String requirementId) {
	
		return projectRequirementRepository.getRequirementByRequirementId(requirementId);
	}

	@Override
	public boolean updateStatus(ProjectRequirement projectRequirement) {
		return projectRequirementRepository.updateStatus(projectRequirement);
	}

	@Override
	public boolean updateStatusToPublish(ProjectRequirement projectRequirement) {
		return projectRequirementRepository.updateStatusToPublish(projectRequirement);
	}

	@Override
	public boolean updateRequirementVacancy(ProjectRequirement projectRequirement) {
		// TODO Auto-generated method stub
		return projectRequirementRepository.updateRequirementVacancy(projectRequirement);
	}

	@Override
	public ProjectRequirement getEmployeeByRequirementId(String requirementId) {
	
		return projectRequirementRepository.getEmployeeByRequirementId(requirementId);
	}

	
}
