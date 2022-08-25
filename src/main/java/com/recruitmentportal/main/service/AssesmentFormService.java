package com.recruitmentportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.AssesmentForm;
import com.recruitmentportal.main.repository.AssesmentFormRepositoryInterface;

@Service
public class AssesmentFormService implements AssesmentFormServiceInterface {

	@Autowired
	private AssesmentFormRepositoryInterface assesmentFormRepositoryInterface;

	@Override
	public List<AssesmentForm> getAllAssesment() {

		return assesmentFormRepositoryInterface.getAllAssesment();
	}

	@Override
	public AssesmentForm getAssesmentById(String assesmentId) {

		return assesmentFormRepositoryInterface.getAssesmentById(assesmentId);
	}

	@Override
	public boolean addAssesment(AssesmentForm addassesment) {

		return assesmentFormRepositoryInterface.addAssesment(addassesment);
	}

	@Override
	public boolean updateAssesment(AssesmentForm addassesment) {
		return assesmentFormRepositoryInterface.updateAssesment(addassesment);
	}

}
