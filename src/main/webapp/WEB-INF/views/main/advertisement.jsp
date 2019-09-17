<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>  

	<div class="advertisement">
		<c:forEach var="item" items="${advertisementList }">
		<c:if test="${item.ad_type ne 'vod' }"> 
			<div class="advertisement_main">
				<img width="640" height="360"
				class="link"  src="${contextPath}/resources/adData/${item.file_name }"> 								
			</div>	
		</c:if>
		<c:if test="${item.ad_type eq 'vod' }">
			<video width="640" height="360" autoplay loop>
			  <source src="${contextPath}/resources/adData/${item.file_name }" type="video/mp4" >
			</video>
		</c:if>		
			
			
  		</c:forEach>
  	</div>
 