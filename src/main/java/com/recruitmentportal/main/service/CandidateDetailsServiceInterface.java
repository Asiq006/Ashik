package com.recruitmentportal.main.service;

import java.util.List;

import com.recruitmentportal.main.pojo.CandidateDetails;

public interface CandidateDetailsServiceInterface {

	public List<CandidateDetails> getAllDetails();

	public boolean addnewDetails(CandidateDetails candidatedetails);

	public CandidateDetails getSingleDetails(String candidateId);

	public boolean updateDetails(CandidateDetails candidatedetails);

	public List<CandidateDetails> getNewStatus(String status);
		
	public List<CandidateDetails> getCandidateByRequirementId(String requirementId);



}
