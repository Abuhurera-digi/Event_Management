<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<center>
<div class="container">

  <spring:url value="/addUser" var="addURL" />
  <h2>Update Here</h2>
  <form:form modelAttribute="adminForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   
   
   <div class="form-group">
    <label>User Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <br> <br>
   
  <%--  <div class="form-group">
    <label>Last Name</label>
    <form:input path="lastName" cssClass="form-control" id="lastName" />
   </div>
    --%>
   <div class="form-group">
    <label>Email Id</label>
    <form:input path="email_id" cssClass="form-control" id="email_id" />
   </div>
   <br> <br>
   
 <%--   <div class="form-group">
    <label>Date Of Birth</label>
    <form:input  type="date" path="dateOfBirth" cssClass="form-control" id="dateOfBirth" />
   </div> --%>
   
  <%--  <div class="form-group">
    <label>Religion</label>
    <form:input path="religion" cssClass="form-control" id="religion" />
   </div>
   
   <div class="form-group">
    <label>Mother Tongue</label>
    <form:input path="motherTongue" cssClass="form-control" id="motherTongue" />
   </div>
   
   <div class="form-group">
    <label>Caste</label>
    <form:input path="caste" cssClass="form-control" id="caste" />
   </div>
   
   <div class="form-group">
    <label>Blood Group</label>
    <form:input path="bloodGroup" cssClass="form-control" id="bloodGroup" />
   </div>
   
   <div class="form-group">
    <label>Occupation</label>
    <form:input path="occupation" cssClass="form-control" id="occupation" />
   </div>
   
   <div class="form-group">
    <label>Annual Income</label>
    <form:input path="annualIncome" cssClass="form-control" id="annualIncome" />
   </div>
   
   <div class="form-group">
    <label>Age</label>
    <form:input path="age" cssClass="form-control" id="age" />
   </div>
   
   <div class="form-group">
    <label>Height</label>
    <form:input path="height" cssClass="form-control" id="height" />
   </div>
   
   <div class="form-group">
    <label>Weight</label>
    <form:input path="weight" cssClass="form-control" id="weight" />
   </div>
   
   <div class="form-group">
    <label>Highest Education</label>
    <form:input path="highestEducation" cssClass="form-control" id="highestEducation" />
   </div>
   
   <div class="form-group">
    <label>Current Address</label>
    <form:input path="currentAddress" cssClass="form-control" id="currentAddress" />
   </div>
   
   <div class="form-group">
    <label>Permanent Address</label>
    <form:input path="permanentAddress" cssClass="form-control" id="permanentAddress" />
   </div>
   
   <div class="form-group">
    <label>Phone Number</label>
    <form:input path="phoneNumber" cssClass="form-control" id="phoneNumber" />
   </div>
   
   <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control" id="email" />
   </div> --%>
   
   <div class="form-group">
    <label>Password</label>
    <form:input path="password" cssClass="form-control" id="password" />
   </div>
   <br> <br>
   
   
   
   <button type="submit" class="btn btn-success">Change Password</button>
  </form:form>
  
</div>
</center>
</body>
</html>