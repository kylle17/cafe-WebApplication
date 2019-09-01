package com.advertisement.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.advertisement.domain.AdvertisementVO;

public interface AdvertisementDao {
	
	public List<AdvertisementVO> selectAdvertisementList() throws DataAccessException;

}
