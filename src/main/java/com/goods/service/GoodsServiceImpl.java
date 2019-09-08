package com.goods.service;
	import java.util.List;

	import javax.inject.Inject;

	import org.springframework.stereotype.Service;

	
	import com.goods.domain.GoodsVO;
	import com.goods.dao.GoodsDao;

	@Service
	public class GoodsServiceImpl implements GoodsService {

		@Inject
		private GoodsDao dao;


		// 상품등록
		@Override
		public void register(GoodsVO vo) throws Exception {
			dao.register(vo);		
		}

		// 상품목록
		@Override
		public List<GoodsVO> goodslist() throws Exception {
			return dao.goodslist();
		}
		
		
		

		// 상품조회
		@Override
		public GoodsVO goodsView(int gdsNum) throws Exception {
			return dao.goodsView(gdsNum);
		}
	} 
