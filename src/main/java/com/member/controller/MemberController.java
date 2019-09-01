package com.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.member.domain.MemberVO;
import com.member.service.MemberService;

@Controller
@RequestMapping("/join")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	//회원 가입 요청에 동작될 메서드
	/* @RequestMapping(value="/join/join") */
	@RequestMapping(value="/join")
	public String handleRegister() {
		return "join/join";
	}

	/* @RequestMapping(value="/join/joinSuccess", method=RequestMethod.POST) */
	@RequestMapping(value="/joinSuccess", method=RequestMethod.POST)
	public String register(MemberVO memberVO) {
		memberService.write(memberVO);
		return "join/joinSuccess";
	}
}
