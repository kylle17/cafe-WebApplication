<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>관리자 : 주문조회 </title>
</head>
<body>
<!-- header --> 
<!-- background -->
	<h2>관리자 : 주문조회 </h2>
	
	<input type="button" onclick="location.href='${contextPath}/adminOrderState1'" value="주문조회">
	<input type="button" value="결제완료">
	<input type="button" value="배송준비중">
	
		<table>
				<tr>
					<td>주문일자</td>
					<td>주문번호</td>
					<td>주문자명</td>
					<td>주문방법</td>
					<td>주문금액</td>
					<td>주문상태</td>
					<td>상제페이지</td>
				</tr>
			<c:forEach items="${AdminOrderListVO}" var="a">
				<tr>
					<td>${a.order_date}</td>
					<td>
					<a href="${path}/admin/adminOrderDetail.jsp?ORDERNUM=${a.orderNum}">${a.orderNum}</a>
					</td>
					<td>${a.memID}</td>
					<td>${a.order_method}</td>
					<td>${a.order_price}</td>
					<td>${a.order_state}</td>
					<td></td>	
				</tr>
			</c:forEach>
		</table>
		
<!-- footer -->
</body>
</html>