<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ : �ֹ���ȸ </title>
</head>
<body>
	<h2>������ : �ֹ���ȸ </h2>
		<table>
				<tr>
					<td>�ֹ�����</td>
					<td>�ֹ���ȣ</td>
					<td>�ֹ��ڸ�</td>
					<td>�ֹ����</td>
					<td>�ֹ��ݾ�</td>
					<td>�ֹ�����</td>
					<td>����������</td>
				</tr>
			<c:forEach items="${AdminOrderListVO}" var="a">
				<tr>
					<td>${a.order_date}</td>
					<td>${a.orderNum}</td>
					<td>${a.memID}</td>
					<td>${a.order_method}</td>
					<td>${a.order_price}</td>
					<td>${a.order_state}</td>
					<td></td>	
				</tr>
			</c:forEach>
		</table>
</body>
</html>