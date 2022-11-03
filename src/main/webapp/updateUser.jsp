 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update Student</title>
<style>
body{
background-image: url("images/AddEvents.jpg");
}

</style>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<center>
<fieldset style="width: 600px">
 
  
<div class="container">

  <spring:url value="/UpdateUser" var="addURL" />
  <h2>Update Here </h2>
  <form:form modelAttribute="userForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label> Name</label>
    <form:input path="name" cssClass="form-control" id="name" placeholder="Enter Your Name" />
   </div>
   <br> <br>
   

   <div class="form-group">
    <label>Email Id</label>
    <form:input path="email_id" cssClass="form-control" id="email_id" placeholder="Enter Your Email Id" />
   </div>
   <br> <br>
   
   <div class="form-group">
    <label>College_name</label>
    <form:input path="college_name" cssClass="form-control" id="college_name" placeholder="Enter Your College name" />
   </div>
   <br> <br>
   
   <div class="form-group">
    <label>Phone Number</label>
    <form:input path="phoneno" cssClass="form-control" id="phoneno" placeholder="Enter Your Phone Number" />
   </div>
   <br> <br>
   
     <div class="form-group">
    <label>Password</label>
    <form:input path="password" cssClass="form-control" id="password"  placeholder="Enter Your Password" />
   </div>
   <br> <br>
      <div class="form-group">
    <label>Gender</label>
    <form:input path="gender" cssClass="form-control" id="gender"  placeholder="Enter Your Gender" />
   </div>
   <br> <br>
 
     <button type="submit" class="btn btn-success">update</button>
  </form:form>
  
</div>

</fieldset>
</center>
</body>
</html>