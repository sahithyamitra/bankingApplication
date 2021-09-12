<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance</title>
</head>
<body>
	<h1>Balance</h1>
	<form method="post" action="checkBalance">
	<h2>
		<label>Enter account number:</label>
		<input type="number" name="ACCOUNTNUMBER">
		<br><br>
		<input type="submit" value="SUBMIT">
		<input type="reset" value="RESET">
	</h2>
	</form>
</body>
</html>