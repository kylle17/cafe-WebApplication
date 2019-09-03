package com.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mypage.dao.MypageDao;
import com.mypage.domain.MypageVO;

@Service
public class MypageServiceImpl implements MypageService{
	
	@Autowired
	MypageDao mypageDao;
	
	@Override
	public List<MypageVO> selectOrderHistoryList(String memId) throws DataAccessException{
		List<MypageVO> orderHistoryList = mypageDao.selectOrderHistoryList(memId);
		return orderHistoryList;
	}

}
