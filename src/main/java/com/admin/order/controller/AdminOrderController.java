package com.admin.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.admin.order.service.AdminOrderService;



public class AdminOrderController {
	
	@Autowired
	AdminOrderService adminOrderService;
	
	//관리자 주문현황 페이지 요청
	 @RequestMapping("/admin/order")
	    public ModelAndView list(ModelAndView mav) {
		 	mav.setViewName("/admin/Order");
	        mav.addObject("list", adminOrderService.selectOrderList());
	        return mav;
	    }
}
