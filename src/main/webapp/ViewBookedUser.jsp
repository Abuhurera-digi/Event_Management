<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body{
background-image: url("images/bookedAllUser.webp");
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

<h1>Booked User</h1>

<center> Birthday party Booked</center>

<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>
<th> Name</th>

<th> Date Of Birth</th>

<th> Venue</th>
<th> Date Of Arrival</th>
<th> Date Of Depature</th>
<th>Decoration</th>

<th>material</th>
<th>Cake</th>



<th>Phone number</th>






</tr>
</thead>
<tbody>



 <c:forEach items="${result}" var="birth" >

   <tr>
    <td>${birth.b_Id}</td>
     <td>${birth.name_of_child}</td>
     <td>${birth.date_of_birth}</td>
     <td>${birth.venue}</td>
     <td>${birth.date_of_arrival}</td>
     <td>${birth.date_of_departure}</td>
     <td>${birth.decoration}</td>
     <td>${birth.material}</td>
     <td>${birth.cake}</td>
     <td>${birth.phoneno}</td>
      <td>
     <td>
       <spring:url value="/birth/cancleEvent/${birth.b_Id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancel</a>
      </td>
     
    
</c:forEach>




</tbody>
</table>
</fieldset>


<center> Marriage party Booked</center>

<fieldset>

<table border = "1" width = "100%">
<thead>
<tbody>
 <c:forEach items="${marriage}" var="marriage" >

   <tr>
    <td>${marriage.id}</td>
     <td>${marriage.bride_name}</td>
     <td>${marriage.groom_name}</td>
     <td>${marriage.venue}</td>
     <td>${marriage.date_of_arrival}</td>
     <td>${marriage.date_of_departure}</td>
     <td>${marriage.no_of_relatives}</td>
     <td>${marriage.catering}</td>
     <td>${marriage.decoration}</td>
     <td>${marriage.phoneno}</td>
      <td>
       <spring:url value="/marri/cancleEvent/${marriage.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancel</a>
      </td>
    
    
    </tr>
  






</c:forEach>
</tbody>
</table>
</fieldset>

<center> Family party Booked</center>

<fieldset>

<table border = "1" width = "100%">
<thead>
<tbody>

<c:forEach items="${family}" var="family" >

   <tr>
    <td>${family.id}</td>
     <td>${family.familyname}</td>
     <td>${family.address}</td>
     <td>${family.no_of_attendees}</td>
     <td>${family.no_of_rooms}</td>
     <td>${family.catering}</td>
     <td>${family.alcohol}</td>
     <td>${family.date_of_arrival}</td>
     <td>${family.date_of_departure}</td>
     <td>${family.phoneno}</td>
      <td>
       <spring:url value="/family/cancleEvent/${family.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancel</a>
      </td>
    
    
    </tr>
  






</c:forEach>
</tbody>
</table>
</fieldset>
</body>
</html>