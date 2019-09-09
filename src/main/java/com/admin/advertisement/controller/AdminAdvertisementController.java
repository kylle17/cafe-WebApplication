package com.admin.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface AdminAdvertisementController {
	public ModelAndView adminAdMain(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception ;
		
	public ModelAndView adminAdUpdate(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception;

}
