package com.goods.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.goods.domain.GoodsVO;
import com.goods.service.GoodsService;




@Controller
@RequestMapping(value="/goods")
public class GoodsController {

	
	@Inject
	GoodsService GoodsService;
	
	@Resource(name="uploadPath")
	private String uploadPath;

	// 상품 등록
		@RequestMapping(value = "/main", method = RequestMethod.GET)
		public void getGoodsRegister(Model model) throws Exception {
		
		}

	// 상품 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getGoodsList(Model model) throws Exception {
	
		
		List<GoodsVO> list = GoodsService.goodslist();
		
		model.addAttribute("list", list);
	}
	
	// 상품 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getGoodsview(@RequestParam("n") int gdsNum, Model model) throws Exception {
		
		
		GoodsVO goods = GoodsService.goodsView(gdsNum);
		
		model.addAttribute("view", goods);
	}
	
} 