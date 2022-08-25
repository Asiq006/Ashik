package com.recruitmentportal.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recruitmentportal.main.pojo.Employee;
import com.recruitmentportal.main.pojo.FileDetails;

@Repository
public class FileDetailsRepository implements FileDetailsRepositoryInterface {

	private static final String ADD_NEW_FILE_DETAILS = "INSERT INTO file_details VALUES(?,?,?,?)";

	private static final String GET_FILE_ID = "SELECT file_details_sequence.NEXTVAL FROM DUAL";
	
	private static final String GET_DOCUMENT_BY_ID= "SELECT * FROM FILE_DETAILS WHERE FILE_ID=?";


	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addNewFileDetails(String fileId, FileDetails fileDetails) {

		Object[] args = { fileId, fileDetails.getFileName(), fileDetails.getFileType(),
				fileDetails.getDocument() };
		int add = jdbcTemplate.update(ADD_NEW_FILE_DETAILS, args);
		if (add>0) {
			return true;
		}
		return false;
	}

	@Override
	public String getFileId() {

		String id = jdbcTemplate.queryForObject(GET_FILE_ID, String.class);

		return id;
	}

	@Override
	public 	FileDetails getDocumentByFileId(String fileId) {
		FileDetailsRowMapper fileDetailsRowMapper = new FileDetailsRowMapper(); 
		Object[] args = {fileId};
		FileDetails object = jdbcTemplate.queryForObject(GET_DOCUMENT_BY_ID, fileDetailsRowMapper, fileId);
		return object;
		
	}


}
