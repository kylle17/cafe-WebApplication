    var adUpdate = document.getElementById('adUpdate');                             
    adUpdate.addEventListener('click', function(){   
		var popupW = 750;
		var popupH = 650;
		var left = Math.ceil((window.screen.width - popupW)/2);
		var top = Math.ceil((window.screen.height - popupH)/2);
		var win = window.open('update', 'update','width='+popupW+',height='+popupH+',left='+left+',top='+top+',scrollbars=yes,resizable=no,toolbar=no,titlebar=no,menubar=no,location=no');
		var ad_id = win.document.getElementById('ad_id');
		ad_id.value = document.getElementById('ad_id').value;
    })
