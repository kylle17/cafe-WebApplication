package com.admin.order.domain;

import org.apache.ibatis.type.Alias;

//@Alias("adminOrderListVO")
public class AdminOrderListVO {

		private String order_date;
		private int orderNum;
		private String memID;
		private String order_method;
		private int order_price;
		private String order_state;
		
		public String getOrder_date() {
			return order_date;
		}
		public void setOrder_date(String order_date) {
			this.order_date = order_date;
		}
		public int getOrderNum() {
			return orderNum;
		}
		public void setOrderNum(int orderNum) {
			this.orderNum = orderNum;
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
