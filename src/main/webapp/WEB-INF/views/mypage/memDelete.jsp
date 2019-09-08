<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	
	<!--background-->
	<form action="memDeleteSuccess">
		정말 탈퇴하시겠습니까?<br>
		탈퇴를 원한다면 <b>'탈퇴하겠습니다'</b>를 입력하시오<br>
		<input type="text" name="realDelete"><br>
		<input type="submit" value="회원탈퇴">
		<input type="hidden" name="memId" value="${param.memId}">
	</form>

	
