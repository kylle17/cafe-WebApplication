
document.getElementsByClassName('adUpdate1').addEventListener('click', adUpdate_listener(event));
document.getElementsByClassName('adUpdate2').addEventListener('click', adUpdate_listener(event));
document.getElementsByClassName('adUpdate3').addEventListener('click', adUpdate_listener(event));
document.getElementsByClassName('adUpdate4').addEventListener('click', adUpdate_listener(event));
document.getElementsByClassName('adUpdate5').addEventListener('click', adUpdate_listener(event));





function adUpdate_listener(event){
    switch(event.srcElement.id){
        case 'adUpdate1':
            winOpen();
//            var ad_id = document.getElementsByClassName('ad_id');
//            win.document.getElementById('ad_id') = ad_id[0].value;
            break;
        case 'adUpdate2':
            winOpen();
            break;
        case 'adUpdate3':
            winOpen();
            break;
        case 'adUpdate4':
            winOpen();
            break;
        case 'adUpdate5':
            winOpen();
            break;
            
    }
}

function winOpen(){
	var popupW = 550;
	var popupH = 450;
	var left = Math.ceil((window.screen.width - popupW)/2);
	var top = Math.ceil((window.screen.height - popupH)/2);
	win = window.open('update', 'update','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no');
}




function setUpdate(){
	win.document.getElementById('cancel').addEventListener('click',function(){
		win.close();
	})
}	
