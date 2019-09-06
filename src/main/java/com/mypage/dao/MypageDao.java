package com.mypage.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mypage.domain.MypageVO;

public interface MypageDao {
	public List<MypageVO> selectOrderHistoryList(String memId) throws DataAccessException;
}
