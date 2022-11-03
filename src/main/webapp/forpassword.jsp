<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
background-image: url("images/forgotpassword.webp");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}

</style>
</head>
<body>
<center>
<h1 style="color: white">Give Correct details then you can Change  your password </h1>

<form action="pass" method="post">
Name:<input type="text" name="name"placeholder="Enter your Name" required="required"> <br> <br>
Phone number:<input type="number" name="phoneno" placeholder="Enter your phone number" required="required"> <br><br>
<input type="submit" value="login">
</form>

</center>
</body>
</html>