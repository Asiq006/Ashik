package com.recruitmentportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.CandidateDetails;
import com.recruitmentportal.main.repository.CandidateDetailsRepositoryInterface;

@Service
public class CandidateDetailsService implements CandidateDetailsServiceInterface {

	@Autowired
	private CandidateDetailsRepositoryInterface candidateDetailsRepository;

	@Override
	public List<CandidateDetails> getAllDetails() {

		return candidateDetailsRepository.getAllDetails();
	}

	@Override
	public boolean addnewDetails(CandidateDetails candidatedetails) {

		return candidateDetailsRepository.addnewDetails(candidatedetails);
	}

	@Override
	public CandidateDetails getSingleDetails(String candidateId) {

		return candidateDetailsRepository.getSingleDetails(candidateId);
	}

	@Override
	public boolean updateDetails(CandidateDetails candidatedetails) {
		
		return candidateDetailsRepository.updateDetails(candidatedetails);
	}

	@Override
	public List<CandidateDetails> getNewStatus(String status) {
		return candidateDetailsRepository.getNewStatus(status);
	}

	@Override
	public List<CandidateDetails> getCandidateByRequirementId(String requirementId) {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.getCandidateByRequirementId(requirementId);
	}

}
