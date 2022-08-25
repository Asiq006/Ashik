package com.recruitmentportal.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitmentportal.main.pojo.FileDetails;
import com.recruitmentportal.main.repository.FileDetailsRepositoryInterface;

@Service
public class FileDetailsService implements FileDetailsServiceInterface {

	@Autowired
	private FileDetailsRepositoryInterface detailsRepositoryInterface;

	@Override
	public boolean addNewFileDetails(String fileId,FileDetails fileDetails) {

		return detailsRepositoryInterface.addNewFileDetails(fileId,fileDetails);
	}

	@Override
	public String getFileId() {
		return detailsRepositoryInterface.getFileId();
	}

	@Override
	public FileDetails getDocumentByFileId(String fileId) {
		// TODO Auto-generated method stub
		return detailsRepositoryInterface.getDocumentByFileId(fileId);
	}

	

}
