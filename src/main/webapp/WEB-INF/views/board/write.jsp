<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>	
<%@ include file="/WEB-INF/views/commons/meta.jsp"%>
</head>
<body>
	<form:form commandName="boardVO" method="POST">
	<!-- header -->
	<c:if test="${!empty auth}">
		<%@ include file="/WEB-INF/views/commons/loginHeader.jsp" %>
	</c:if>
	<c:if test="${empty auth}">
		<%@ include file="/WEB-INF/views/commons/noLoginHeader.jsp" %>
	</c:if>
	
	<!--background-->
		<table border="1">
			<tr>
				<th><form:label path="title">제목</form:label></th>
				<td><form:input path="title" /> 
				<form:errors path="title" /></td>
			</tr>
			<tr>
				<th><form:label path="content">내용</form:label></th>
				<td><form:input path="content" /> 
				<form:errors path="content" />
				</td>
			</tr>
			<tr>
				<th><form:label path="writer">작성자</form:label></th>
				<td><form:input path="writer" /> 
				<form:errors path="writer" />
				</td>
			</tr>
			<tr>
				<th><form:label path="password">비밀번호</form:label></th>
				<td><%-- <form:input path="password" /> --%>
				<form:password path="password" /> 
				<form:errors path="password" /></td>
			</tr>
		</table>
		<div>
		<input type="submit" value="등록"> 
			<a href="<c:url value="/board/list" />">목록</a>
		</div>
	</form:form>
		<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>
</body>
</html>
