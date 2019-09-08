<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="${pageContext.request.contextPath}/resources/js/adminMemberDelete.js"></script>
<title>회원 리스트</title>
</head>
<body>
	<!--background-->
	<form>
	    <table border="1">
	    	<tr>
	            <th>ID</th>
	            <th>이름</th>
	            <th>휴대폰</th>
	            <th>이메일</th>
	            <th>회원삭제</th>
	        </tr>
	        <c:forEach var="list" items="${memberList}" varStatus="loop">
	            <tr>
	                <td>${list.memId}</td>
	                <td>${list.memName}</td>
	                <td>${list.memPhone}</td>
	                <td>${list.memEmail}</td>
	                <td><input type="button" value="삭제" onclick="memberDelete('${list.memId}')"></td>
	            </tr>
	        </c:forEach>
	    </table>	
	</form>
    
  </body>
</html>