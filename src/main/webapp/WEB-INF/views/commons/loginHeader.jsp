<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<span class="userName">${auth.memName} 님</span>
				<!-- 마이페이지로 이동 -->
				<a href="${pageContext.request.contextPath}/myPage" title="마이 페이지"> 
					<img class="thumbnail" <%-- src="${auth.thumbnail}" --%> alt="썸네일" />
				</a>
				<!-- 장바구니로 이동 --> 
				<a href="${pageContext.request.contextPath}/myPage/shoppingBag" title="장바구니">
					<i class="fas fa-shopping-cart" class="icon"></i>
				</a>
				<a href="${pageContext.request.contextPath}/logout">로그아웃</a>
			</div>
		</div>
		<div class="lower header">
			<nav>
				<ul class="gnb">
					<li><a href="${pageContext.request.contextPath}/">Event</a></li>
					<li><a href="${pageContext.request.contextPath}/">Menu</a></li>
					<li><a href="${pageContext.request.contextPath}/">Store</a></li>
					<li><a href="${pageContext.request.contextPath}/">Customer Service</a></li>
					<li><a href="${pageContext.request.contextPath}/mypage/orderHistory?memId=${auth.memId }">MyPage</a></li>
				</ul>
			</nav>
		</div>
	</div>
</header>