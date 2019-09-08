package com.admin.member.dao;

import java.util.List;

import com.member.domain.MemberVO;

public interface AdminMemberDao {
	public abstract List<MemberVO> list();
}
