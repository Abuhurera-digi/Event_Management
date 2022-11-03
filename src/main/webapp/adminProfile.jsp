<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> List</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>








<h1> Your Profile:</h1>
<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>

<th >Name</th>



<th>Email Id</th>




<th>password</th>








</tr>
</thead>
<tbody>






  <tr>
    <td>${admin.id}</td>
    <td>${admin.name}</td>
    <td>${admin.email_id}</td>
   <%--  <td>
    <spring:url vaule="/editAdmin/${admin.id}" var="editURL"/>
    <a class="btn btn-info" href="${editURL}" role="button">Change Password</a>
    
    </td> --%>
    <td>
       <spring:url value="/editAdmin/${admin.id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Change Password/Update</a>
      </td>
    </tr>
     







</tbody>
</table>





</body>
</html>