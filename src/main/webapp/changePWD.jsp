<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>change Password</title>
<style>
	body{
		background-image: url("C:\\Users\\User\\Downloads\\pwd.jpg");
		height: 600px;
		background-repeat: no-repeat;
		background-size: contain;
	}
</style>
</head>
<body>
	<h1>Change Password</h1>
	<br>
	<form method="post" action="chPassword">
	<h2>
		<label>Current Password:</label>
		<input type="password" name="pwd" style="margin-left: 100px;"><br>
		<br>
		<label>New Password:</label>
		<input type="password" name="newPwd" style="margin-left: 137px;"><br>
		<br>
		<label>Confirm New Password:</label>
		<input type="password" name="confirmPwd" style="margin-left: 43px;"><br>
		<br>
		<input type="submit" value="SUBMIT">
		<input type="reset" value="RESET">
	</h2>
	</form>
</body>
</html>