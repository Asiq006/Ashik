package com.recruitmentportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.ProjectDetails;
import com.recruitmentportal.main.service.ProjectDetailsServiceInterface;


@CrossOrigin("http://localhost:4200")
@RequestMapping("hrportalapi")
@RestController
public class ProjectDetailsController {
	@Autowired
	private ProjectDetailsServiceInterface projectDetailsService;

	@RequestMapping(value = "projectdetails/all", method = RequestMethod.GET)
	public List<ProjectDetails> allDetails() {
		List<ProjectDetails> details = projectDetailsService.getAllDetails();
		return details;
	}

	@RequestMapping(value = "projectdetails/addnew", method = RequestMethod.POST)
	public boolean addnewDetails(@RequestBody  ProjectDetails projectDetails) {

		return projectDetailsService.addnewDetails(projectDetails);
	}

	@RequestMapping(value = "projectdetails/{project_id}", method = RequestMethod.GET)
	public ProjectDetails getSingleDetails(@PathVariable int project_id) {
		ProjectDetails singleDetails = projectDetailsService.getSingleDetails(project_id);
		return singleDetails;
	}
}
