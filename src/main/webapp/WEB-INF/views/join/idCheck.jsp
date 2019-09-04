<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복체크</title>
</head>
<body>
	<c:choose>
		<c:when test="${memId == null}">
			<h3>사용가능한 아이디 입니다.</h3><br>
			<a href="#" onclick="javascript:self.close()">닫기</a>
		</c:when>
		<c:otherwise>
			<h3>중복된 아이디 입니다.</h3><br>
			<a href="#" onclick="javascript:self.close()">닫기</a>
		</c:otherwise>
	</c:choose>
</body>
</html>