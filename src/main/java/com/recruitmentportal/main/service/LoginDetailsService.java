package com.recruitmentportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.LoginDetails;
import com.recruitmentportal.main.repository.LoginDetailsRepositoryInterface;

@Service
public class LoginDetailsService implements LoginDetailsServiceInterface{
	
	@Autowired
	private LoginDetailsRepositoryInterface detailsRepositoryInterface;
	
	@Override
	public LoginDetails loginUser(LoginDetails logindetails) {
		return detailsRepositoryInterface.loginUser(logindetails);
	}
	@Override
	public List<LoginDetails> allEmployee() {
	
		return detailsRepositoryInterface.allEmployee();
	}
}

	

