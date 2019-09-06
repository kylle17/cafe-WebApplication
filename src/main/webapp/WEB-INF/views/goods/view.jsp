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
	<script src="/resources/jquery/jquery-3.3.1.min.js"></script>
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
	<form role="form" method="post">
 <input type="hidden" name="gdsNum" value="${view.gdsNum}" />
</form>

<div class="goods">
 <div class="goodsImg">
  <img src="${contextPath}/resources/image/${view.gdsImg}">
 </div>
 
 <div class="goodsInfo">
  <p class="gdsName"><span>상품명 : </span>${view.gdsName}</p>
  
  <p class="gdsPrice">
   <span>가격 : </span><fmt:formatNumber pattern="###,###,###" value="${view.gdsPrice}" /> 원
  </p>
  
  
   <p class="cartStock">
 <span>구입 수량</span>
 <button type="button" class="plus">+</button>
 <input type="number" class="numBox" min="1" max="${view.gdsStock}" value="1" readonly="readonly"/>
 <button type="button" class="minus">-</button>
 
 <script>
  $(".plus").click(function(){
   var num = $(".numBox").val();
   var plusNum = Number(num) + 1;
   
   if(plusNum >= ${view.gdsStock}) {
    $(".numBox").val(num);
   } else {
    $(".numBox").val(plusNum);          
   }
  });
  
  $(".minus").click(function(){
   var num = $(".numBox").val();
   var minusNum = Number(num) - 1;
   
   if(minusNum <= 0) {
    $(".numBox").val(num);
   } else {
    $(".numBox").val(minusNum);          
   }
  });
 </script> 
  </p>
  

 <div class="gdsDes">${view.gdsDes}</div>
</div>
	  <p class="addToCart">
   <button type="button">카트에 담기</button>
  </p>
 
 </div>
 <br><br>
 <input type="button" value="목록" 
                    onClick="window.location='list'">	
	
	
		<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>