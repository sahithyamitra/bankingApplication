<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Money Transfer</title>
</head>
<body>
		<h1><Strong>Money Transfer</Strong></h1>
		<form method="post" action="Transfer">
		<h2>
		<label>Enter the accountNumber from which you want to transfer amount:</label>
		<input type="number" name="FAccountNumber"><br>
		<label>Enter the accountNumber you want to transfer Money:</label>
		<input type="number" name="TAccountNumber"><br>
		<label>Enter the Amount you want to transfer to Account:</label>
		<input type="number" name="Amount"><br>
		<input type="submit" value="SUBMIT">
		<input type="reset"  value="RESET">
		</h2>
		</form>
</body>
</html>