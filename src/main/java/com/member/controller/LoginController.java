package com.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.member.domain.MemberVO;
import com.member.service.MemberService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping(value="/login")
	public String handleLogin() {
		return "login/login";
	}
	
	@RequestMapping(value="/loginSuccess", method=RequestMethod.POST)
	public String login(@RequestParam(value = "memId") String memId, @RequestParam(value = "memPw") String memPw,
			MemberVO memberVO, HttpSession session) { //jsp의 memId와 memPw를 request함
		
		MemberVO list = memberService.selectById(memId);
		if(list.getMemId() == null || list.getMemPw() == null) {
			return "login/login";
		}
		else {
			if(list.getMemId().equals(memId) && list.getMemPw().equals(memPw)) {
				session.setAttribute("auth", list); //session 설정(속성이름, 속성 값)
				return "login/loginSuccess";
			}
			else {
				return "login/login";
			}
		}
	}
}
