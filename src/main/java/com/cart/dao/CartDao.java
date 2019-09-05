package com.cart.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cart.domain.CartVO;

@Repository
public class CartDao {

    @Autowired
    SqlSession sqlSession;

    // 1. 장바구니 추가
    public void insert(CartVO vo) {
        sqlSession.insert("cart.insertCart", vo);
    }
    // 2. 장바구니 목록
    public List<CartVO> listCart(String memId) {
        return sqlSession.selectList("cart.listCart", memId);
    }
    // 3. 장바구니 삭제
    public void delete(int cartId) {
        sqlSession.delete("cart.deleteCart", cartId);
    }
    // 4. 장바구니 수정
    public void modifyCart(CartVO vo) {
        sqlSession.update("cart.modifyCart", vo);
    }
    // 5. 장바구니 금액 합계
    public int sumMoney(String memID) {
        sqlSession.selectOne("cart.sumMoney", memID);
        return sqlSession.selectOne("cart.sumMoney", memID);
    }
    // 6. 장바구니 동일한 상품 레코드 확인
    public int countCart(int productId, String memID) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productId", productId);
        map.put("memID", memID);
        return sqlSession.selectOne("cart.countCart", map);
    }
    // 7. 장바구니 상품수량 변경
    public void updateCart(CartVO vo) {
        sqlSession.update("cart.sumCart", vo);
    }
}
