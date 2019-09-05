package com.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	//회원 가입 요청에 동작될 메서드
	@RequestMapping(value="/join")
	public String handleRegister() {
		return "join/join";
	}

	@RequestMapping(value="/joinSuccess", method=RequestMethod.POST)
	public String register(MemberVO memberVO) {
		String pw = memberVO.getMemPw(); //memberVO에 저장된 password를 꺼내옴
		String passwordEncoder = pwEncoder.encode(pw); //꺼내온 password를 암호화시킴
		memberVO.setMemPw(passwordEncoder); //암호화된 password를 다시 memberVO에 넣음
		memberService.write(memberVO);
		return "join/joinSuccess";
	}
	
	@RequestMapping(value="/idCheck")
	public String idCheck(@RequestParam(value="memId", required = false) String memId, Model model) {
		try {
			//아이디가 있는 경우
			MemberVO list = memberService.selectById(memId);
			model.addAttribute("memId", list.getMemId());
			return "join/idCheck";
		}catch (NullPointerException e) {
			//아이디가 없는 경우
			model.addAttribute("memId", null);
			return "join/idCheck";
		}
	}
}
