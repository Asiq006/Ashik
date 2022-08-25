package com.recruitmentportal.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.recruitmentportal.main.pojo.FileDetails;
import com.recruitmentportal.main.service.FileDetailsServiceInterface;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("hrportalapi")
public class FileDetailsController {

	@Autowired
	private FileDetailsServiceInterface detailsServiceInterface;

	@RequestMapping(value = "addnewfiledetails/{fileId}", method = RequestMethod.POST)
	public boolean addNewFileDetails(@RequestParam("file") MultipartFile file, @PathVariable String fileId) {
		FileDetails fileDetails = new FileDetails();
		fileDetails.setFileName(StringUtils.cleanPath(file.getOriginalFilename()));
		fileDetails.setFileType(file.getContentType());
		try {
			fileDetails.setDocument(file.getBytes());
		} catch (IOException e) {
			System.out.println("Exception while file upload");
		}

		detailsServiceInterface.addNewFileDetails(fileId, fileDetails);
		return true;

	}

	@RequestMapping(value = "getfileid")
	public String getFileId() {
		return detailsServiceInterface.getFileId();
	}

	@RequestMapping(value = "document/{fileId}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> getDocumentByFileId(@PathVariable String fileId) {
		FileDetails fileDetails = detailsServiceInterface.getDocumentByFileId(fileId);
		return ResponseEntity.ok().header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + fileDetails.getFileName() + "\"").body(fileDetails.getDocument());
	}
}
