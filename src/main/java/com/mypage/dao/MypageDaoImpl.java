package com.mypage.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.mypage.domain.MypageVO;


@Repository
public class MypageDaoImpl implements MypageDao{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MypageVO> selectOrderHistoryList(String memId) throws DataAccessException {
		List<MypageVO> orderHistoryList=(ArrayList)sqlSession.selectList("mapper.orderHistory.selectOrderHistoryList",memId);
	   return orderHistoryList;	    
	}
	

}
