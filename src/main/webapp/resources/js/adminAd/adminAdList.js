var adUpdate = document.getElementsByClassName('adUpdate');            
var ad_id = document.getElementsByClassName('ad_id')

for(var i=0; i < adUpdate.length; i++){
	adUpdate[i].addEventListener('click', function(){ 
		var popupW = 550;
		var popupH = 450;
		var left = Math.ceil((window.screen.width - popupW)/2);
		var top = Math.ceil((window.screen.height - popupH)/2);
		win = window.open('update', 'update','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no');
	})
}




function setUpdate(){
	win.document.getElementById('cancel').addEventListener('click',function(){
		win.close();
	})
}	
