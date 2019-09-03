package com.admin.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.order.dao.AdminOrderDao;
import com.admin.order.domain.AdminOrderListVO;

//@Service
//서비스는 기능이다. dao로 가져온 데이터를 li로 정리한다.
public class AdminOrderListService {
	
//	@Autowired
	private AdminOrderDao adminorderdao;
	
	public List<AdminOrderListVO> selectitemList() {
		List<AdminOrderListVO> result = adminorderdao.selectList();
		return result;
	}

	public List<AdminOrderListVO> selectitemState1() {
		List<AdminOrderListVO> result = adminorderdao.selectOrderState1();
		return result;
	}
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
