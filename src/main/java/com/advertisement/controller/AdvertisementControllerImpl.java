package com.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/advertisement")
public class AdvertisementControllerImpl implements AdvertisementController{

	@RequestMapping(value="/list" ,method = RequestMethod.GET)
	public String advertisementList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return "index";
	}

}
