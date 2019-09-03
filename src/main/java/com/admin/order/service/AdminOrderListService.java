package com.admin.order.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.admin.order.dao.AdminOrderDao;
import com.admin.order.domain.AdminOrderListVO;

@Service
//서비스는 기능이다. dao로 가져온 데이터를 li로 정리한다.
public class AdminOrderListService {
	
	@Autowired
	private AdminOrderDao adminorderdao;
	
//주문상태조회
	
	//전체목록
	public List<AdminOrderListVO> selectitemList() {
		List<AdminOrderListVO> result = adminorderdao.selectList();
		return result;
	}
	
	//조건에맞는 목록
	public List<AdminOrderListVO> selectitemList(String orderUrl) {
		List<AdminOrderListVO> result = adminorderdao.selectList1(orderUrl);
		return result;
	}

//주문번호에 대한 상세 페이지
	public List<AdminOrderListVO> selectitemOrderNum(String orderNum) {
		// TODO Auto-generated method stub
		List<AdminOrderListVO> result1 = adminorderdao.selectOrderNum(orderNum);
		return result1;
	}
	
//	public ModelAndView selectitemList(ModelAndView mav) {
//		
//			 //key  ,  value
//		Map<String,AdminOrderListVO> orderMap = new HashMap<String,AdminOrderListVO>();
//		List<AdminOrderListVO> result = adminorderdao.selectList();
//		orderMap.put("전체", (AdminOrderListVO) result);
//		
//		List<AdminOrderListVO> result1 = adminorderdao.selectList("주문접수");
//		orderMap.put("주문접수", (AdminOrderListVO) result1);
//		List<AdminOrderListVO> result2 = adminorderdao.selectList("결제완료");
//		orderMap.put("결제완료", (AdminOrderListVO) result2);
//		List<AdminOrderListVO> result3 = adminorderdao.selectList("배송준비중");
//		orderMap.put("배송준비중", (AdminOrderListVO) result3);
//		
//		mav.addObject("orderMap", orderMap);
//		return mav;
//	}

//	public List<AdminOrderListVO> selectitemState1() {
//		List<AdminOrderListVO> result = adminorderdao.selectOrderState1();
//		return result;
//	}
//	
//	public List<AdminOrderListVO> selectitemState2() {
//		List<AdminOrderListVO> result = adminorderdao.selectOrderState2();
//		return result;
//	}
//	
//	public List<AdminOrderListVO> selectitemState3() {
//		List<AdminOrderListVO> result = adminorderdao.selectOrderState3();
//		return result;
//	}
//	
//	public List<AdminOrderListVO> selectitemState_date() {
//		List<AdminOrderListVO> result = adminorderdao.selectOrderState_date();
//		return result;
//	}
//	
//	public List<AdminOrderListVO> selectitemState_name() {
//		List<AdminOrderListVO> result = adminorderdao.selectOrderState_name();
//		return result;
//	}

	
	
}
