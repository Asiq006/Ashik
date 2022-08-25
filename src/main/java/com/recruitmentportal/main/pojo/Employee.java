package com.recruitmentportal.main.pojo;

public class Employee {
		private String employeeId;
		private String name;
		private String designation;
		private double salary;
		private String email;
		private String technicalExpertise1;
		private String technicalExpertise2;
		private String technicalExpertise3;
		private int experience;
		ProjectDetails projectDetails;
		LoginDetails loginDetails;
		private String reportsTo;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(String employeeId, String name, String designation, double salary, String email,
				String technicalExpertise1, String technicalExpertise2, String technicalExpertise3, int experience,
				ProjectDetails projectDetails, LoginDetails loginDetails, String reportsTo) {
			super();
			this.employeeId = employeeId;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
			this.email = email;
			this.technicalExpertise1 = technicalExpertise1;
			this.technicalExpertise2 = technicalExpertise2;
			this.technicalExpertise3 = technicalExpertise3;
			this.experience = experience;
			this.projectDetails = projectDetails;
			this.loginDetails = loginDetails;
			this.reportsTo = reportsTo;
		}

		public String getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
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

		public ProjectDetails getProjectDetails() {
			return projectDetails;
		}

		public void setProjectDetails(ProjectDetails projectDetails) {
			this.projectDetails = projectDetails;
		}

		public LoginDetails getLoginDetails() {
			return loginDetails;
		}

		public void setLoginDetails(LoginDetails loginDetails) {
			this.loginDetails = loginDetails;
		}

		public String getReportsTo() {
			return reportsTo;
		}

		public void setReportsTo(String reportsTo) {
			this.reportsTo = reportsTo;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation
					+ ", salary=" + salary + ", email=" + email + ", technicalExpertise1=" + technicalExpertise1
					+ ", technicalExpertise2=" + technicalExpertise2 + ", technicalExpertise3=" + technicalExpertise3
					+ ", experience=" + experience + ", projectDetails=" + projectDetails + ", loginDetails="
					+ loginDetails + ", reportsTo=" + reportsTo + "]";
		}
		
		
		
	
}
