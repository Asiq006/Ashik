package com.recruitmentportal.main.pojo;

public class ProjectRequirement {
	private String requirementId;
	private int experience;
	private String technicalExpertise1;
	private String technicalExpertise2;
	private String technicalExpertise3;
	private int noofVacancies;
	Employee employee;
	private String status;
	
	public ProjectRequirement() {
		
	}
	
	public ProjectRequirement(String requirementId, int experience, String technicalExpertise1,
			String technicalExpertise2, String technicalExpertise3, int noofVacancies, Employee employee,
			String status) {
		super();
		this.requirementId = requirementId;
		this.experience = experience;
		this.technicalExpertise1 = technicalExpertise1;
		this.technicalExpertise2 = technicalExpertise2;
		this.technicalExpertise3 = technicalExpertise3;
		this.noofVacancies = noofVacancies;
		this.employee = employee;
		this.status = status;
	}
	public String getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTechnicalExpertise1() {
		return technicalExpertise1;
	}
	public void setTechnicalExpertise1(String technicalExpertise1) {
		this.technicalExpertise1 = technicalExpertise1;
	}
	public String getTechnicalExpertise2() {
		return technicalExpertise2;
	}
	public void setTechnicalExpertise2(String technicalExpertise2) {
		this.technicalExpertise2 = technicalExpertise2;
	}
	public String getTechnicalExpertise3() {
		return technicalExpertise3;
	}
	public void setTechnicalExpertise3(String technicalExpertise3) {
		this.technicalExpertise3 = technicalExpertise3;
	}
	public int getNoofVacancies() {
		return noofVacancies;
	}
	public void setNoofVacancies(int noofVacancies) {
		this.noofVacancies = noofVacancies;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProjectRequirement [requirementId=" + requirementId + ", experience=" + experience
				+ ", technicalExpertise1=" + technicalExpertise1 + ", technicalExpertise2=" + technicalExpertise2
				+ ", technicalExpertise3=" + technicalExpertise3 + ", noofVacancies=" + noofVacancies + ", employee="
				+ employee + ", status=" + status + "]";
	}

	}
