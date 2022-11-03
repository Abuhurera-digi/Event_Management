<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body{
background-image: url("images/forgotbackground.webp");
background-repeat: no-repeat;
background-size: 100%;
height: 100%;

}
</style>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>user List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>


 <div class="container">
 
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row">ID</th>
    <th scope="row">Name</th>
    <th scope="row">Email_id</th>
     <th scope="row">College Name</th>
    <th scope="row">phone number</th>
     <th scope="row">password</th>
    <th scope="row">Gender</th>
    
    
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${result}" var="user" >
     <tr>
      <td>${user.id}</td>
      <td>${user.name}</td>
      <td>${user.email_id}</td>
       <td>${user.college_name}</td>
      <td>${user.phoneno}</td>
       <td>${user.password}</td>
      <td>${user.gender}</td>
      
      <td>
       <spring:url value="/user/deleteStudent/${user.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
 
 </div>
</body>
</html>