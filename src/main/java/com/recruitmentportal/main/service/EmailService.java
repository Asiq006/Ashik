package com.recruitmentportal.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.CandidateDetails;
import com.recruitmentportal.main.pojo.Employee;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public SimpleMailMessage sendMail(CandidateDetails candidateDetails) {
	
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("suryachiddhu11@gmail.com");
		mailMessage.setTo(candidateDetails.getEmailId());
		mailMessage.setSubject("Offer Letter");
		mailMessage.setText("Congratulations!!"
				+ "Dear Candidate You've Been Selected to Work in Our Premises");
		javaMailSender.send(mailMessage);
		return mailMessage;

	}
	
}
