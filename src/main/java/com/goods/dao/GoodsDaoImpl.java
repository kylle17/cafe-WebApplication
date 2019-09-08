package com.goods.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.goods.domain.GoodsVO;

@Repository
public class GoodsDaoImpl implements GoodsDao {

	@Inject
	private SqlSession sql;
	
	// 매퍼 
	private static String namespace = "com.mybatis.mappers.goods-mapper";


	// 상품등록
	@Override
	public void register(GoodsVO vo) throws Exception {
		sql.insert(namespace + ".register", vo);
	}

	// 상품목록
	@Override
	public List<GoodsVO> goodslist() throws Exception {
		return sql.selectList(namespace + ".goodslist");
	}

	// 상품조회
	@Override
	public GoodsVO goodsView(int gdsNum) throws Exception {
		return sql.selectOne(namespace + ".goodsView", gdsNum);
	}
}