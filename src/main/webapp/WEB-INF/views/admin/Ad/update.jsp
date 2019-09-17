<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->

	<form action="${contextPath}/admin/Ad/updateConfirm" method="post" enctype="multipart/form-data" >
		<input type='hidden' name="ad_id1" id='ad_id'><br><br>
		광고분류 :  <input type='hidden' name="ad_type1" id='ad_type' ><br><br>
		파일이름 :  <input type='file' name="file_name1" id='file_name'><br><br>
		<input type='date' name="ad_credate1" id='ad_credate' value='01/01/01'>
		<input id="confirm" type="submit" value="확인" >
		<input id="cancel" type="button" value="취소" >
	</form>
	
	<script src="${pageContext.request.contextPath}/resources/js/adminAd/adminAdUpdate.js"></script>
	


	
