package com.admin.order.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.admin.order.service.AdminOrderListService;



@Controller
public class AdminOrderController {
	
	@Autowired
	private AdminOrderListService adminorderlistservice;
    	
    @RequestMapping(value="/adminOrderList")
    @ResponseBody
	public ModelAndView recentHandler(ModelAndView mav) {
		//데이터를 받아서 해당 페이지로 데이터를 보낸다
    	mav.setViewName("admin/adminOrder");
    	//값이안들어가는중
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemList());
    	System.out.println(adminorderlistservice.selectitemList());
		return mav;
	}
    
   
    	
}
