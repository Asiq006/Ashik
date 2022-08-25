package com.recruitmentportal.main.pojo;

public class ProjectDetails {
	
	private int projectId;
	private String projectName;
	private String projectLocation;
	
	public ProjectDetails() {
	}

	public ProjectDetails(int projectId, String projectName, String projectLocation) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", projectLocation="
				+ projectLocation + "]";
	}
	
	

}
