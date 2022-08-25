package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.AssesmentForm;

public interface AssesmentFormServiceInterface {

	public List <AssesmentForm> getAllAssesment();
	public AssesmentForm getAssesmentById(String assesmentId);
	public boolean addAssesment (AssesmentForm addassesment);
	public boolean updateAssesment(AssesmentForm addassesment);
}

