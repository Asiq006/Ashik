package com.recruitmentportal.main.pojo;

public class LoginDetails {
	private String loginId;
	private String password;
	private String designation;
	
	public LoginDetails() {
		
	}
	
	public LoginDetails(String loginId, String designation, String password) {
		super();
		this.loginId = loginId;
		this.designation = designation;
		this.password = password;
	}
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Logindetails [loginId=" + loginId + ", designation=" + designation + ", password=" + password + "]";
	}
	

}
