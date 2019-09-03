package com.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout/logout";
	}
}
