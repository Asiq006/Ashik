package com.recruitmentportal.main.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.ProjectDetails;
import com.recruitmentportal.main.pojo.ProjectRequirement;
import com.recruitmentportal.main.repository.ProjectDetailsRepositoryInterface;

	@Service
	public class ProjectDetailsService implements ProjectDetailsServiceInterface {
	@Autowired
	private ProjectDetailsRepositoryInterface projectDetailsRepository;

	@Override
	public List<ProjectDetails> getAllDetails() {
		
		return projectDetailsRepository.getAllDetails();
	}

	@Override
	public boolean addnewDetails(ProjectDetails projectDetails) {
		
		return projectDetailsRepository.addnewDetails(projectDetails);
	}

	@Override
	public ProjectDetails getSingleDetails(int project_Id) {
		
		return projectDetailsRepository.getSingleDetails(project_Id);
	}

	

}
