package com.recruitmentportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.LoginDetails;
import com.recruitmentportal.main.service.LoginDetailsServiceInterface;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("hrportalapi")
public class LoginDetailsController {

	@Autowired
	private LoginDetailsServiceInterface detailsServiceInterface;

	@RequestMapping(value = "employeedetails", method = RequestMethod.POST)
	public LoginDetails validateUser(@RequestBody LoginDetails loginDetails) {
		LoginDetails loginUser = detailsServiceInterface.loginUser(loginDetails);
		return loginUser;

	}

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public List<LoginDetails> allEmployees() {
		List<LoginDetails> allEmployee = detailsServiceInterface.allEmployee();
		return allEmployee;
	}
}
