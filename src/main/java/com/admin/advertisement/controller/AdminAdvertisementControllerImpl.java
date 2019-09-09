<<<<<<< HEAD
//package com.admin.advertisement.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.advertisement.domain.AdvertisementVO;
//import com.advertisement.service.AdvertisementServiceImpl;
//
//@Controller
//@RequestMapping(value="/adminAd")
//public class AdminAdvertisementControllerImpl implements AdminAdvertisementController{
//
//	@Autowired
//	private AdvertisementServiceImpl advertisementService;
//
//	
//	@RequestMapping(value="/main")
//	public ModelAndView adminAdMain(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mov = new ModelAndView();
//		
//		String viewName = "adminAd/main";
//		mov.setViewName(viewName);
//		
//		HttpSession session = request.getSession();		
//		session.setAttribute("sideMenu", sideMenu );
//		
//		
=======
package com.admin.advertisement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.advertisement.domain.AdvertisementVO;
import com.advertisement.service.AdvertisementServiceImpl;

@Controller
@RequestMapping(value="/adminAd")
public class AdminAdvertisementControllerImpl implements AdminAdvertisementController{

	@Autowired
	private AdvertisementServiceImpl advertisementService;

	
	@RequestMapping(value="/main")
	public ModelAndView adminAdMain(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "adminAd/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
		
		
		List<AdvertisementVO> advertisementList = advertisementService.advertisementList();
		mov.addObject("advertisementList", advertisementList);
		
		return mov;
	}
	
	
	@RequestMapping(value="/update")
	public ModelAndView adminAdUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "adminAd/update";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		

		
		
>>>>>>> 644dc449a33131e59557230237c820035fbd216b
//		List<AdvertisementVO> advertisementList = advertisementService.advertisementList();
//		mov.addObject("advertisementList", advertisementList);
//		
//		return mov;
//	}
//	
//	
//	@RequestMapping(value="/update")
//	public ModelAndView adminAdUpdate(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView mov = new ModelAndView();
//		
//		String viewName = "adminAd/update";
//		mov.setViewName(viewName);
//		
//		HttpSession session = request.getSession();		
//		session.setAttribute("sideMenu", sideMenu );
//		
//		
////		List<AdvertisementVO> advertisementList = advertisementService.advertisementList();
////		mov.addObject("advertisementList", advertisementList);
//		
//		return mov;
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
