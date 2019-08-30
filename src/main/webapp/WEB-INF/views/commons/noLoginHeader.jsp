<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--  1. header section  -->
<header>
	<div class="container">
		<!-- 위쪽 헤더 -->
		<div class="upper header">
			<!-- 로고 -->
			<div class="logo">
				<h1>
					<a href="${pageContext.request.contextPath}/">Play Cafe ξ</a>
				</h1>
			</div>
			<!-- 검색 창 -->
			<div class="searchBar">
				<input type="text" class="search" name="search" placeholder="원하는 메뉴를 입력하세요.">
				<button class="searchBtn" type="button">검색</button>
			</div>
			<!-- 사용자 프로필 -->
			<div class="profile">
				<a href="${pageContext.request.contextPath}/login">로그인</a>
				<a href="${pageContext.request.contextPath}/join/join">회원가입</a>
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