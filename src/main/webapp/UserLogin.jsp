<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body{
background-image: url("images/login-back-image.jpg");
background-repeat: no-repeat;
background-size: 100%;
height: 100%;
}
</style>
</head>
<body>
  <center>
   <h2>User</h2>
  <form action="login" method="post">
  Phone Number:<input type="text" name="phoneno" placeholder="Enter your Phone number"> <br> <br>
   Password:  <input type="password" name="password" placeholder="Enter your password"> <br> <br>
  <input type="submit" value="login"> <br> <br>
  <a href="forpassword.jsp">Forgot Password</a>
  </form>
   <form action="Create">
  <input type="submit" value="Create New Account">
 </form>  
 </center>
  
</body>
</html>