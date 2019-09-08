<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<style>
#container_box table td { width:100px; }
</style>
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
	<div>
	<table>
 <thead>
 </thead>
 <tbody>
 <ul>
  <c:forEach items="${list}" var="list">
<li>
  <div class="goodsThumb">
  <img width="200" height="300"
				class="link"  src="${contextPath}/resources/image/${list.gdsThumbImg}">
  </div> 
  <div class="goodsName">
   <a href="${contextPath}/goods/view?n=${list.gdsNum}">${list.gdsName}</a>
  </div>
 </li>
 </c:forEach>
</ul>
</table>
	<br><br><br><br><br>
	</div>
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>