<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Hello , ${loginuser.fullName }</h1>
	<a href="logout">Logout</a>
	<a href="home">Home</a>
	
</body>
</html>