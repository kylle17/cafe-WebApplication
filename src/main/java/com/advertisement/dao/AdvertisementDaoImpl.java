package com.advertisement.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.advertisement.domain.AdvertisementVO;


@Repository
public class AdvertisementDaoImpl implements AdvertisementDao{
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<AdvertisementVO> selectAdvertisementList() throws DataAccessException {
		List<AdvertisementVO> advertisementList=(ArrayList)sqlSession.selectList("mapper.advertisement.selectAdvertisementList");
	   return advertisementList;	    
	}
	

	
	

	
}
