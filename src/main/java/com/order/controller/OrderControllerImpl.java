package com.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/order")
public class OrderControllerImpl implements OrderController{

	@RequestMapping(value="/list")
	public String orderList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		return "order/list";
	}


}
