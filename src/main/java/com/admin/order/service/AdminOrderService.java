package com.admin.order.service;

import java.util.List;

import com.admin.order.domain.AdminOrderListVO;

public interface AdminOrderService {
	
	public abstract List<AdminOrderListVO> selectOrderList();

}
