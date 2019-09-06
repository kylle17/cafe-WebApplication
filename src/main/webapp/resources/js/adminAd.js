function nextPage(pageNo) {
	if (title !== undefined || title !== "") { // title이 있을 경우
		window.location = url + "?pageNo=" + encodeURIComponent(pageNo)
				+ "&title=" + encodeURIComponent(title);
	} else { // title이 없을 경우
		window.location = url + "?pageNo=" + encodeURIComponent(pageNo);
	}
}


function updatePopup(){
	  var popupW = 750;
	  var popupH = 650;
	  var left = Math.ceil((window.screen.width - popupW)/2);
	  var top = Math.ceil((window.screen.height - popupH)/2);
	  window.open('update','','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no')   
}