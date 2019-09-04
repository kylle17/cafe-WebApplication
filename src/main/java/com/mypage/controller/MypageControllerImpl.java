package com.mypage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.member.domain.MemberVO;
import com.mypage.domain.MypageVO;
import com.mypage.service.MypageServiceImpl;

@Controller
@RequestMapping(value="/mypage")
public class MypageControllerImpl {

	@Autowired
	private MypageServiceImpl mypageServiceImpl;
	
	@RequestMapping(value="/orderHistory")
	public ModelAndView orderHistory(@RequestParam("memId") String memId,HttpServletRequest request , HttpServletResponse response) {
		
		ModelAndView mov = new ModelAndView();
		//String viewName=(String)request.getAttribute("viewName");  //임시로 삭제 
		String viewName = "mypage/main";
		mov.setViewName(viewName);
		
//		HttpSession session = request.getSession();		
//		MemberVO memberVO = (MemberVO)session.getAttribute("memberInfo");
//		String memId = memberVO.getMemId();
		List<MypageVO> orderHistory = mypageServiceImpl.selectOrderHistoryList(memId);
		
		mov.addObject("orderHistory", orderHistory);
		
		return mov;
	}
}
