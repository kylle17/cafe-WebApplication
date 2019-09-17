package com.admin.advertisement.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.advertisement.domain.AdvertisementVO;


@Repository
public class AdminAdvertisementDaoImpl implements AdminAdvertisementDao{
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<AdvertisementVO> selectAdvertisementList() throws DataAccessException {
		List<AdvertisementVO> advertisementList=(ArrayList)sqlSession.selectList("mapper.adminAdvertisement.selectAdvertisementList");
	   return advertisementList;	    
	}
	
	
	@Override
	public int updateAdvertisement(AdvertisementVO advertisementVO) throws DataAccessException {
		int result = (int)sqlSession.update("mapper.adminAdvertisement.updateAdvertisement",advertisementVO);
	   return result;	    
	}
	
}
