package com.member.domain;

import org.apache.ibatis.type.Alias;

@Alias("memberVO")
public class MemberVO {
	private String memId;
	private String memPw;
	private String memName;
	private String memGender;
	private String memBirth;
	private String memPhone;
	private String memEmail;
	private String memPostCode;
	private String memRoadName;
	private String memDetail;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	public String getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemPostCode() {
		return memPostCode;
	}
	public void setMemPostCode(String memPostCode) {
		this.memPostCode = memPostCode;
	}
	public String getMemRoadName() {
		return memRoadName;
	}
	public void setMemRoadName(String memRoadName) {
		this.memRoadName = memRoadName;
	}
	public String getMemDetail() {
		return memDetail;
	}
	public void setMemDetail(String memDetail) {
		this.memDetail = memDetail;
	}
	
}
