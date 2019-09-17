package com.admin.advertisement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.advertisement.domain.AdvertisementVO;

public interface AdminAdvertisementController {

	public ModelAndView adminAdMain(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView adminAdUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView adminAdUpdateConfirm(AdvertisementVO advertisementVO, HttpServletRequest request, HttpServletResponse response) throws Exception ;

	
}
