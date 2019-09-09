
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/WEB-INF/views/commons/meta.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/join.js"></script>
	<link href="${pageContext.request.contextPath}/resources/css/join.css" rel="stylesheet" type="text/css">
	<!-- <style type="text/css">
		form{
			margin: 0 auto;
			width: 250px;
		}
		li{
			line-height: 1.5;
		}
	</style> -->
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
	<form action="<c:url value="joinSuccess"/>" method="post" name="joinForm" onsubmit="return joinCheck()">
		<ul>
			<li>아이디<br><input type="text" name="memId" maxlength="10" size="20" autofocus/> <input type="button" value="중복확인" style="width: 75px;" onclick="idCheck(this.form.memId.value)"></li>
			<li>비밀번호<br><input type="password" name="memPw" maxlength="20" size="20" /></li>
			<li>비밀번호 확인<br><input type="password" name="memPwcon" size="20" /></li>
			<li>이름<br><input type="text" name="memName" size="20" /></li>
			<li>성별<br><input type="radio" name="memGender" value="M" checked>남 <input type="radio" name="memGender" value="F" >여</li>
			<li>생년월일<br><input type="text" name="memBirth" placeholder="ex) 19940101" maxlength="8" size="20" /></li>
			<li>휴대폰<br><input type="text" name="memPhone" placeholder="ex) 010xxxxxxxx" maxlength="11" size="20" /></li>
			<li>이메일<br><input type="email" name="memEmail" size="20" /> <input type="button" value="이메일인증" style="width: 75px;"></li>
			<li>우편번호<br><input type="text" name="memPostCode" id="sample2_postcode" maxlength="6" size="20"> <input type="button" value="주소검색" style="width: 75px;" onclick="sample2_execDaumPostcode()"></li>
			<li>도로명 주소<br><input type="text" name="memRoadName" id="sample2_address" size="20"></li>
			<li>상세 주소<br><input type="text" name="memDetail" id="sample2_detailAddress" size="20">
			
			<!-- http://postcode.map.daum.net/guide 가져옴(iframe을 이용하여 레이어 띄우기) -->
			<!-- iOS에서는 position:fixed 버그가 있음, 적용하는 사이트에 맞게 position:absolute 등을 이용하여 top,left값 조정 필요 -->
			<div id="layer" style="display:none;position:fixed;overflow:hidden;z-index:1;-webkit-overflow-scrolling:touch;">
				<img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnCloseLayer" style="cursor:pointer;position:absolute;right:-3px;top:-3px;z-index:1" onclick="closeDaumPostcode()" alt="닫기 버튼">
			</div>
			
			<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
			<script>
			    // 우편번호 찾기 화면을 넣을 element
			    var element_layer = document.getElementById('layer');
			
			    function closeDaumPostcode() {
			        // iframe을 넣은 element를 안보이게 한다.
			        element_layer.style.display = 'none';
			    }
			
			    function sample2_execDaumPostcode() {
			        new daum.Postcode({
			            oncomplete: function(data) {
			                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
			
			                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
			                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			                var addr = ''; // 주소 변수
			                var extraAddr = ''; // 참고항목 변수
			
			                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
			                    addr = data.roadAddress;
			                } else { // 사용자가 지번 주소를 선택했을 경우(J)
			                    addr = data.jibunAddress;
			                }
			                
			                // 우편번호와 주소 정보를 해당 필드에 넣는다.
			                document.getElementById('sample2_postcode').value = data.zonecode;
			                document.getElementById("sample2_address").value = addr;
			                // 커서를 상세주소 필드로 이동한다.
			                document.getElementById("sample2_detailAddress").focus();
			
			                // iframe을 넣은 element를 안보이게 한다.
			                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
			                element_layer.style.display = 'none';
			            },
			            width : '100%',
			            height : '100%',
			            maxSuggestItems : 5
			        }).embed(element_layer);
			
			        // iframe을 넣은 element를 보이게 한다.
			        element_layer.style.display = 'block';
			
			        // iframe을 넣은 element의 위치를 화면의 가운데로 이동시킨다.
			        initLayerPosition();
			    }
			
			    // 브라우저의 크기 변경에 따라 레이어를 가운데로 이동시키고자 하실때에는
			    // resize이벤트나, orientationchange이벤트를 이용하여 값이 변경될때마다 아래 함수를 실행 시켜 주시거나,
			    // 직접 element_layer의 top,left값을 수정해 주시면 됩니다.
			    function initLayerPosition(){
			        var width = 300; //우편번호서비스가 들어갈 element의 width
			        var height = 400; //우편번호서비스가 들어갈 element의 height
			        var borderWidth = 5; //샘플에서 사용하는 border의 두께
			
			        // 위에서 선언한 값들을 실제 element에 넣는다.
			        element_layer.style.width = width + 'px';
			        element_layer.style.height = height + 'px';
			        element_layer.style.border = borderWidth + 'px solid';
			        // 실행되는 순간의 화면 너비와 높이 값을 가져와서 중앙에 뜰 수 있도록 위치를 계산한다.
			        element_layer.style.left = (((window.innerWidth || document.documentElement.clientWidth) - width)/2 - borderWidth) + 'px';
			        element_layer.style.top = (((window.innerHeight || document.documentElement.clientHeight) - height)/2 - borderWidth) + 'px';
			    }
			</script></li>
			<li><br></li>
			<li><input type="reset" value="다시 작성" style="width: 100px; height: 30px;"> &nbsp; &nbsp;<input type="submit" value="회원가입" style="width: 100px; height: 30px;"></li>
		</ul>
	</form>

	<!-- footer -->
	<%@ include file="/WEB-INF/views/commons/footer.jsp"%>

</body>
</html>