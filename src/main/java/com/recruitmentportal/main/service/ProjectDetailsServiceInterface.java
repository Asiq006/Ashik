package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.ProjectDetails;
import com.recruitmentportal.main.pojo.ProjectRequirement;

public interface ProjectDetailsServiceInterface {
	
	public List<ProjectDetails> getAllDetails();
	public boolean addnewDetails(ProjectDetails projectDetails);
	public ProjectDetails getSingleDetails(int project_id);
	

}
