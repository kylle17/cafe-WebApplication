package com.mypage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.member.domain.MemberVO;
import com.member.service.MemberService;
import com.mypage.domain.MemberUpdateCommand;
import com.mypage.domain.MypageVO;
import com.mypage.service.MypageServiceImpl;

@Controller
@RequestMapping(value="/mypage")
public class MypageControllerImpl implements MypageController{

	@Autowired
	private MypageServiceImpl mypageServiceImpl;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@RequestMapping(value="/pwConfirm")
	public String pwConfirm() {
		return "mypage/pwConfirm";
	}
	@RequestMapping(value="/pwSuccess")
	public ModelAndView pwSuccess(@RequestParam("memId") String id,	@RequestParam("memPw") String pw, HttpServletResponse response) throws IOException {
		ModelAndView mov = new ModelAndView();
		
		MemberVO list = memberService.selectById(id);
		
		boolean passwordMatch = pwEncoder.matches(pw, list.getMemPw());
		
		if(passwordMatch) {
			String viewName = "mypage/pwSuccess";
			mov.setViewName(viewName);
			return mov;
		}
		else {
			response.setCharacterEncoding("UTF-8");
			PrintWriter print = response.getWriter();
			print.println("<script>"
						+ "alert('비밀번호가 일치하지 않습니다.');"
						+ "history.go(-1);"
					+ "</script>");
			print.flush();
			String viewName = "mypage/pwConfirm";
			mov.setViewName(viewName);
			return mov;
		}
		
	}
	
	//회원정보수정
	@RequestMapping(value="/memUpdate")
	public ModelAndView memUpdate(@RequestParam("sideMenu") String sideMenu, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		String viewName = "mypage/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );

		
		return mov;
	}
	@RequestMapping(value="/memUpdateSuccess")
	public ModelAndView memUpdateSuccess(MemberUpdateCommand update, //jsp에서 가져온 request 값
			HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mov = new ModelAndView();
		MemberVO memberVO = memberService.selectById(update.getMemId());
		
		//비밀번호 변경
		boolean passwordMatch = pwEncoder.matches(update.getMemPw(), memberVO.getMemPw());
		
		if(!passwordMatch) { //request값과 db의 있는 값이 다르면
			String pw = update.getMemPw();
			String dbPw = pwEncoder.encode(pw);
			memberVO.setMemPw(dbPw);
		}
		
		//휴대폰 변경
		if(!memberVO.getMemPhone().equals(update.getMemPhone())) {
			String phone = update.getMemPhone();
			memberVO.setMemPhone(phone);
		}
		
		//이메일 변경
		if(!memberVO.getMemEmail().equals(update.getMemEmail())) {
			String email = update.getMemEmail();
			memberVO.setMemEmail(email);
		}
		
		//주소 변경
		if(!memberVO.getMemPostCode().equals(update.getMemPostCode())
				|| !memberVO.getMemRoadName().equals(update.getMemRoadName())
				|| !memberVO.getMemDetail().equals(update.getMemDetail())) {
			String postCode = update.getMemPostCode();
			String roadName = update.getMemRoadName();
			String detail = update.getMemDetail();
			
			memberVO.setMemPostCode(postCode);
			memberVO.setMemRoadName(roadName);
			memberVO.setMemDetail(detail);
		}
		
		memberService.update(memberVO);
		String viewName = "mypage/memUpdateSuccess";
		mov.setViewName(viewName);
		
		return mov;
	}
	
	
	@RequestMapping(value="/orderHistory")
	public ModelAndView orderHistory(@RequestParam("sideMenu") String sideMenu, @RequestParam("memId") String memId,HttpServletRequest request , HttpServletResponse response) {
		
		ModelAndView mov = new ModelAndView();
		//String viewName=(String)request.getAttribute("viewName");  //임시로 삭제 
		String viewName = "mypage/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
		
		List<MypageVO> orderHistory = mypageServiceImpl.selectOrderHistoryList(memId);
		
		mov.addObject("orderHistory", orderHistory);
		
		return mov;
	}
	
	
	@RequestMapping(value="/memDelete")
	public ModelAndView memDelete(@RequestParam("sideMenu") String sideMenu,HttpServletRequest request , HttpServletResponse response) {
		
		ModelAndView mov = new ModelAndView();
		String viewName = "mypage/main";
		mov.setViewName(viewName);
		
		HttpSession session = request.getSession();		
		session.setAttribute("sideMenu", sideMenu );
		
		return mov;
	}
	
	@RequestMapping(value="/memDeleteSuccess")
	public ModelAndView memDeleteSuccess(@RequestParam("realDelete") String delete,
			@RequestParam("memId") String id,
			HttpSession session) {
		
		ModelAndView mov = new ModelAndView();
		MemberVO memberVO = memberService.selectById(id);
		//회원탈퇴
		String str = "탈퇴하겠습니다";
		if(delete.equals(str)) {
			memberService.delete(memberVO);
		}
		
		session.invalidate();	
		String viewName = "mypage/memDeleteSuccess";
		mov.setViewName(viewName);
		
		
		return mov;
	}
	
}
