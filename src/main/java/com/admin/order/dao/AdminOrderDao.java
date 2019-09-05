package com.admin.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.order.domain.AdminOrderListVO;
import com.admin.order.domain.AdminOrderNumDeliveryVO;

@Repository
public class AdminOrderDao {
	
		@Autowired
		private SqlSession sqlSession;
		
		//아이템 번호를 이용하여 작품 전체를 검색
		public List<AdminOrderListVO> selectList() {
			return sqlSession.selectList("orderListmapper.selectList");
		}
		
		public List<AdminOrderListVO> selectList1(String orderUrl) {
			System.out.println(orderUrl);
//			List<AdminOrderListVO> select = sqlSession.selectList("orderListmapper.selectList1",orderUrl);
			return sqlSession.selectList("orderListmapper.selectList1",orderUrl);
		}
		
		//주문번호에대한 상세페이지
		public List<AdminOrderNumDeliveryVO> selectOrderNum(String orderNum) {
			System.out.println("주문번호"+orderNum);
			return sqlSession.selectList("orderListmapper.selectOrderNum",orderNum);
			
		}

		
		//기능별 조회

//		public List<AdminOrderListVO> selectOrderState_date() {
//			return sqlSession.selectList("orderListmapper.selectOrderState_date");
//		}
//		
//		public List<AdminOrderListVO> selectOrderState_name() {
//			return sqlSession.selectList("orderListmapper.selectOrderState_name");
//		}


		
		
		//검색갯수 조회
		
}
