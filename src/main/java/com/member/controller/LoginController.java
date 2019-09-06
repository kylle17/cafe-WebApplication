package com.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.member.domain.LoginCommand;
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
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@RequestMapping(value="/login")
	public String handleLogin(Model model, //view로 값을 넘김
			@CookieValue(value="REMEMBER", required=false) Cookie rememberId) {
		if(rememberId != null) { //Cookie가 있을 때
			model.addAttribute("loginId", rememberId.getValue()); //login.jsp의 ${loginId}에 rememberId.getValue() 값을 넣음
			model.addAttribute("check", 1);
		}
		return "login/login";		
	}
	
	@RequestMapping(value="/loginSuccess", method=RequestMethod.POST)
	public String login(LoginCommand loginCommand, //커멘드객체(jsp에서 넘어온 값들)
			HttpSession session, //Session 사용
			HttpServletResponse response) { //Cookie 사용할 때
		
		try {
			MemberVO list = memberService.selectById(loginCommand.getMemId()); //memId에 대한 정보값이 list에 저장
			if(list == null) { //아이디가 존재하지 않는 경우
				try {
					response.setCharacterEncoding("UTF-8");
					PrintWriter pw = response.getWriter();
					pw.println("<script>"
								+ "alert('존재하지 않는 아이디입니다.');"
							+ "</script>");
					pw.flush();
					return "login/login";
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			boolean passwordMatch = pwEncoder.matches(loginCommand.getMemPw(), list.getMemPw()); //BCryptPasswordEncoder.matches를 사용하여 html에서 가져온 값과 db에서 가져온 값을 match시킨다.
			
			if(passwordMatch) { //html에서 입력한 값과 db에서 가져온 값이 같으면
				//session 설정
				session.setAttribute("auth", list); //session 설정(속성이름, 속성 값)
				
				//Cookie 설정
				Cookie cookie = new Cookie("REMEMBER", loginCommand.getMemId()); //Cookie 설정
				
				cookie.setPath("/");
				if(loginCommand.isRememberId()) {
					cookie.setMaxAge(60*60*24*30); //한달
				}
				else {
					cookie.setMaxAge(0);
				}
				response.addCookie(cookie);
				return "login/loginSuccess";
			}
			else { //html에서 입력한 비밀번호 값과 db에서 가져온 비밀번호 값이 다르면
				try {
					response.setCharacterEncoding("UTF-8");
					PrintWriter pw = response.getWriter();
					pw.println("<script>"
								+ "alert('비밀번호가 일치하지 않습니다.');"
								+ "history.go(-1);"
							+ "</script>");
					pw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return "login/login";
		} catch (NullPointerException e) {
			return "/";
		}
	}
}
