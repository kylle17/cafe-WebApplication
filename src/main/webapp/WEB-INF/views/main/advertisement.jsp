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
			<c:if test="${item.fileType=='main'   }">
			<div class="advertisement_main">
				<img width="1344" height="1008" 
				class="link"  src="${contextPath}/resources/image/${item.fileName }.jpg"> 								
			</div>
			</c:if>
			<c:if test="${item.fileType!='main'   }">
			<div class="advertisement_sub">
				<img width="666" height="696"
				class="link"  src="${contextPath}/resources/image/${item.fileName }.jpg"> 								
			</div>
			</c:if>			
  		</c:forEach>
  	</div>
 