package com.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.member.dao.AdminMemberDao;
import com.member.domain.MemberVO;

@Service
public class AdminMemberServiceImpl implements AdminMemberService {
	
	@Autowired
	private AdminMemberDao AdminMemberDao;
	
	public void setMemberDao(AdminMemberDao AdminMemberDao) {
		this.AdminMemberDao = AdminMemberDao;
	}
	
	@Override
	public List<MemberVO> list() {
		return AdminMemberDao.list();
	}
}
