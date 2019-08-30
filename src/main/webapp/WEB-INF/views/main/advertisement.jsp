<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 기본 경로를 변수로 만든 것  -->
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>  


<div class="main_book">
   <c:set  var="advertisement_count" value="0" />
	<h3>베스트셀러</h3>
	<c:forEach var="item" items="${advertisementList }">
	   <c:set  var="goods_count" value="${advertisement_count+1 }" />
		<div class="book">
			<img class="link"  src="${contextPath}/resources/image/${item.fileName}"> 
			
				
		</div>
	   <c:if test="${advertisement_count==15   }">
         <div class="book">
           <font size=20> <a href="#">more</a></font>
         </div>
     </c:if>
  </c:forEach>
  </div>
 