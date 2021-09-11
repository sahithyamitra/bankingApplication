<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
		input{
			width: 20%;
			outline-style: double;
		}
		.bank{
			font-size:30px;
			color:#B71C1C;
		}
		body
		{
			background-image: url("piggy2.jpg");
			background-repeat: no-repeat;
			background-size: cover;
		}
		h1,h2{
			margin-left: 100px;
			text-align: center;
		}
		#sub{
			color: aliceblue;
			background-color: #0d6efd;
		}
		a{
			margin-left: 800px;
		}
	</style>
</head>
<body>
	<h1>The Bank</h1>
	<h2>New User Registration</h2>
	<label style="font-size: 28px;"><strong>Personal Information</strong></label>
	<label><a href="Login.jsp" style="margin-left:1000px">Login instead?</a></label>
	<hr>
	<form method="post" action="postDetails">
		<label id="FIRSTNAME" style="margin-left: 100px;"><strong>First Name<strong></label>
		<label id="MIDDLENAME" style="margin-left: 420px;"><strong>Middle Name</strong></label>
		<label id="LASTNAME" style="margin-left: 420px;"><strong>Last Name</strong></label>
		<br>
		<input type="text" id="FIRSTNAME" name="FIRSTNAME" style="margin-left: 20px;">
		<input type="text" id="MIDDLENAME" name="MIDDLENAME" style="margin-left: 150px">
		<input type="text" id="LASTNAME" name="lASTNAME" style="margin-left: 200px">
		<br><br>
		<label id="MOBILE" style="margin-left: 100px;">Registered Mobile Number</label>
		<label id="EMAIL" style="margin-left: 310px;">Valid email-id</label>
		<label id="DOB" style="margin-left: 420px;">Date of birth</label>
		<br>
		<input type="number" id="MOBILE" name="MOBILE" style="margin-left: 20px">
		<input type="email" id="EMAIL" name="EMAIL" style="margin-left: 150px">
		<input type="text" id="DOB" name="DOB" style="margin-left: 200px">
		<label style="margin-left:1030px">[please enter in 09-jan-1000]</label>
		<br><br>
		<br>
		<label style="font-size: 28px;"><strong>Bank Details</strong></label>
		<hr>
		<label id="PAN" style="margin-left:100px">Pan Number</label>
		<label id="ACCOUNTNUM" style="margin-left:310px">Account Number</label>
		<label id="CUSTOMERID" style="margin-left:420px">Customer Id</label>
		<br>
		<input type="text" id="PAN" name="PANCARD" style="margin-left: 20px">
		<input type="number" id="ACCOUNTNUM" name="ACCOUNTNUM" style="margin-left: 150px">
		<input type="text" id="CUSTOMERID" name="CUSTOMERID" style="margin-left: 200px">
		<br><br>
		<label id="AADHAR" style="margin-left:100px">Aadhar Number</label>
		<br>
		<input type="number" id="AADHAR" name="AADHAR" style="margin-left: 20px">
		<br>
		<br>
		<label style="font-size: 28px;"><strong>Address</strong></label>
		<hr>
		<label id="DOORNO" style="margin-left:100px">House Number</label>
		<label id="HOUSENAME" style="margin-left:360px">House Name</label>
		<label id="STREET" style="margin-left:420px">Street</label>
		<br>
		<input type="number" id="DOORNO" name="DOORNO" style="margin-left: 20px">
		<input type="text" id="HOUSENAME" name="HOUSENAME" style="margin-left: 150px">
		<input type="text" id="STREET" name="STREET" style="margin-left: 200px">
		<br><br>
		<label id="AREA" style="margin-left:100px">Area</label>
		<label id="DISTRICT" style="margin-left:450px">District</label>
		<label id="CITY" style="margin-left:440px">City</label>
		<br>
		<input type="text" id="AREA" name="AREA" style="margin-left: 20px">
		<input type="text" id="DISTRICT" name="DISTRICT" style="margin-left: 150px">
		<input type="text" id="CITY" name="CITY" style="margin-left: 200px">
		<br><br>
		<label id="COUNTRY" style="margin-left:100px">Country</label>
		<br>
		<input type="text" id="COUNTRY" name="COUNTRY" style="margin-left: 20px">
		<br><br>
		<label style="font-size: 28px;"><strong>Password</strong></label>
		<hr>
		<label id="PWD" style="margin-left:100px">PassWord</label>
		<label id="CONFIRMPWD" style="margin-left:360px">Confirm Password</label>
		<br>
		<input type="password" id="PWD" name="PWD" style="margin-left: 20px">
		<input type="password" id="CONFIRMPWD" name="CONFIRMPWD" style="margin-left: 150px">
		<br><br>
		<hr>
		<input type="submit" id="sub" value="SUBMIT" style="margin-left: 100px">
		<input type="reset" id="sub" value="RESET" style="margin-left: 150px">
	</form>
</body>
</html>