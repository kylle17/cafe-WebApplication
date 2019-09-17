package com.admin.advertisement.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.advertisement.Service.AdminAdvertisementServiceImpl;
import com.advertisement.domain.AdvertisementVO;
import com.file.controller.FileUploadController;

@Controller
@RequestMapping(value="/admin/Ad")
public class AdminAdvertisementControllerImpl implements AdminAdvertisementController{

	@Autowired
	private AdminAdvertisementServiceImpl adminAdvertisementService;
	
	@Autowired
	private FileUploadController fileUploadController;


	
	@RequestMapping(value="/main")
	public ModelAndView adminAdMain(@RequestParam("sideMenu") String sideMenu ,HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/Ad/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
		
		
		List<AdvertisementVO> advertisementList = adminAdvertisementService.advertisementList();
		mov.addObject("advertisementList", advertisementList);
		
		return mov;
	}
	
	
	@RequestMapping(value="/update")
	public ModelAndView adminAdUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/Ad/update";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		
		return mov;
	}

	@RequestMapping(value="/updateConfirm", method=RequestMethod.POST)
	public ModelAndView adminAdUpdateConfirm(AdvertisementVO advertisementVO, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("updateConfirm용 controller실행");

		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/Ad/updateConfirm";
		mov.setViewName(viewName);
		
		String file_name = fileUploadController.adUpload(request, response);
		
		advertisementVO.setFile_name(file_name);
		System.out.println(file_name);
		

		advertisementVO.setAd_id(request.getParameter("ad_id1"));
		advertisementVO.setAd_type(request.getParameter("ad_type1"));
		advertisementVO.setFile_name(file_name);
		advertisementVO.setAd_credate(request.getParameter("ad_credate1"));

		int result = adminAdvertisementService.updateAdvertisement(advertisementVO);
		
		return mov;
	}
	

}	

		
		

