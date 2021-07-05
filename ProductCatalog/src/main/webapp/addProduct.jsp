<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Add new Product
	</h1>
	
	<form action="./addProduct" method="post">
		<table>
			<tr>
				<td>Pid</td>
				<td><input type="text" name="pid"></td>
			</tr>
			<tr>
				<td>Pname</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Pcost</td>
				<td><input type="text" name="pcost"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>

		</table>
	</form>
</body>
</html>