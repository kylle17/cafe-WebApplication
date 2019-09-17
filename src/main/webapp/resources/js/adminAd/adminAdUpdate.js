opener.setUpdate();




document.getElementById('confirm').addEventListener('click',function(){
	opener.location.reload();
//	close();
})

document.getElementById('cancel').addEventListener('click',function(){
	close();
})