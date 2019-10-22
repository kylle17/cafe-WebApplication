<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->

	<form action="${contextPath}/admin/Ad/updateConfirm" method="post" enctype="multipart/form-data" >
		<input type='hidden' name="ad_id" id='ad_id'><br><br>
		광고분류 :
		<select name="ad_type" id='ad_type' >
		     <option value="img">사진</option>
		     <option value="vod">동영상</option>
		</select><br><br>
		파일이름 :  
		<input type='file' name="fileName" id='fileName'><br><br>
		<input type='hidden' name="ad_credate" id='ad_credate' value='01/01/01'>
		<input id="confirm" type="submit" value="확인" >
		<input id="cancel" type="button" value="취소" >
	</form>
	
	<script src="${pageContext.request.contextPath}/resources/js/adminAd/adminAdUpdate.js"></script>
	


	
