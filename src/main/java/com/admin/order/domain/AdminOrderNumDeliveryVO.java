package com.admin.order.domain;

//@Alias("adminOrderListVO")
public class AdminOrderNumDeliveryVO {

	private int orderNum;
	
	private int del_num;
	private int del_request_day;
	private int del_complete_day;
	private String del_place;
	private int del_drivePhone;
	
	private int order_account;
	private String pay_method;
	private int pay_date;
	private String pay_ascro;
	
	private int order_date;
	private String memID;
	private String order_method;
	private int order_price;
	private String order_state;
	
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public int getDel_num() {
		return del_num;
	}
	public void setDel_num(int del_num) {
		this.del_num = del_num;
	}
	public int getDel_request_day() {
		return del_request_day;
	}
	public void setDel_request_day(int del_request_day) {
		this.del_request_day = del_request_day;
	}
	public int getDel_complete_day() {
		return del_complete_day;
	}
	public void setDel_complete_day(int del_complete_day) {
		this.del_complete_day = del_complete_day;
	}
	public String getDel_place() {
		return del_place;
	}
	public void setDel_place(String del_place) {
		this.del_place = del_place;
	}
	public int getDel_drivePhone() {
		return del_drivePhone;
	}
	public void setDel_drivePhone(int del_drivePhone) {
		this.del_drivePhone = del_drivePhone;
	}
	public int getOrder_account() {
		return order_account;
	}
	public void setOrder_account(int order_account) {
		this.order_account = order_account;
	}
	public String getPay_method() {
		return pay_method;
	}
	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}
	public int getPay_date() {
		return pay_date;
	}
	public void setPay_date(int pay_date) {
		this.pay_date = pay_date;
	}
	public String getPay_ascro() {
		return pay_ascro;
	}
	public void setPay_ascro(String pay_ascro) {
		this.pay_ascro = pay_ascro;
	}
	public int getOrder_date() {
		return order_date;
	}
	public void setOrder_date(int order_date) {
		this.order_date = order_date;
	}
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getOrder_method() {
		return order_method;
	}
	public void setOrder_method(String order_method) {
		this.order_method = order_method;
	}
	public int getOrder_price() {
		return order_price;
	}
	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}
	public String getOrder_state() {
		return order_state;
	}
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
		
}
