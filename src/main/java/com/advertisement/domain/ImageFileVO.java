package com.advertisement.domain;

public class ImageFileVO {
	private int advertisement_id;
	private int image_id;
	private String fileName;
	private String fileType;
	private String reg_id;
	

	public ImageFileVO() {
		super();
	}


	public int getAdvertisement_id() {
		return advertisement_id;
	}


	public void setAdvertisement_id(int advertisement_id) {
		this.advertisement_id = advertisement_id;
	}


	public int getImage_id() {
		return image_id;
	}


	public void setImage_id(int image_id) {
		this.image_id = image_id;
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


	public String getReg_id() {
		return reg_id;
	}


	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}




	

}
