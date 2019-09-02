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
    
    
    @RequestMapping(value="/adminOrderState1")
    public ModelAndView recentHandler1(ModelAndView mav) {
    	mav.setViewName("admin/adminOrderState1");
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemState1());
    	return mav;
    } 
    
    @RequestMapping(value="/adminOrderState2")
    public ModelAndView recentHandler2(ModelAndView mav) {
    	mav.setViewName("admin/adminOrderState2");
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemState2());
    	return mav;
    } 
    
    @RequestMapping(value="/adminOrderState3")
    public ModelAndView recentHandler3(ModelAndView mav) {
    	mav.setViewName("admin/adminOrderState3");
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemState3());
    	return mav;
    } 
    
    @RequestMapping(value="/adminOrderState_date")
    public ModelAndView recentHandler4(ModelAndView mav) {
    	mav.setViewName("admin/adminOrderState_date");
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemState_date());
    	return mav;
    } 
    
    @RequestMapping(value="/adminOrderState_name")
    public ModelAndView recentHandler5(ModelAndView mav) {
    	mav.setViewName("admin/adminOrderState_name");
    	mav.addObject("admin/adminOrder",adminorderlistservice.selectitemState_name());
    	return mav;
    } 
    
    
    
    
   
    	
}
