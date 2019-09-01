package com.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.advertisement.domain.AdvertisementVO;
import com.advertisement.service.AdvertisementServiceImpl;



@Controller
public class MainControllerImpl implements MainController{

	@Autowired
	private AdvertisementServiceImpl advertisementService;

	@RequestMapping(value= "/" ,method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView advertisementList(HttpServletRequest request, HttpServletResponse response) throws Exception{

		ModelAndView mav=new ModelAndView();
		//String viewName=(String)request.getAttribute("viewName");  //임시로 삭제 
		String viewName= "main/list";  //임시로 투입
		mav.setViewName(viewName);
		
		List<AdvertisementVO> advertisementList = advertisementService.advertisementList();
		mav.addObject("advertisementList", advertisementList);
		return mav;
	}
}
