package com.advertisement.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.advertisement.domain.AdvertisementVO;
import com.advertisement.domain.ImageFileVO;

public interface AdvertisementDao {
	
	public List<AdvertisementVO> selectAdvertisementList() throws DataAccessException;

}
