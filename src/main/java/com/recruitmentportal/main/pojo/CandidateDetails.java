package com.recruitmentportal.main.pojo;

public class CandidateDetails {
	
	private String candidateId;
	private String name;
	private long mobileNumber;
	private String gender;
	private String dateofBirth;
	private String address;
	private String educationalQualification;
	private String technicalExpertise1;
	private String technicalExpertise2;
	private String technicalExpertise3;
	private int experience;
	private String emailId;
	private String status;
	private ProjectRequirement requirement;
	private FileDetails fileDetails; 
	
	public CandidateDetails() {
	}

	public CandidateDetails(String candidateId, String name, long mobileNumber, String gender, String dateofBirth,
			String address, String educationalQualification, String technicalExpertise1, String technicalExpertise2,
			String technicalExpertise3, int experience, String emailId, String status, ProjectRequirement requirement,
			FileDetails fileDetails) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.address = address;
		this.educationalQualification = educationalQualification;
		this.technicalExpertise1 = technicalExpertise1;
		this.technicalExpertise2 = technicalExpertise2;
		this.technicalExpertise3 = technicalExpertise3;
		this.experience = experience;
		this.emailId = emailId;
		this.status = status;
		this.requirement = requirement;
		this.fileDetails = fileDetails;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ProjectRequirement getRequirement() {
		return requirement;
	}

	public void setRequirement(ProjectRequirement requirement) {
		this.requirement = requirement;
	}

	public FileDetails getFileDetails() {
		return fileDetails;
	}

	public void setFileDetails(FileDetails fileDetails) {
		this.fileDetails = fileDetails;
	}

	@Override
	public String toString() {
		return "CandidateDetails [candidateId=" + candidateId + ", name=" + name + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", dateofBirth=" + dateofBirth + ", address=" + address
				+ ", educationalQualification=" + educationalQualification + ", technicalExpertise1="
				+ technicalExpertise1 + ", technicalExpertise2=" + technicalExpertise2 + ", technicalExpertise3="
				+ technicalExpertise3 + ", experience=" + experience + ", emailId=" + emailId + ", status=" + status
				+ ", requirement=" + requirement + ", fileDetails=" + fileDetails + "]";
	}

	
	
}

