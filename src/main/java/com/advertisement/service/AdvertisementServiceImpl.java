package com.advertisement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advertisement.dao.AdvertisementDao;
import com.advertisement.domain.AdvertisementVO;


@Service
public class AdvertisementServiceImpl implements AdvertisementService{
	
	@Autowired
	AdvertisementDao advertisementDao;
		
	
	public List advertisementList() throws Exception {
			List<AdvertisementVO> advertisementList = advertisementDao.selectAdvertisementList();
		return advertisementList;
		
	}





	

}
