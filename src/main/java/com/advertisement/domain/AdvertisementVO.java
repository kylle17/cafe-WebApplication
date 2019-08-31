package com.advertisement.domain;

import java.sql.Date;


public class AdvertisementVO {
	private int advertisement_id;
	private int advertisement_fileName;
	private int advertisement_fileType;
	private Date advertisement_credate;
	public int getAdvertisement_id() {
		return advertisement_id;
	}
	public void setAdvertisement_id(int advertisement_id) {
		this.advertisement_id = advertisement_id;
	}
	public int getAdvertisement_fileName() {
		return advertisement_fileName;
	}
	public void setAdvertisement_fileName(int advertisement_fileName) {
		this.advertisement_fileName = advertisement_fileName;
	}
	public int getAdvertisement_fileType() {
		return advertisement_fileType;
	}
	public void setAdvertisement_fileType(int advertisement_fileType) {
		this.advertisement_fileType = advertisement_fileType;
	}
	public Date getAdvertisement_credate() {
		return advertisement_credate;
	}
	public void setAdvertisement_credate(Date advertisement_credate) {
		this.advertisement_credate = advertisement_credate;
	}
	
	

	
	
}
