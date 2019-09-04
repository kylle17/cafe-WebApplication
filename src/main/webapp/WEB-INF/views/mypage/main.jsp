<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/WEB-INF/views/commons/meta.jsp"%>
</head>
<body>
	
	<!-- header -->
	<c:if test="${!empty auth}">
		<%@ include file="/WEB-INF/views/commons/loginHeader.jsp" %>
	</c:if>
	<c:if test="${empty auth}">
		<%@ include file="/WEB-INF/views/commons/noLoginHeader.jsp" %>
	</c:if>
	
	
	<!--side-->
	<nav class="side">    
		<li>
			<ul>
				<li><a href="${contextPath}/mypage/myDetailInfo.do">회원정보관리</a></li>
	            <br>
	            <li><a href="${contextPath}/mypage/listMyOrderHistory.do">주문내역</a></li>
				<br>
				<li><a href="#">회원탈퇴</a></li>
			</ul>
		</li>
	</nav>
	
	<!--background-->
	<%@ include file="/WEB-INF/views/mypage/orderHistory.jsp"%>


	
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>