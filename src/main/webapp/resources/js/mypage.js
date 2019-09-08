/*회원가입할 때 필요한 script*/
function mypageCheck(){
	var memPw = document.mypageUpdate.memPw.value;
	var memPwRepExp = /^[0-9a-z]{4,20}$/i; //비밀번호 정규식(소문자, 숫자 총 4~20자)
	if(memPw == ""){
		alert("비밀번호를 입력하시오.");
		document.mypageUpdate.memPw.focus();
		return false;
	}
	
	if(!memPwRepExp.test(memPw)){
    	alert("소문자와 숫자로 이루어진 4~20자리의 비밀번호를 입력하시오.");
		document.mypageUpdate.memPw.focus();
		return false;
    }
	
	var memPhone = document.mypageUpdate.memPhone.value;
	var memPhoneRepExp = /^(010)([0-9]{4})([0-9]{4})$/i;
	if(!memPhoneRepExp.test(memPhone)){
		alert("010으로 시작하는 휴대폰번호를 입력하시오.");
		document.mypageUpdate.memPhone.focus();
		return false;
	}
	
	var email = document.mypageUpdate.memEmail.value;
	var repExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	if(!repExp.test(email)) {
		alert("이메일 형식이 맞지 않습니다.");
		document.mypageUpdate.memEmail.focus();
		return false;
	}
}