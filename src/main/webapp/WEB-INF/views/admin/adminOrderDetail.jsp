<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ : �ֹ���ȣ-�������� </title>
</head>
<body>
<!-- header --> 
<!-- background -->
	<h2>������ : �ֹ���ȣ-�������� </h2>
		<table>
			<c:forEach items="${AdminOrderNumDeliveryVO}" var="a">
				<tr>
					<td>�ֹ���ȣ</td><td>${a.orderNum}</td><td>�������</td><td>${a.pay_method}</td>
				</tr>
				<tr>
					<td>�ֹ�����</td><td>${a.order_date}</td><td>����ũ�ο���</td><td>${a.pay_ascro}</td>
				</tr>
				<tr>
					<td>��������</td><td>${a.order_account}</td><td>�Ա���</td><td>${a.memID}</td>
				</tr>
				<tr>
					<td>������ȣ</td><td>${a.del_num}</td><td>�߼�����</td><td>${a.del_request_day}</td>
				</tr>
				<tr>
					<td>ó������</td><td>${a.del_place}</td><td>�Ϸ�����</td><td>${a.del_complete_day}</td>
				</tr>
			</c:forEach>
		</table>
		
<!-- footer -->
</body>
</html>