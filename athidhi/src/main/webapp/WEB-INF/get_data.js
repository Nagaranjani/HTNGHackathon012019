function loadDoc() {
 var xhttp;
 if (window.XMLHttpRequest) {
   // code for modern browsers
   xhttp = new XMLHttpRequest();
   } else {
   // code for IE6, IE5
   xhttp = new ActiveXObject("Microsoft.XMLHTTP");
 }
 xhttp.onreadystatechange = function() {
   if (this.readyState == 4 && this.status == 200) {
     document.getElementById("customername").innerHTML = this.responseText;
   }
 };
 xhttp.open("GET", "http://localhost:8080/athidhi/webapi/myresource", true);
 xhttp.send();
}

function myFunction(e) {
    alert("Test");
}

$(document).ready(function(){
	   $('input').bind("enterKey",function(e){
	     alert("Enter key pressed");
	   });
	   $('input').keyup(function(e){
	     if(e.keyCode == 13)
	     {
	        $(this).trigger("enterKey");
	     }
	   });
	});