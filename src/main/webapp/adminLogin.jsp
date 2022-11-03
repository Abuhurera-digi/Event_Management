 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
background-image: url("images/adminimage.jpg");
}

</style>
</head>
<body>
<center>
<h1>Admin login</h1>
<fieldset style="width: 600px">

<form action="adminlogin" method="post">

 <c:if test="${not empty error}">
  <h4>${error}</h4>
  </c:if>
 Admin Name:<input type="text" name="name" placeholder="Enter your admin_name" required="required"> <br><br>

 Password<input type="password" name="password" placeholder="Enter your Password" required="required"> <br> <br>
<input type="submit" value="Login"> <br> <br>
</form>
<%-- 
 <form action="admincreate">
<input type="submit" value="Create New Account">
</form>
--%>


</fieldset>


</center>
</body>
</html>