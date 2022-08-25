package com.recruitmentportal.main.repository;

import com.recruitmentportal.main.pojo.FileDetails;

public interface FileDetailsRepositoryInterface {

	public boolean addNewFileDetails(String fileId,FileDetails fileDetails);
	
	public String getFileId();
	
	public FileDetails getDocumentByFileId(String fileId );

}
