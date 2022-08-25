package com.recruitmentportal.main.repository;

import java.util.List;

import com.recruitmentportal.main.pojo.LoginDetails;

public interface LoginDetailsRepositoryInterface {

	public LoginDetails loginUser(LoginDetails logindetails );
	public List<LoginDetails> allEmployee();

}
