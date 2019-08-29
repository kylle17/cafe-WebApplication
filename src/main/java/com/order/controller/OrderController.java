package com.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface OrderController {
	public String orderList(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
