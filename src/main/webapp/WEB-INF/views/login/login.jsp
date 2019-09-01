<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	
	<!--background-->
	<form action="<c:url value="loginSuccess"/>" method="post">
		<input type="text" name="memId" placeholder="아이디를 입력해주세요" autofocus required /><br>
		<input type="password" name="memPw" placeholder="비밀번호를 입력해주세요" required /><br>
		<input type="submit" value="로그인">
	</form>

	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>