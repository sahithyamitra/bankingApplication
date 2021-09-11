<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.model.Registration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome! <%= session.getAttribute("name") %></h1>
	<h2>The DETAILS ARE</h2>
	
	<a href="changePWD.jsp">Change password</a>
	<br>
	<a href="checkBalance.jsp">Check Balance</a>
	<br>
</body>
</html>