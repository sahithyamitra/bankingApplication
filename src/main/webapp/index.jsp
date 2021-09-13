<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
input {
	width: 20%;
	outline-style: double;
}

.bank {
	font-size: 30px;
	color: #B71C1C;
}

body {
	background-image: url("piggy2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

h1, h2 {
	margin-left: 100px;
	text-align: center;
}

#sub {
	color: aliceblue;
	background-color: #0d6efd;
}

a {
	margin-left: 800px;
}
</style>
</head>
<body>
	<h1>The Bank</h1>
	<h2>New User Registration</h2>
	<label style="font-size: 28px;"><strong>Personal
			Information</strong></label>
	<label><a href="Login.jsp" style="margin-left: 1000px">Login
			instead?</a></label>
	<hr>
	<form method="post" action="postDetails">
		<label for="FIRSTNAME" style="margin-left: 100px;"><strong>First
				Name<strong></label> <label for="MIDDLENAME"
			style="margin-left: 420px;"><strong>Middle Name</strong></label> <label
			for="LASTNAME" style="margin-left: 420px;"><strong>Last
				Name</strong></label> <br> <input type="text" id="FIRSTNAME" name="FIRSTNAME"
			style="margin-left: 20px;"> <input type="text"
			id="MIDDLENAME" name="MIDDLENAME" style="margin-left: 150px">
		<input type="text" id="LASTNAME" name="lASTNAME"
			style="margin-left: 200px"> <br>
		<br> <label for="MOBILE" style="margin-left: 100px;">Registered
			Mobile Number</label> <label for="EMAIL" style="margin-left: 310px;">Valid
			email-id</label> <label for="DOB" style="margin-left: 420px;">Date of
			birth</label> <br> <input type="number" id="MOBILE" name="MOBILE"
			style="margin-left: 20px" title="Must be 10digits." /> <input
			type="email" id="EMAIL" name="EMAIL" style="margin-left: 150px"
			title="Must be of xyz@email.com format." /> <input type="text"
			id="DOB" name="DOB" style="margin-left: 200px"> <label
			style="margin-left: 1030px">[please enter in 09-jan-1000]</label> <br>
		<br> <br> <label style="font-size: 28px;"><strong>Bank
				Details</strong></label>
		<hr>
		<label id="PAN" style="margin-left: 100px">Pan Number</label> 
		<label for="ACCOUNTNUM" style="margin-left: 420px">Account Number</label>
		<label for="CUSTOMERID" style="margin-left: 420px">Customer Id</label>
		<input type="text" id="PAN" name="PANCARD" style="margin-left: 20px">
		<input type="number" id="ACCOUNTNUM" name="ACCOUNTNUM" style="margin-left: 150px" readonly>
		<input type="text" id="CUSTOMERID" name="CUSTOMERID" style="margin-left: 200px" readonly>
		<br>
		<br> <label id="AADHAR" style="margin-left: 100px">Aadhar
			Number</label> <br> <input type="number" id="AADHAR" name="AADHAR"
			style="margin-left: 20px"> <br> <br> <label
			style="font-size: 28px;"><strong>Address</strong></label>
		<hr>
		<label id="DOORNO" style="margin-left: 100px">House Number</label> <label
			for="HOUSENAME" style="margin-left: 360px">House Name</label> <label
			for="STREET" style="margin-left: 420px">Street</label> <br> <input
			type="number" id="DOORNO" name="DOORNO" style="margin-left: 20px">
		<input type="text" id="HOUSENAME" name="HOUSENAME"
			style="margin-left: 150px"> <input type="text" id="STREET"
			name="STREET" style="margin-left: 200px"> <br>
		<br> <label for="AREA" style="margin-left: 100px">Area</label> <label
			for="DISTRICT" style="margin-left: 450px">District</label> <label
			for="CITY" style="margin-left: 440px">City</label> <br> <input
			type="text" id="AREA" name="AREA" style="margin-left: 20px">
		<input type="text" id="DISTRICT" name="DISTRICT"
			style="margin-left: 150px"> <input type="text" id="CITY"
			name="CITY" style="margin-left: 200px"> <br>
		<br> <label for="COUNTRY" style="margin-left: 100px">Country</label>
		<br> <input type="text" id="COUNTRY" name="COUNTRY"
			style="margin-left: 20px"> <br>
		<br> <label style="font-size: 28px;"><strong>Password</strong></label>
		<hr>
		<label for="PWD" style="margin-left: 100px">PassWord</label> <label
			for="CONFIRMPWD" style="margin-left: 360px">Confirm Password</label> <br>
		<input type="password" id="PWD" name="PWD" style="margin-left: 20px"
			title="Minimum 8digits,it has to include one capital letter,one smal letter,one special symbol and one number atleast." />
		<input type="password" id="CONFIRMPWD" name="CONFIRMPWD"
			style="margin-left: 150px" title="Must be same as Password." /> <br>
		<br> 
		<hr>
		<input type="submit" id="sub" value="SUBMIT"
			style="margin-left: 100px" onclick="error()" /> <input type="reset"
			id="sub" value="RESET" style="margin-left: 150px">
	</form>
	<script type="text/javascript">
		function customerID() {

			return Math.floor((Math.random() * 1000) + 1);
		}
		function accountNum() {

			return Math.floor((Math.random() * 1000000) + 1);
		}
		document.getElementById('CUSTOMERID').value = customerID();
		document.getElementById('ACCOUNTNUM').value = accountNum();
	</script>
</body>
</html>