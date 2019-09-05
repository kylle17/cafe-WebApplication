package com.admin.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface AdminAdvertisementController {
	public ModelAndView adminAdvertisement(String sideMenu, HttpServletRequest request, HttpServletResponse response);
		
	
}
