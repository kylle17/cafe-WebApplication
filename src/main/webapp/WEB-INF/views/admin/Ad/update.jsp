<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->

	<form action="${contextPath}/member/addMember.do" method="post">
		<input type='text' name='광고id' id='ad_id' value=${ad_id }><br><br>
		<input type='text' name='광고제목' id='ad_title'><br><br>
		<input type='text' name='파일이름' id='fileName'><br><br>
		<input id="confirm" type="button" value="확인" >
		<input id="cancel" type="button" value="취소" >
	</form>
	<script src="${pageContext.request.contextPath}/resources/js/adminAd/adminAdUpdate.js"></script>
	


	
