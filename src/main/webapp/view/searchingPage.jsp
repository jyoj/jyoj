<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<input type="text" id="searchText">
<button onclick="searchData()">search</button>
</body>
</html>
<script>
function searchData(){
	var searchText=$("#searchText").val();
	$.ajax({
		url:"searchDataById",
		type:"post",
		data:{searchText:searchText},
	success:function(data){
		alert(data);
	}
	});
}
</script>
