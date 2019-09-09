package com.admin.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.member.service.AdminMemberService;
import com.member.domain.MemberVO;
import com.member.service.MemberService;

@Controller
@RequestMapping(value="/admin/member")
public class AdminMemberController {
	
	@Autowired
	private AdminMemberService adminMemberService;
	
	public void setAdminMemberService(AdminMemberService adminMemberService) {
		this.adminMemberService = adminMemberService;
	}	
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/adminMemberList")
	public ModelAndView adminMember(@RequestParam("sideMenu") String sideMenu,
			HttpServletRequest request) {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/Ad/main";
		mov.setViewName(viewName);
		
		List<MemberVO> memberList = adminMemberService.list();
		mov.addObject("memberList", memberList);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
	
		return mov;
	}
	
	@RequestMapping(value="/adminMemberDelete")
	public ModelAndView adminMemberDelete(@RequestParam("memId") String memId) {
		ModelAndView mov = new ModelAndView();
		
		String viewName = "admin/member/adminMemberDelete";
		mov.setViewName(viewName);
		mov.addObject("memId", memId);
	
		return mov;
	}
	
	@RequestMapping(value="/adminMemberDeleteSuccess")
	public ModelAndView adminMemberDeleteSuccess(@RequestParam("memId") String memId) {
		ModelAndView mov = new ModelAndView();
		
		MemberVO list = memberService.selectById(memId);
		memberService.delete(list);
		
		String viewName = "admin/member/adminMemberDeleteSuccess";
		mov.setViewName(viewName);
	
		return mov;
	}
}
