<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.model.Registration" %>
<!DOCTYPE html>
<html>
<head>    
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
	label{
text-align: center;
margin-left: 100px;
font-size:20px;
	}
	.links{
	font-size:20px;
		 position: absolute;
  right: 90px;
  width: 200px;
  height: 120px;	
	}
</style>
</head>
<body>
	<h1>Welcome! <%= session.getAttribute("name") %></h1>
	<h2>The DETAILS ARE</h2>
	<div class="links">
		<a href="changePWD.jsp">Change password</a>
		<br>
		<a href="checkBalance.jsp">Check Balance</a>
		<br>
		<a href="moneyTransfer.jsp">Money Transfer</a>
	</div>
	<div>
	<label>Mobile: <%= session.getAttribute("mobile") %></label><br>
	<label>Email: <%= session.getAttribute("email")%></label><br>
	<label>DOB: <%= session.getAttribute("dob")%></label><br>
	<label>Pan Number: <%= session.getAttribute("pan")%></label><br>
	<label>Aadhar Number: <%= session.getAttribute("aadhar")%></label><br>
	<label>Account Number: <%= session.getAttribute("accountnum")%></label><br>
	<label>Customer Id: <%= session.getAttribute("customerid")%></label><br>
	<label>Address: <%= session.getAttribute("address")%></label><br>
	</div>
</body>
</html>