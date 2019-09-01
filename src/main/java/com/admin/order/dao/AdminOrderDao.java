package com.admin.order.dao;

import java.util.List;

import com.admin.order.domain.AdminOrderListVO;
import com.member.domain.MemberVO;

public interface AdminOrderDao {
		List<AdminOrderListVO> selectOrderList();

	
}
