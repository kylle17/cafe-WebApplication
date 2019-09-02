package com.admin.order.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.order.dao.AdminOrderDao;
import com.admin.order.domain.AdminOrderListVO;

@Service
//서비스는 기능이다. dao로 가져온 데이터를 li로 정리한다.
public class AdminOrderListService {
	
	@Autowired
	private AdminOrderDao adminorderdao;
	
	public List<AdminOrderListVO> selectitemList() {
		List<AdminOrderListVO> result = adminorderdao.selectList();
		return result;
	}
	
//	public List<AdminOrderListVO> selectitemList() {
//		
//		
//		Map<String,AdminOrderListVO> orderMap = new HashMap<>(String,AdminOrderListVO);
//		List<AdminOrderListVO> result = adminorderdao.selectList();
//		orderMap.put("전체", result);
//		
//		List<AdminOrderListVO> result = adminorderdao.selectList("배송중");
//		orderMap.put("배송중", result);
//		List<AdminOrderListVO> result = adminorderdao.selectList("배송완료");
//		orderMap.put("배송중", result);
//		List<AdminOrderListVO> result = adminorderdao.selectList("제품 준비중 ");
//		orderMap.put("배송중", result);
//		
//		ModleAndView.add("ordermap" , orderMap);
//		return mov;
//	}

	public List<AdminOrderListVO> selectitemState1() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState1();
		return result;
	}
	
	public List<AdminOrderListVO> selectitemState2() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState2();
		return result;
	}
	
	public List<AdminOrderListVO> selectitemState3() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState3();
		return result;
	}
	
	public List<AdminOrderListVO> selectitemState_date() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState_date();
		return result;
	}
	
	public List<AdminOrderListVO> selectitemState_name() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState_name();
		return result;
	}
	
	
}
