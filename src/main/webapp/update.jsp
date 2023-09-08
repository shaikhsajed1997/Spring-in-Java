<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
<form action="reg" style="text-align: center;">

<h2>
	
	Customer Id: 			   <input type="hidden" name="c_Id" value="${data.c_Id }">
	
	Customer Name:			   <input type="text" name="c_Name" value="${data.c_Name }">
	
	Customer Address:		   <input type="text" name="c_Address" value="${data.c_Address }">
	
	Customer Mobile Number:            <input type="text" name="c_MobileNo" value="${data.c_MobileNo }">
	
	User Name:			   <input type="text" name="user_Name" value="${data.user_Name }">
	
	Password: 			   <input type="text" name="password" value="${data.password }">
	
	</h2>
	<input type="submit" value="Registration">




</form>
</pre>
</body>
</html>