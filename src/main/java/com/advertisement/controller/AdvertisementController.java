package com.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


public interface AdvertisementController {
	public String advertisementList(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
