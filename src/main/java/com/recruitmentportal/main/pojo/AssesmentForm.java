package com.recruitmentportal.main.pojo;

public class AssesmentForm {

	
	private String assesmentId;
	private String name;
	private String technicalRemarks;
	private String status;
	private CandidateDetails candidateDetails;
	
	public AssesmentForm() {
		// TODO Auto-generated constructor stub
	}

	public AssesmentForm(String assesmentId, String name, String technicalRemarks, String status,
			CandidateDetails candidateDetails) {
		super();
		this.assesmentId = assesmentId;
		this.name = name;
		this.technicalRemarks = technicalRemarks;
		this.status = status;
		this.candidateDetails = candidateDetails;
	}

	public String getAssesmentId() {
		return assesmentId;
	}

	public void setAssesmentId(String assesmentId) {
		this.assesmentId = assesmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnicalRemarks() {
		return technicalRemarks;
	}

	public void setTechnicalRemarks(String technicalRemarks) {
		this.technicalRemarks = technicalRemarks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	@Override
	public String toString() {
		return "AssesmentForm [assesmentId=" + assesmentId + ", name=" + name + ", technicalRemarks=" + technicalRemarks
				+ " ,status=" + status + ", candidateDetails=" + candidateDetails + "]";
	}
	
	
	
	
}
