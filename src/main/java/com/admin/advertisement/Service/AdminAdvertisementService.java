package com.admin.advertisement.Service;

import java.util.List;

import com.advertisement.domain.AdvertisementVO;

public interface AdminAdvertisementService {
	
	public List<AdvertisementVO> advertisementList() throws Exception;
	public int updateAdvertisement(AdvertisementVO advertisementVO) throws Exception;
}
