/*회원가입할 때 필요한 script*/
function joinCheck(){
	//아이디
	if(document.joinForm.memId.value == ""){
        alert("아이디를 입력해주세요.");
        document.joinForm.memId.focus();
        return false;
    }
	
	//비밀번호
	var memPw = document.joinForm.memPw.value;
	var memPwcon = document.joinForm.memPwcon.value;
	var memPwRepExp = /^[0-9a-z]{4,20}$/i; //비밀번호 정규식(소문자, 숫자 총 4~20자)
	if(memPw == ""){
		alert("비밀번호를 입력하시오.");
		document.joinForm.memPw.focus();
		return false;
	}
	
	if(!memPwRepExp.test(memPw)){
    	alert("소문자와 숫자로 이루어진 4~20자리의 비밀번호를 입력하시오.");
		document.joinForm.memPw.focus();
		return false;
    }
	
	//비밀번호 확인
	if(memPw != memPwcon){
		alert("비밀번호가 일치하지 않습니다.");
		document.joinForm.memPwcon.focus();
		return false;
	}
	
	//이름
	if(document.joinForm.memName.value == ""){
        alert("이름을 입력해주세요.");
        document.joinForm.memName.focus();
        return false;
    }
	
	//생년월일
	if(document.joinForm.memBirth.value == ""){
        alert("생년월일을 입력해주세요.");
        document.joinForm.memBirth.focus();
        return false;
    }
	
	//휴대폰
	var memPhone = document.joinForm.memPhone.value;
	var memPhoneRepExp = /^(010)([0-9]{4})([0-9]{4})$/i;
	if(memPhone == ""){
		alert("휴대폰번호를 입력하시오.");
		document.joinForm.memPhone.focus();
		return false;
	}
	if(!memPhoneRepExp.test(memPhone)){
		alert("010으로 시작하는 11자리의 휴대폰번호를 입력하시오.");
		document.joinForm.memPhone.focus();
		return false;
	}
	
	//이메일
	var email = document.joinForm.memEmail.value;
	var repExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	
	if(email == "") {
		alert("이메일을 입력하시오.");
		document.joinForm.memEmail.focus();
		return false;
	}
	
	if(!repExp.test(email)) {
		alert("이메일 형식이 맞지 않습니다.");
		document.joinForm.memEmail.focus();
		return false;
	}
}

function idCheck(memId){
	var memIdRepExp = /^[a-z]{1}[0-9a-z]{3,9}$/i; //아이디 정규식(첫글자는 무조건 영어 소문자)

    if(memId == ""){
        alert("아이디를 입력해주세요.");
        document.joinForm.memId.focus();
    }
    else if(!memIdRepExp.test(memId)){
    	alert("첫 글자는 영문 소문자로 시작하며, 소문자와 숫자로 이루어진 4~10자리의 아이디를 입력하시오.");
		document.joinForm.memId.focus();
    }
    else{
        var popWidth = 300;
        var popHeight = 200;
        var winHeight = document.body.clientHeight;    // 현재창의 높이
        var winWidth = document.body.clientWidth;    // 현재창의 너비
        var winX = window.screenLeft;    // 현재창의 x좌표
        var winY = window.screenTop;    // 현재창의 y좌표
        var popX = winX + (winWidth - popWidth)/2;
        var popY = winY + (winHeight - popHeight)/2;
        url="idCheck?memId="+memId;
        window.open(url, "post", 
                "left="+popX+",top="+popY+",width="+popWidth+", height="+popHeight);
    }
}