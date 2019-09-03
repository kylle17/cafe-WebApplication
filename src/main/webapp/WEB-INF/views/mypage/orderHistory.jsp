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
<article>	
	<table class="orderHistory">
		<tr style="background:#EAEAEA" >
			<td>주문번호</td>
			<td>주문일자</td>
			<td>주문상품</td>
			<td>주문상품</td>
			<td>주문가격</td>			
			<td>주문상태</td>
			<td>주문취소</td>
		</tr>
		<c:forEach var="item" items="${orderHistory }">
			<tr>
			<td>${item.order_num }</td>
			<td>${item.order_date }</td>
			<td>${item.product_title }</td>
			<td>${item.fileName }</td>
			<td>${item.product_price }</td>
			<td>${item.delivery_state }</td>			
			</tr>
  		</c:forEach>
  	</table>
 </article> 	

	
	
	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>