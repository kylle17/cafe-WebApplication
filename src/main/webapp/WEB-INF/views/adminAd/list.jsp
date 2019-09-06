<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

	
	<!--background-->
	<h3>광고 목록</h3><br><br>
	<table class="adminAd_table">
		<tr style="background:#EAEAEA" >
			<td>광고번호</td>
			<td>광고 이미지</td>
			<td>광고 제목</td>
			<td>파일명</td>			
			<td>수정</td>
			<td>삭제</td>
		</tr>
		<c:forEach var="item" items="${advertisementList }">
			<c:if test="${item.fileType ne 'mov' }">
			<tr>			
			<td>${item.advertisement_id }</a></td>
			<td><img width="200" height="130"
				class="link"  src="${contextPath}/resources/image/${item.fileName }"></td>
			<td>${item.fileType }</td>
			<td>${item.fileName }</td>
			<td><input type="button" value="수정" onclick="updatePopup()"></td>
			<td><input type="button" value="삭제" onclick="confirm('삭제할까요?')" ></td>			
			</tr>
			</c:if>
			<c:if test="${item.fileType eq 'mov' }">
			
			</c:if>
  		</c:forEach>
  	</table>


	

	
