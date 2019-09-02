package com.admin.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.order.domain.AdminOrderListVO;

@Repository
public class AdminOrderDao {
	
		@Autowired
		private SqlSession sqlSession;
		
		//아이템 번호를 이용하여 작품 전체를 검색
		public List<AdminOrderListVO> selectList() {
			return sqlSession.selectList("orderListmapper.selectList");
		}
}
