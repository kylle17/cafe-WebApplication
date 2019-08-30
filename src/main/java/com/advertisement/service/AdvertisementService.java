package com.advertisement.service;

import java.util.List;
import java.util.Map;

import com.advertisement.domain.AdvertisementVO;

public interface AdvertisementService {
	
	public List<AdvertisementVO> advertisementList() throws Exception;
	
}
