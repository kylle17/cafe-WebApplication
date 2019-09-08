<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header>
	<div class="container">
		<!--위쪽 헤더-->
		<div class="upper header">
			<!-- 로고 -->
			<div class="logo">
				<h1>
					<a href="${pageContext.request.contextPath}/">Play Cafe ξ</a>
				</h1>
			</div>
			<!-- 검색 창 -->
			<div class="searchBar">
				<input type="search" class="search" name="search" placeholder="원하는 메뉴를 입력하세요">
				<button class="searchBtn" type="button">검색</button>
			</div>
			<!-- 사용자 프로필 -->
			<div class="profile">
				<span class="userName"><b>${auth.memName} 님</b></span>
				<!-- 마이페이지로 이동 or 관리자 모드 -->
				<c:if test="${auth.memId eq 'system'}">
					<a href="${pageContext.request.contextPath}/admin/adminAd?memId=${auth.memId }&sideMenu=adminAd">관리페이지</a>
				</c:if>
				<c:if test="${auth.memId ne 'system' }"> 
					<a href="${pageContext.request.contextPath}/mypage/pwConfirm?memId=${auth.memId}" title="마이 페이지"> 마이페이지 
					<%-- <a href="${pageContext.request.contextPath}/mypage/memUpdate?memId=${auth.memId }&sideMenu=memUpdate" title="마이 페이지"> 마이페이지  --%>
					<%-- <img class="thumbnail" src="${auth.thumbnail}" alt="썸네일" /> --%>
				</a>
				</c:if>
				
				
				<!-- 장바구니로 이동 --> 
				<a href="${pageContext.request.contextPath}/myPage/shoppingBag" title="장바구니">
					<i class="fas fa-shopping-cart" class="icon"></i>
				</a>
				<a href="${pageContext.request.contextPath}/logout/logout">로그아웃</a>
			</div>
		</div>
		<div class="lower header">
			<nav>
				<ul class="gnb">
					<li><a href="${pageContext.request.contextPath}/">Event</a></li>
					<li><a href="${pageContext.request.contextPath}/goods/list">Menu</a></li>
					<li><a href="${pageContext.request.contextPath}/order/list">order</a></li>
					<li><a href="${pageContext.request.contextPath}/store/view">Store</a></li>
					<li><a href="${pageContext.request.contextPath}/board/list">Customer Service</a></li>
				</ul>
			</nav>
		</div>
	</div>
</header>