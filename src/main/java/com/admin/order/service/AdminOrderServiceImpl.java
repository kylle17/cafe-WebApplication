package com.admin.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.order.dao.AdminOrderDao;
import com.admin.order.domain.AdminOrderListVO;

@Service
public class AdminOrderServiceImpl implements AdminOrderService{
	
		@Autowired(required=false)
		AdminOrderDao adminOrderDao;
		
		//상품목록 서비스
		@Override
		public List<AdminOrderListVO> selectOrderList() {
			return adminOrderDao.selectOrderList();
		}
}
