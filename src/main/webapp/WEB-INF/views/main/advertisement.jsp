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
			<div class="advertisement_main">
				<img width="1497" height="998"
				class="link"  src="${contextPath}/resources/image/${item.fileName }"> 								
			</div>		
  		</c:forEach>
  	</div>
 