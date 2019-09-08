<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<form action="adminMemberDeleteSuccess">
		<b>${memId}</b>를 추방시키겠습니까?<br>
		<input type="hidden" name="memId" value="${param.memId}">
		<input type="submit" value="삭제"> <input type="button" value="취소" onclick="javascript:self.close()">	
	</form>
</html>