package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.CandidateDetails;

@Repository
public class CandidateDetailsRepository implements CandidateDetailsRepositoryInterface {

	private static final String INSERT_NEW_CANDIDATE_DETAILS = "INSERT INTO candidate_details VALUES (candidate_details_sequence.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String GET_SINGLE_CANDIDATE_DETAILS = "SELECT * FROM candidate_details WHERE candidate_id=?";
	private static final String GET_ALL_CANDIDATE_DETAILS = "SELECT * FROM candidate_details ORDER BY candidate_id";
	private static final String UPDATE_DETAILS = "UPDATE candidate_details SET status=? WHERE candidate_id=?";
	private static final String GET_NEW_STATUS = "SELECT * FROM candidate_details WHERE status=?";
	private static final String GET_CANDIDATE_BY_REQUIREMENT_ID= "SELECT * FROM candidate_details WHERE requirement_id=?";


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<CandidateDetails> getAllDetails() {

		CandidateDetailsRowMapper candidateDetailsRowMapper = new CandidateDetailsRowMapper();

		List<CandidateDetails> query = jdbcTemplate.query(GET_ALL_CANDIDATE_DETAILS, candidateDetailsRowMapper);
		return query;
	}

	@Override
	public boolean addnewDetails(CandidateDetails candidatedetails) {
		System.out.println(candidatedetails);
		Object[] args = { candidatedetails.getName(), candidatedetails.getMobileNumber(), candidatedetails.getGender(),
				candidatedetails.getDateofBirth(), candidatedetails.getAddress(),
				candidatedetails.getEducationalQualification(), candidatedetails.getTechnicalExpertise1(),
				candidatedetails.getTechnicalExpertise2(), candidatedetails.getTechnicalExpertise3(),
				candidatedetails.getExperience(), candidatedetails.getEmailId(),
				candidatedetails.getRequirement().getRequirementId(),candidatedetails.getStatus(),candidatedetails.getFileDetails().getFileId() };
		int count = jdbcTemplate.update(INSERT_NEW_CANDIDATE_DETAILS, args);
		if (count > 0) {
			return true;
		}
		return false;
	}

	@Override
	public CandidateDetails getSingleDetails(String candidateId) {
		CandidateDetailsRowMapper candidateDetailsRowMapper = new CandidateDetailsRowMapper();
		Object[] args = { candidateId };

		CandidateDetails queryForObject = jdbcTemplate.queryForObject(GET_SINGLE_CANDIDATE_DETAILS,
				candidateDetailsRowMapper, args);

		return queryForObject;
	}

	@Override
	public boolean updateDetails(CandidateDetails candidatedetails) {
		Object[] args = { candidatedetails.getStatus(), candidatedetails.getCandidateId() };
		int updateddetails = jdbcTemplate.update(UPDATE_DETAILS, args);
		if (updateddetails > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<CandidateDetails> getNewStatus(String status) {
		CandidateDetailsRowMapper candidateDetailsRowMapper = new CandidateDetailsRowMapper();
		List<CandidateDetails> getnewstatus = jdbcTemplate.query(GET_NEW_STATUS, candidateDetailsRowMapper ,status );
		return getnewstatus;
	}

	@Override
	public List<CandidateDetails> getCandidateByRequirementId(String requirementId) {
		CandidateDetailsRowMapper candidateDetailsRowMapper = new CandidateDetailsRowMapper();

		List <CandidateDetails> candidatebyrequirementid = jdbcTemplate.query(GET_CANDIDATE_BY_REQUIREMENT_ID, candidateDetailsRowMapper, requirementId);

		return candidatebyrequirementid;
	}
}
