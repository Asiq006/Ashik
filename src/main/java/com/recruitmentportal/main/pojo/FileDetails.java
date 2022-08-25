package com.recruitmentportal.main.pojo;

import java.util.Arrays;

public class FileDetails {

	private String fileId;
	private String fileName;
	private String fileType;
	private byte[] document;

	public FileDetails() {
		// TODO Auto-generated constructor stub
	}

	public FileDetails(String fileId, String fileName, String fileType, byte[] document) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileType = fileType;
		this.document = document;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "FileDetails [fileId=" + fileId + ", fileName=" + fileName + ", fileType=" + fileType + ", document="
				+ Arrays.toString(document) + "]";
	}

}
