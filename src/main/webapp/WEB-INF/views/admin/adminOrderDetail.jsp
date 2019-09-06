<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>관리자 : 주문번호-상세페이지 </title>
</head>
<body>
<!-- header --> 
<!-- background -->
	<h2>관리자 : 주문번호-상세페이지 </h2>
		<table>
			<c:forEach items="${AdminOrderNumDeliveryVO}" var="a">
				<tr>
					<td>주문번호</td><td>${a.orderNum}</td><td>결제방법</td><td>${a.pay_method}</td>
				</tr>
				<tr>
					<td>주문일자</td><td>${a.order_date}</td><td>에스크로여부</td><td>${a.pay_ascro}</td>
				</tr>
				<tr>
					<td>결제계좌</td><td>${a.order_account}</td><td>입금인</td><td>${a.memID}</td>
				</tr>
				<tr>
					<td>운송장번호</td><td>${a.del_num}</td><td>발송일자</td><td>${a.del_request_day}</td>
				</tr>
				<tr>
					<td>처리상태</td><td>${a.del_place}</td><td>완료일자</td><td>${a.del_complete_day}</td>
				</tr>
			</c:forEach>
		</table>
		
<!-- footer -->
</body>
</html>