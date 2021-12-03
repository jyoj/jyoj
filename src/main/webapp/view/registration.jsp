<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input type="text" id="userFirstName"placeholder="FirstName">
<br>
<input type="text" id="userSurname"placeholder="SurName">

<input type="text" id="userPinCode"placeholder="PinCode">
<br>
<input type="date" id="userJoinDate"placeholder="JoinDate">

<input type="date" id="userDob"placeholder="Dob">
<br>
<input type="button"  onclick="saveFormDataByAjex()" value="registerForm"/> 


</body>
</html>
<script>
function saveFormDataByAjex(){
	alert("hello");
	var name=$("#userFirstName").val();
	var sn=$("#userSurname").val();
	var pincode=$("#userPinCode").val();
	var userJoinDate=$("#userJoinDate").val();
	var userDob=$("#userDob").val();
	$.ajax({
		url:"saveDataById",
	type:"post",
	data:{userFirstName:name,userSurname:sn,userPinCode:pincode,userDob:userDob,userJoinDate:userJoinDate},
	success:function(data){
		alert(data);
	}
	});
}
</script>
