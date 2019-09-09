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
	            <th width="100">ID</th>
	            <th width="100">이름</th>
	            <th width="150">휴대폰</th>
	            <th width="175">이메일</th>
	            <th width="75">추방</th>
	        </tr>
	        <c:forEach var="list" items="${memberList}" varStatus="loop">
	            <tr>
	                <td>&nbsp;${list.memId}</td>
	                <td>&nbsp;${list.memName}</td>
	                <td>&nbsp;${list.memPhone}</td>
	                <td>&nbsp;${list.memEmail}</td>
	                <td><input type="button" value="삭제" onclick="memberDelete('${list.memId}')" style="width: 75px;"></td>
	            </tr>
	        </c:forEach>
	    </table>	
	</form>
    
  </body>
</html>