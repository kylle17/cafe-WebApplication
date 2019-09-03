package com.mypage.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mypage.domain.MypageVO;

public interface MypageService {
	public List<MypageVO> selectOrderHistoryList(String memId) throws DataAccessException;
}
