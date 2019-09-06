package com.mypage.service;

import java.util.ArrayList;
import java.util.Iterator;
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
		List<MypageVO> orderHistoryList = null;
		Iterator it = mypageDao.selectOrderHistoryList(memId).iterator();
		int i = 0;
		while(it.hasNext()) {
			MypageVO mypageVO = (MypageVO)it.next();			
			if(orderHistoryList==null) {
				orderHistoryList = new ArrayList<MypageVO>();
				orderHistoryList.add(mypageVO);
			}else if (mypageVO.getOrder_num()==orderHistoryList.get(i).getOrder_num()) {
				orderHistoryList.get(i).setProduct_price(orderHistoryList.get(i).getProduct_price()+mypageVO.getProduct_price());				
			}else {
				orderHistoryList.add(mypageVO);
				i++;
			}
		};
		return orderHistoryList;
	}

}
