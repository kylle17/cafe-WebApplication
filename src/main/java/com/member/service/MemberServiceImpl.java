package com.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.dao.MemberDao;
import com.member.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	//회원가입
	@Override
	public void write(MemberVO memberVO) {
		memberDao.insert(memberVO);
	}
	@Override
	public MemberVO selectById(String memId) {
		return memberDao.selectById(memId);
	}
}
