package com.admin.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/admin")
public class AdminAdvertisementControllerImpl implements AdminAdvertisementController{

	@RequestMapping(value="/adminAd")
	public ModelAndView adminAdvertisement(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
		
		return mov;
	}
}
