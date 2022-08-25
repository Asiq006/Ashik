package com.recruitmentportal.main.service;

import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.FileDetails;

public interface FileDetailsServiceInterface {

	
	public boolean addNewFileDetails(String fileId ,FileDetails fileDetails);
	
	public String getFileId();
	
	public FileDetails getDocumentByFileId(String fileId);
}
