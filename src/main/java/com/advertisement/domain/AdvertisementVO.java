package com.advertisement.domain;

import java.sql.Date;


public class AdvertisementVO {
	private int advertisement_id;
	private Date advertisement_credate;
	
	
	public int getAdvertisement_id() {
		return advertisement_id;
	}
	public void setAdvertisement_id(int advertisement_id) {
		this.advertisement_id = advertisement_id;
	}
	public Date getAdvertisement_credate() {
		return advertisement_credate;
	}
	public void setAdvertisement_credate(Date advertisement_credate) {
		this.advertisement_credate = advertisement_credate;
	}
	
	
}
