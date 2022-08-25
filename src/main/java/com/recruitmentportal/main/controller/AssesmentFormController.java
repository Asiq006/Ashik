package com.recruitmentportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.AssesmentForm;
import com.recruitmentportal.main.service.AssesmentFormServiceInterface;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("hrportalapi")
public class AssesmentFormController {

	@Autowired
	private AssesmentFormServiceInterface assesmentFormServiceInterface;

	@RequestMapping(value = "allassesments", method = RequestMethod.GET)
	public List<AssesmentForm> getAllAssesments() {
		List<AssesmentForm> allAssesment = assesmentFormServiceInterface.getAllAssesment();
		return allAssesment;
	}

	@RequestMapping(value = "singleassesment/{assesmentId}", method = RequestMethod.GET)
	public AssesmentForm getSingleAssesment(@PathVariable String assesmentId) {
		return assesmentFormServiceInterface.getAssesmentById(assesmentId);

	}

	@RequestMapping(value = "addassesment", method = RequestMethod.POST)
	public boolean addAssesment(@RequestBody AssesmentForm assesmentForm) {
		return assesmentFormServiceInterface.addAssesment(assesmentForm);

	}

	@RequestMapping(value = "updateassesment", method = RequestMethod.PUT)
	public boolean updateAssesment(@RequestBody AssesmentForm addassesment) {
		return assesmentFormServiceInterface.updateAssesment(addassesment);

	}
}
