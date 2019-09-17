package com.admin.advertisement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.advertisement.dao.AdminAdvertisementDao;
import com.advertisement.domain.AdvertisementVO;


@Repository
public class AdminAdvertisementServiceImpl implements AdminAdvertisementService {
	
	@Autowired
	AdminAdvertisementDao adminAdvertisementDao;
	
	
	@Override
	public List<AdvertisementVO> advertisementList() throws Exception {
		List<AdvertisementVO> adminAdvertisementList = adminAdvertisementDao.selectAdvertisementList();
	return adminAdvertisementList;
	}
	
	
	@Override
	public int updateAdvertisement(AdvertisementVO advertisementVO) throws Exception {
		int result = adminAdvertisementDao.updateAdvertisement(advertisementVO);
	return result;
	}

	

	
	
}