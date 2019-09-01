/*회원가입할 때 필요한 script*/
function joinCheck(){
	if(document.joinForm.memPw.value != document.joinForm.memPwcon.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.joinForm.memPwcon.focus();
		return false;
	}
	
	var email = document.joinForm.memEmail.value;
	var repExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	if(!repExp.test(email)) {
		alert("이메일 형식이 맞지 않습니다.");
		document.joinForm.memEmail.focus();
		return false;
	}
}