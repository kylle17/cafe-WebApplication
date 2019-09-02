package com.admin.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.order.domain.AdminOrderListVO;

@Repository
public abstract class AdminOrderDaoImpl implements AdminOrderDao{

	@Autowired(required=false)
	SqlSession sqlSession;
	
	@Override
	public List<AdminOrderListVO> selectOrderList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("orderlist.selectOrderList");
	}


}
