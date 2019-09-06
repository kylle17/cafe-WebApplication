package com.goods.dao;

import java.util.List;

import com.goods.domain.GoodsVO;

public interface GoodsDao {
	
	
	// 상품등록
	public void register(GoodsVO vo) throws Exception;
	
	// 상품목록
	public List<GoodsVO> goodslist() throws Exception;
	
	// 상품조회
	public GoodsVO goodsView(int gdsNum) throws Exception;
}