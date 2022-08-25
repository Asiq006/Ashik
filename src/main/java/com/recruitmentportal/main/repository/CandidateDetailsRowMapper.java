package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.CandidateDetails;
import com.recruitmentportal.main.pojo.FileDetails;
import com.recruitmentportal.main.pojo.ProjectRequirement;

public class CandidateDetailsRowMapper implements RowMapper<CandidateDetails> {

	@Override
	public CandidateDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		CandidateDetails candidateDetails = new CandidateDetails();
		ProjectRequirement projectRequirement = new ProjectRequirement();
		FileDetails filedetails=new FileDetails();
		filedetails.setFileId(rs.getString("file_id"));
		projectRequirement.setRequirementId(rs.getString("requirement_id"));
		candidateDetails.setCandidateId(rs.getString("candidate_id"));
		candidateDetails.setName(rs.getString("name"));
		candidateDetails.setMobileNumber(rs.getLong("mobile_number"));
		candidateDetails.setGender(rs.getString("gender"));
		candidateDetails.setDateofBirth(rs.getString("date_of_birth"));
		candidateDetails.setAddress(rs.getString("address"));
		candidateDetails.setEducationalQualification(rs.getString("educational_qualification"));
		candidateDetails.setTechnicalExpertise1(rs.getString("technical_expertise_1"));
		candidateDetails.setTechnicalExpertise2(rs.getString("technical_expertise_2"));
		candidateDetails.setTechnicalExpertise3(rs.getString("technical_expertise_3"));
		candidateDetails.setExperience(rs.getInt("experience"));
		candidateDetails.setEmailId(rs.getString("email_id"));
		candidateDetails.setStatus(rs.getString("status"));
		candidateDetails.setRequirement(projectRequirement);
		candidateDetails.setFileDetails(filedetails);
		System.out.println(candidateDetails);

		return candidateDetails;
	}

}
