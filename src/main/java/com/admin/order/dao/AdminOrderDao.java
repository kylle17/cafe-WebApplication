package com.admin.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.order.domain.AdminOrderListVO;
import com.member.domain.MemberVO;

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
		
		public List<AdminOrderListVO> selectOrderNum(String orderNum) {
			// TODO Auto-generated method stub
			return sqlSession.selectList("orderListmapper.selectOrderNum",orderNum);
		}

		
//		//기능별 조회
//		public List<AdminOrderListVO> selectOrderState1() {
//			return sqlSession.selectList("orderListmapper.selectOrderState1");
//		}
//		
//		public List<AdminOrderListVO> selectOrderState2() {
//			return sqlSession.selectList("orderListmapper.selectOrderState2");
//		}
//		
//		public List<AdminOrderListVO> selectOrderState3() {
//			return sqlSession.selectList("orderListmapper.selectOrderState3");
//		}
//		
//		public List<AdminOrderListVO> selectOrderState_date() {
//			return sqlSession.selectList("orderListmapper.selectOrderState_date");
//		}
//		
//		public List<AdminOrderListVO> selectOrderState_name() {
//			return sqlSession.selectList("orderListmapper.selectOrderState_name");
//		}


		
		
		//검색갯수 조회
		
}
