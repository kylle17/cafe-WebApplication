package com.admin.advertisement.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.advertisement.domain.AdvertisementVO;


public interface AdminAdvertisementDao {
	public List<AdvertisementVO> selectAdvertisementList() throws DataAccessException;
	
	public int updateAdvertisement(AdvertisementVO advertisementVO) throws DataAccessException;
}
