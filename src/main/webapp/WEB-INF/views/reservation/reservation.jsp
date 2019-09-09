<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- datepicker file import -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>  
<title>예약 페이지 </title>
<script>
$(document).ready(function(){
	        $.datepicker.regional['ko'] = {
			 changeMonth: false, 
	         dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
	         dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
	         monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
	         monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	    	  dateFormat: "yy-mm-dd",
	    	  minDate:1,
              maxDate:31,
          };
	 $.datepicker.setDefaults($.datepicker.regional['ko']);
	var currentDate = new Date();
	
    $('#checkin_date').datepicker(); 
    $("#checkout_date").datepicker( "option", "minDate", 31 );  
    $('#checkin_date').datepicker("option", "onClose", function ( selectedDate ) {
        $("#checkout_date").datepicker( "option", "minDate", selectedDate );
    });
	$( "#checkin_date" ).datepicker( "setDate", currentDate);  
    $('#checkout_date').datepicker(); 
    $('#checkout_date').datepicker("option", "minDate", $("#checkin_date").val());
    $('#checkout_date').datepicker("option", "onClose", function ( selectedDate ) {
        $("#checkin_date").datepicker( "option", "maxDate", selectedDate );
    });
	$( "#checkout_date" ).datepicker( "setDate", currentDate); 
	
});

</script>

</head>
<body>
<!-- header --> 
<!-- background -->
	
<h1>예약 주문 </h1>
 <p>체크인 </p><input type="text" name="checkin" id="checkin_date" readonly="readonly">
  <p>체크아웃 </p><input type="text" name="checkout" id="checkout_date" readonly="readonly">
<!-- footer -->
</body>
</html>