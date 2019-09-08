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
			<li><a href="${contextPath}/admin/adminAd?memId=${auth.memId }&sideMenu=adminAd">광고 관리</a></li>
            <li><a href="${contextPath}/admin/member/adminMemberList?memId=${auth.memId }&sideMenu=adminMemberList">회원 관리</a></li>
			<li><a href="${contextPath}/admin/admin?memId=${auth.memId }&sideMenu=admin">제품 관리</a></li>
			<li><a href="${contextPath}/admin/admin?memId=${auth.memId }&sideMenu=admin">주문 관리</a></li>
			<li><a href="${contextPath}/admin/admin?memId=${auth.memId }&sideMenu=admin">재고 관리</a></li>
			<li><a href="${contextPath}/admin/admin?memId=${auth.memId }&sideMenu=admin">매출 관리</a></li>
			<li><a href="${contextPath}/admin/admin?memId=${auth.memId }&sideMenu=admin">게시판 관리</a></li>
		</ul>		
	</nav>
	
	
	
	<!--main-->
	<main>
	<c:if test="${sideMenu eq 'adminAd'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
	</c:if>
	<c:if test="${sideMenu eq 'adminMemberList'}">
		<%@ include file="/WEB-INF/views/admin/member/adminMemberList.jsp"%><!-- 회원 관리 -->
	</c:if>
	<c:if test="${sideMenu eq 'admin'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
	</c:if>
		<c:if test="${sideMenu eq 'admin'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
	</c:if>
		<c:if test="${sideMenu eq 'admin'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
	</c:if>
		<c:if test="${sideMenu eq 'admin'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
	</c:if>
		<c:if test="${sideMenu eq 'admin'}">
		<%@ include file="/WEB-INF/views/admin/adminAd.jsp"%>
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