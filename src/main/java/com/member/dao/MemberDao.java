package com.member.dao;

import com.member.domain.MemberVO;

public interface MemberDao {
	public abstract void insert(MemberVO memberVO);
	public abstract MemberVO selectById(String memId);
	public abstract void update(MemberVO memberVO);
	public abstract void delete(MemberVO memberVO);
}
