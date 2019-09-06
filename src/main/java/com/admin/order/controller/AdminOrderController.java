package com.admin.order.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
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
	public ModelAndView AdminOrderListHandler(ModelAndView mav, ServletRequest request) {
		String orderUrl = ((ServletRequest)request).getParameter("orderUrl");
    	System.out.println(orderUrl);
    	if(orderUrl==null)
    	{
    		mav.setViewName("/admin/adminOrder");
    		mav.addObject("AdminOrderListVO",adminorderlistservice.selectitemList());
    		return mav;
    	}
    	else
    	{
    		mav.setViewName("/admin/"+orderUrl);
    		if(orderUrl.equals("adminOrderState1"))
    		{
    			orderUrl="주문접수";
    		}
    		else if(orderUrl.equals("adminOrderState2"))
    			orderUrl="결제완료";
    		else if(orderUrl.equals("adminOrderState3"))
    			orderUrl="배송준비중";
    		mav.addObject("AdminOrderListVO",adminorderlistservice.selectitemList(orderUrl));
    		return mav;
    	}
	}
	
	@RequestMapping(value="/adminOrderDetail")
    public ModelAndView AdminOrderDetailHandler(ModelAndView mav1, ServletRequest request1) {
		String orderNum=request1.getParameter("ORDERNUM");
		mav1.setViewName("/admin/adminOrderDetail");	
		mav1.addObject("AdminOrderNumDeliveryVO",adminorderlistservice.selectitemOrderNum(orderNum));
		return mav1;
	}
}
