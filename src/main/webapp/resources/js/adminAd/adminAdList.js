
ad1 = document.getElementById('adUpdate1');
ad2 = document.getElementById('adUpdate2');
ad3 = document.getElementById('adUpdate3');
ad4 = document.getElementById('adUpdate4');
ad5 = document.getElementById('adUpdate5');
ad6 = document.getElementById('adUpdate6');


var list_ad_id = document.getElementsByClassName('ad_id');
var list_ad_type = document.getElementsByClassName('ad_type');
var list_file_name = document.getElementsByClassName('file_name');

var selected_ad_id;
var selected_ad_type;
var selected_file_name;



function adUpdate_listener(event){
    switch(event.target.id){
        case 'adUpdate1':
            winOpen();
            selected_ad_id = list_ad_id[0].value;
            selected_ad_type = list_ad_type[0].value;
            selected_file_name = list_file_name[0].value;
            break;
        case 'adUpdate2':
            winOpen();
            selected_ad_id = list_ad_id[1].value;
            selected_ad_type = list_ad_type[1].value;
            selected_file_name = list_file_name[1].value;
            break;
        case 'adUpdate3':
            winOpen();
            selected_ad_id = list_ad_id[2].value;
            selected_ad_type = list_ad_type[2].value;
            selected_file_name = list_file_name[2].value;
            break;
        case 'adUpdate4':
            winOpen();
            selected_ad_id = list_ad_id[3].value;
            selected_ad_type = list_ad_type[3].value;
            selected_file_name = list_file_name[3].value;
            break;
        case 'adUpdate5':
            winOpen();
            selected_ad_id = list_ad_id[4].value;
            selected_ad_type = list_ad_type[4].value;
            selected_file_name = list_file_name[4].value;
            break;
        case 'adUpdate6':
            winOpen();
            selected_ad_id = list_ad_id[5].value;
            selected_ad_type = list_ad_type[5].value;
            selected_file_name = list_file_name[5].value;
            break;
            
    }
}



ad1.addEventListener('click', adUpdate_listener);
ad2.addEventListener('click', adUpdate_listener);
ad3.addEventListener('click', adUpdate_listener);
ad4.addEventListener('click', adUpdate_listener);
ad5.addEventListener('click', adUpdate_listener);
ad6.addEventListener('click', adUpdate_listener);




function winOpen(){
	var popupW = 550;
	var popupH = 450;
	var left = Math.ceil((window.screen.width - popupW)/2);
	var top = Math.ceil((window.screen.height - popupH)/2);
	win = window.open('update', 'update','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no');
}




function setUpdate(){
	win.document.getElementById('ad_id').value = selected_ad_id;
	win.document.getElementById('ad_type').value = selected_ad_type;
	win.document.getElementById('file_name').value = selected_file_name;
}	
