package com.recruitmentportal.main.repository;

import java.util.List;

import com.recruitmentportal.main.pojo.ProjectDetails;

public interface ProjectDetailsRepositoryInterface {

	public List<ProjectDetails> getAllDetails();
	public boolean addnewDetails(ProjectDetails projectDetails);
	public ProjectDetails getSingleDetails(int project_id);
}
