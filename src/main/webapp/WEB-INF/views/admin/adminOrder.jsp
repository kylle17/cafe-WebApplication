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
<!-- header --> 
<!-- background -->
	<h2>������ : �ֹ���ȸ </h2>
	
	<input type="button" onclick="location.href='${contextPath}/adminOrderState1'" value="�ֹ���ȸ">
	<input type="button" value="�����Ϸ�">
	<input type="button" value="����غ���">
	
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