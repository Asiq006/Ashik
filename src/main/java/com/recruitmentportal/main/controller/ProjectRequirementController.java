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
import com.recruitmentportal.main.pojo.ProjectRequirement;
import com.recruitmentportal.main.service.ProjectRequirementServiceInterface;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("hrportalapi")
public class ProjectRequirementController {

	@Autowired
	private ProjectRequirementServiceInterface projectRequirementService;

	@RequestMapping(value = "projectrequirement/getall", method = RequestMethod.GET)
	public List<ProjectRequirement> allRequirements() {
		List<ProjectRequirement> allRequirements = projectRequirementService.getAllRequirements();
		return allRequirements;
	}

	@RequestMapping(value = "projectrequirement/addnew", method = RequestMethod.POST)
	public boolean addNewRequirement(@RequestBody ProjectRequirement projectRequirement) {
		return projectRequirementService.addnewEmployee(projectRequirement);
	}

	@RequestMapping(value = "projectrequirement/getsingle/{employeeId}", method = RequestMethod.GET)
	public ProjectRequirement getEmployeeById(@PathVariable String employeeId) {
		ProjectRequirement employeeById = projectRequirementService.getEmployeeById(employeeId);
		return employeeById;
	}

	@RequestMapping(value = "projectrequirement/getstatus/{status}", method = RequestMethod.GET)
	public List<ProjectRequirement> getAllStatus(@PathVariable String status) {
		List<ProjectRequirement> allStatus = projectRequirementService.getAllStatus(status);
		return allStatus;

	}

	@RequestMapping(value = "projectrequirement/workbenchemployees", method = RequestMethod.POST)
	public List<Employee> getWorkBenchEmployees(@RequestBody ProjectRequirement projectRequirement) {
		List<Employee> workBenchEmployees = projectRequirementService.getWorkBenchEmployees(projectRequirement);
		return workBenchEmployees;
	}

	@RequestMapping(value = "projectrequirement/updatevacancy", method = RequestMethod.PUT)
	public boolean updateVacancy(@RequestBody ProjectRequirement projectRequirement) {
		System.out.println("in updateVacancy");
		System.out.println(projectRequirement);
		return projectRequirementService.updateVacancy(projectRequirement);

	}
	
	@RequestMapping(value = "projectrequirement/getsinglerequirement/{requirementId}", method = RequestMethod.GET)
	public ProjectRequirement getRequirementByRequirementId(@PathVariable String requirementId) {
		return projectRequirementService.getRequirementByRequirementId(requirementId);
	}
	
	@RequestMapping(value = "projectrequirement/updaterequirementstatus", method = RequestMethod.PUT)
	public boolean updateStatus(@RequestBody ProjectRequirement projectRequirement) {
		return projectRequirementService.updateStatus(projectRequirement);
		
	}
	
	@RequestMapping(value = "projectrequirement/updatestatustopublished", method = RequestMethod.PUT)
	public boolean updateStatusToPublish(@RequestBody ProjectRequirement projectRequirement) {
		return projectRequirementService.updateStatusToPublish(projectRequirement);

	}
	
	@RequestMapping(value = "projectrequirement/updaterequirementvacancy", method = RequestMethod.PUT)
	public boolean updateRequirementVacancy(@RequestBody ProjectRequirement projectRequirement) {
		return projectRequirementService.updateRequirementVacancy(projectRequirement);
	
	
	}
	
	@RequestMapping(value = "projectrequirement/getemployee/{requirementId}", method = RequestMethod.GET)
	public ProjectRequirement getEmployeeByRequirementId(@PathVariable String requirementId) {
		return projectRequirementService.getEmployeeByRequirementId(requirementId);

	}
}