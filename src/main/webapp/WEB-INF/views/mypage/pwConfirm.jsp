<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String id = request.getParameter("memId"); %>
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
	<form action="pwSuccess" method="post">
		<input type="hidden" name="memId" value=<%=id%>>
		<input type="password" name="memPw" placeholder="비밀번호를 입력해주세요"/>
		<input type="submit" value="확인">
	</form>
	
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>