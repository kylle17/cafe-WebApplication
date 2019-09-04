<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->
<article class="orderHistory">
	<br><br>
	<div>
	주문내역 
	</div>
	<br><br>
	
	<table class="orderHistory_table">
		<tr style="background:#EAEAEA" >
			<td>주문번호</td>
			<td>주문일자</td>
			<td>상품 이미지</td>
			<td>주문상품</td>
			<td>주문가격</td>			
			<td>주문상태</td>
			<td>주문취소</td>
		</tr>
		<c:forEach var="item" items="${orderHistory }">
			<tr>			
			<td><a href="${pageContext.request.contextPath}/">${item.order_num }</a></td>
			<td>${item.order_date }</td>			
			<td><img width="133" height="139"
				class="link"  src="${contextPath}/resources/image/${item.fileName }"></td>
			<td><a href="${pageContext.request.contextPath}/">${item.product_title }</a></td>
			<td>${item.product_price }</td>
			<td><a href="${pageContext.request.contextPath}/">${item.delivery_state }</a></td>
			<td><button>주문취소</button></td>			
			</tr>
  		</c:forEach>
  	</table>
 </article> 	

	
