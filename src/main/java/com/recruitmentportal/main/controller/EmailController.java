package com.recruitmentportal.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.CandidateDetails;
import com.recruitmentportal.main.service.EmailService;

@CrossOrigin("http://localhost:4200")
@RequestMapping("hrportalapi")
@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "sendmail", method = RequestMethod.POST)
	public boolean sendMail(@RequestBody CandidateDetails candidateDetails) {
		System.out.println(candidateDetails);
		emailService.sendMail(candidateDetails);
		return true;

	}

}
