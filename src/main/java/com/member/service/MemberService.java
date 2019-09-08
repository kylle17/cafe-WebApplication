package com.member.service;

import com.member.domain.MemberVO;

public interface MemberService {
	public abstract void write(MemberVO memberVO);
	public abstract MemberVO selectById(String memId);
	public abstract void update(MemberVO memberVO);
	public abstract void delete(MemberVO memberVO);
}
