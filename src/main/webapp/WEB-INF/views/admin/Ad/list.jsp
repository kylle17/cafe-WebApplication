<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->
	<h3>광고 목록</h3><br><br>
	<table class="adminAd_table">
		<tr style="background:#EAEAEA" >
			<td>광고 이미지</td>
			<td>광고 구분</td>
			<td>파일명</td>			
			<td>수정</td>
			<td>삭제</td>
		</tr>
		<c:set var="count" value="0"/>
		<c:forEach var="item" items="${advertisementList }">
			<c:set var="count" value="${count+1 }"/>
			<input type="hidden" class='ad_id' value='${item.ad_id }'/>
			<tr>
			 			
			<td><c:if test="${item.ad_type ne 'vod' }">
			<img width="200" height="130"
				class="link"  src="${contextPath}/resources/adData/${item.file_name }">
			</c:if>
			<c:if test="${item.ad_type eq 'vod' }">
			<video width="200" height="130" controls>
			  <source src="${contextPath}/resources/adData/${item.file_name }" type="video/mp4" >
			</video>
			</c:if></td>
			<td><input type="hidden" class="ad_type" value="${item.ad_type }">${item.ad_type }</td>			
			<td><input type="hidden" class="file_name"  value="${item.file_name }">${item.file_name }</td>
			<td><input id="adUpdate${count }" type="button" value="수정"></td>
			<td><input class="adDelete" type="button" value="삭제"></td>			
			</tr>			
  		</c:forEach>
  	</table>
	<script src="${pageContext.request.contextPath}/resources/js/adminAd/adminAdList.js"></script>

	

	
