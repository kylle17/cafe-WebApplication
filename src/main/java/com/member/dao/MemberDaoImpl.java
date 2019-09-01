package com.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.member.domain.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	//회원가입
	@Override
	public void insert(MemberVO memberVO) {
		//sqlSessionTemplate.insert("mapper의 namespace.insert", memberVO);
		sqlSessionTemplate.insert("memberDao.insert", memberVO);
	}
	//로그인
	@Override
	public MemberVO selectById(String memId) {
		List<MemberVO> results = sqlSessionTemplate.selectList("memberDao.selectById", memId);
		return results.isEmpty() ? null : results.get(0);
	}
}
