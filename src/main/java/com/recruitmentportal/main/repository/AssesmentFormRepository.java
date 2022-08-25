package com.recruitmentportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.AssesmentForm;

@Repository
public class AssesmentFormRepository implements AssesmentFormRepositoryInterface {

	private static final String GET_ALL_ASSESMENT = "SELECT * FROM  assesment_details";
	private static final String GET_ASSESMENT_BY_ID = "SELECT * FROM assesment_details WHERE assesment_id =?";
	private static final String ADD_ASSESMENT = "INSERT INTO assesment_details VALUES ('A'||assesment_details_sequence.NEXTVAL,?,?,?,?)";
	private static final String UPDATE_ASSESMENT = "UPDATE assesment_details SET status=? WHERE candidate_id=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<AssesmentForm> getAllAssesment() {
		AssesmentFormRowMapper assesmentFormRowMapper = new AssesmentFormRowMapper();
		List<AssesmentForm> allassesment = jdbcTemplate.query(GET_ALL_ASSESMENT, assesmentFormRowMapper);
		System.out.println("Assesment");
		return allassesment;
	}

	@Override
	public AssesmentForm getAssesmentById(String assesmentId) {
		System.out.println(assesmentId);
		Object[] args = { assesmentId };
		AssesmentFormRowMapper assesmentFormRowMapper = new AssesmentFormRowMapper();
		AssesmentForm singleassesment = jdbcTemplate.queryForObject(GET_ASSESMENT_BY_ID, assesmentFormRowMapper, args);
		return singleassesment;
	}

	@Override
	public boolean addAssesment(AssesmentForm addassesment) {
		Object[] args = { addassesment.getName(), addassesment.getTechnicalRemarks(), addassesment.getStatus(),
				addassesment.getCandidateDetails().getCandidateId() };
		int addedassesment = jdbcTemplate.update(ADD_ASSESMENT, args);
		System.out.println(addedassesment);

		if (addedassesment > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAssesment(AssesmentForm addassesment) {
		Object[] args = { addassesment.getStatus(), addassesment.getCandidateDetails().getCandidateId() };
		int updatedassesment = jdbcTemplate.update(UPDATE_ASSESMENT, args);

		if (updatedassesment > 0) {
			return true;
		}
		return false;
	}

}
