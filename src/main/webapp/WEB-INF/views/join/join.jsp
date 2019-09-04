<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/WEB-INF/views/commons/meta.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/join.js"></script>
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
	<form action="<c:url value="joinSuccess"/>" method="post" name="joinForm" onsubmit="return joinCheck()">
		<input type="text" name="memId" placeholder="아이디를 입력해주세요" autofocus required/> <input type="button" value="아이디 중복확인" onclick="idCheck(this.form.memId.value)"><br>
		<input type="password" name="memPw" placeholder="비밀번호를 입력해주세요" required/><br>
		<input type="password" name="memPwcon" placeholder="비밀번호를 확인해주세요" required/><br>
		<input type="text" name="memName" placeholder="이름을 입력해주세요" required/><br>
		<input type="radio" name="memGender" value="M" checked>남 <input type="radio" name="memGender" value="F" >여<br>
		<input type="number" name="memBirth" placeholder="생년월일 입력해주세요(ex.19940101)" maxlength="8" required/><br>
		<input type="number" name="memPhone" placeholder="휴대폰 번호를 입력해주세요(ex. 010xxxxxxxx)" maxlength="11" required/><br>
		<input type="email" name="memEmail" placeholder="이메일을 입력해주세요"/> <input type="button" value="이메일인증"><br>
		<input type="number" name="memPostCode" maxlength="6" required/> <input type="button" value="우편 번호 찾기"><br>
		<input type="text" name="memRoadName" required/><br>
		<input type="text" name="memDetail" required/><br>
		<input type="submit" value="회원가입">
	</form>

	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>