package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.AssesmentForm;
import com.recruitmentportal.main.pojo.CandidateDetails;

public class AssesmentFormRowMapper implements RowMapper<AssesmentForm> {

	@Override
	public AssesmentForm mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		AssesmentForm assesment = new AssesmentForm();
		
		CandidateDetails candidateDetails1 = new CandidateDetails();
		
		candidateDetails1.setCandidateId(rs.getString("candidate_id"));
		assesment.setAssesmentId(rs.getString("assesment_id"));
		assesment.setName(rs.getString("name"));
		assesment.setTechnicalRemarks(rs.getString("technical_remarks"));
		assesment.setStatus(rs.getString("status"));
		assesment.setCandidateDetails(candidateDetails1);
		System.out.println(assesment);
		return assesment;
	}

}
