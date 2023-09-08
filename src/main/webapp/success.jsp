
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.tech.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function addData() {

		document.newcustomer.action = "registration.jsp";
		document.newcustomer.submit();

	}

	function deleteData() {

		document.newcustomer.action = "delete";
		document.newcustomer.submit();
	}

	function updateData() {
		
		document.newcustomer.action="edit";
		document.newcustomer.submit();

	}
</script>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body style="background: #EAFAF1 ">
	<form name="newcustomer">
		<table border="2"
			style="margin: auto; margin-top: 10%; width: 70%; text-align: center; background-color: 
			#FDEBD0;">
			<tr style="height: 35px; background-color: #85C1E9;font-size: larger;">
				<td></td>
				<td>Customer Id</td>
				<td>Customer Name</td>
				<td>Customer Address</td>
				<td>Customer Mobile</td>
				<td>UserName</td>
				<td>Password</td>

			</tr>


			<c:forEach items="${data}" var="cs">
				<tr style="height: 35px; background-color:#A3E4D7 ;font-size: large;">
					<td><input type="radio" name="rd" value="${cs.c_Id }"></td>
					<td><c:out value="${cs.c_Id }"></c:out></td>
					<td><c:out value="${cs.c_Name}"></c:out></td>
					<td><c:out value="${cs.c_Address}"></c:out></td>
					<td><c:out value="${cs.c_MobileNo}"></c:out></td>
					<td><c:out value="${cs.user_Name}"></c:out></td>
					<td><c:out value="${cs.password}"></c:out></td>
				</tr>
			</c:forEach>

			<tr style="height: 35px; background-color: #D5F5E3">
				<td ><input type="button" value="Add" onclick="addData()" style="background-color: #5DADE2;color: white;font-weight: bold;"></td>
				<td><input type="button" value="Delete" onclick="deleteData()"></td>
				<td><input type="button" value="Update" onclick="updateData()"></td>
			</tr>


		</table>
	</form>
</body>
</html>