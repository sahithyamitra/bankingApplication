<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
h1{
color: rgb(200,10,10);
background-color: lightgray;
text-align: center;
height:200px;
line-height:200px;
margin-left: 100px;
magin-right:100px;
margin-top: 100px;
}
form {
padding: 25px;
height: 350px;
text-align: center;
margin-left: 100px;
background-color: skyblue;
margin-right: 100px;
}
label{
	font-size: 20px;
	font-style: serif;
}
input{
	margin-top: 10px;
	margin-bottom: 10px;
	width: 500px;
	height: 30px;
}

</style>
</head>
<body>
	<h1><strong>LOGIN</strong></h1>
	<form method="post" action="getCustomer">
	<h2>
	<label id="cid">CUSTOMER ID</label><br>
	<input type="text" id="cid" name="CUSTOMERID"><br>
	<label id="pwd">PASSWORD</label><br>
	<input type="password" id="pwd" name="PWD"><br>
	<br>
	<a href="password.html" style="color:darkblue">Forgot password</a>
	<hr>
	<input type="submit" value="LOGIN">
	<input type="reset" value="RESET">
	</h2>
	</form>
</body>
</html>