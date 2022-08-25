package com.recruitmentportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.recruitmentportal.main.pojo.FileDetails;

public class FileDetailsRowMapper implements RowMapper <FileDetails> {

	@Override
	public FileDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		FileDetails fileDetails= new FileDetails();
		fileDetails.setFileId(rs.getString("FILE_ID"));
		fileDetails.setFileName(rs.getString("FILE_NAME"));
		fileDetails.setFileType(rs.getString("FILE_TYPE"));
		fileDetails.setDocument(rs.getBytes("DOCUMENT"));
		
		return fileDetails;
	}

}
