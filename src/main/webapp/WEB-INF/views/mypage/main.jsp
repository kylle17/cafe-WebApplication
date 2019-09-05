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
	<div class="flex_container">
	
	<!-- header -->
	<c:if test="${!empty auth}">
		<%@ include file="/WEB-INF/views/commons/loginHeader.jsp" %>
	</c:if>
	<c:if test="${empty auth}">
		<%@ include file="/WEB-INF/views/commons/noLoginHeader.jsp" %>
	</c:if>
	
	
	<section class="content">
	<!--side-->
	<nav>  		
		<ul>
			<li><a href="${contextPath}/mypage/memUpdate?memId=${auth.memId }&sideMenu=memUpdate">회원정보관리</a></li>
            <li><a href="${contextPath}/mypage/orderHistory?memId=${auth.memId }&sideMenu=orderHistory">주문내역</a></li>
			<li><a href="${contextPath}/mypage/memDelete?memId=${auth.memId }&sideMenu=memDelete">회원탈퇴</a></li>
		</ul>		
	</nav>
	
	<!--main-->
	<main>
	<c:if test="${sideMenu eq 'memUpdate'}">
		<%@ include file="/WEB-INF/views/mypage/memUpdate.jsp"%>
	</c:if>
	<c:if test="${sideMenu eq 'orderHistory'}">
		<%@ include file="/WEB-INF/views/mypage/orderHistory.jsp"%>
	</c:if>
	<c:if test="${sideMenu eq 'memDelete'}">
		<%@ include file="/WEB-INF/views/mypage/memDelete.jsp"%>
	</c:if>
	
	</main>

	<!-- side -->
	<aside>
	<div> 뭐시기 거시기 	</div>
	</aside>
	</section>
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>
	
	</div>
</body>
</html>