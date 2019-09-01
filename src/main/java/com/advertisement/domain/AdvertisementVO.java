package com.advertisement.domain;

import java.sql.Date;


public class AdvertisementVO {
	private int advertisement_id;
	private String fileName;
	private String fileType;
	private Date advertisement_credate;
	public int getAdvertisement_id() {
		return advertisement_id;
	}
	public void setAdvertisement_id(int advertisement_id) {
		this.advertisement_id = advertisement_id;
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
	public Date getAdvertisement_credate() {
		return advertisement_credate;
	}
	public void setAdvertisement_credate(Date advertisement_credate) {
		this.advertisement_credate = advertisement_credate;
	}
	
	
	


	
	
}
