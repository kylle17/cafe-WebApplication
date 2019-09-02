package com.admin.order.service;

import java.util.List;

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
}
