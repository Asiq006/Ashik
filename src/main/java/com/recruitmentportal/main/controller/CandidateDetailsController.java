package com.recruitmentportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recruitmentportal.main.pojo.CandidateDetails;
import com.recruitmentportal.main.service.CandidateDetailsServiceInterface;

@CrossOrigin("http://localhost:4200")
@RequestMapping("hrportalapi")
@RestController
public class CandidateDetailsController {


	@Autowired
	private CandidateDetailsServiceInterface candidateDetailsService;

	@RequestMapping(value = "candidatedetails/all", method = RequestMethod.GET)
	public List<CandidateDetails> getAllDetails() {

		List<CandidateDetails> allcandidateDetails = candidateDetailsService.getAllDetails();

		return allcandidateDetails;
	}

	@RequestMapping(value = "candidatedetails/addnew", method = RequestMethod.POST)
	public boolean addnewDetails(@RequestBody CandidateDetails candidatedetails) {

		boolean addnewcandidateDetails = candidateDetailsService.addnewDetails(candidatedetails);
		return addnewcandidateDetails;

	}

	@RequestMapping(value = "candidatedetails/{candidateId}", method = RequestMethod.GET)
	public CandidateDetails getSingleDetails(@PathVariable String candidateId) {

		CandidateDetails singlecandidaateDetails = candidateDetailsService.getSingleDetails(candidateId);
		return singlecandidaateDetails;

	}

	@RequestMapping(value = "candidatedetails/updatecandidatestatus", method = RequestMethod.PUT)
	public boolean updateDetails(@RequestBody CandidateDetails candidatedetails) {
		return candidateDetailsService.updateDetails(candidatedetails);

	}



	@RequestMapping(value = "candidatedetails/newstatus/{status}", method = RequestMethod.GET)
	public List<CandidateDetails> getNewStatus(@PathVariable String status) {
		System.out.println(status);
		return candidateDetailsService.getNewStatus(status);

	}
	
	@RequestMapping(value = "candidatedetails/by/{requirementId}", method = RequestMethod.GET)
	public List <CandidateDetails> getCandidateByRequirementId(@PathVariable String requirementId) {
		return candidateDetailsService.getCandidateByRequirementId(requirementId);
		
	}
}
