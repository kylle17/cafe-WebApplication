<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>  

	<img class="linst" src="${contextPath}/resources/image/커피1.jpg">
	<div class="main_book">야호
		<c:forEach var="item" items="${advertisementList }">
			<div class="book">야호
				<img class="linst"  src="${contextPath}/resources/image/${item.fileName }.jpg"> 								
			</div>
  		</c:forEach>
  	</div>
 