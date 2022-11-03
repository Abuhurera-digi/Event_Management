<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>user List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
 
</head>
<body>
<h1></h1>
<form action="changepassword1">
<!-- New password:<input type="password" name="password" placeholder="Enter your new password"> <br><br>
<input type="submit" value="submit "> -->

<center>
<h1>See Your Password</h1>

<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>

<th >Name</th>






<th>Phoneno</th>
<th>password</th>







</tr>
</thead>
<tbody>






  <tr>
    <td>${user1.name}</td>
     <td>${user1.phoneno}</td>
      <td>${user1.password}</td>
    </tr>
     







</tbody>
</table>


</fieldset>
</center>
</body>
</html>