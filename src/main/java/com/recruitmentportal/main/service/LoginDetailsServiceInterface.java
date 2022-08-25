package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.LoginDetails;

public interface LoginDetailsServiceInterface {

	public LoginDetails loginUser(LoginDetails logindetails );
	public List<LoginDetails> allEmployee( );
}
