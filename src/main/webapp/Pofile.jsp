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






<center>




<center>






<h1> Your Profile:</h1>
<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>

<th >Name</th>



<th>Email Id</th>



<th>Phoneno</th>
<th>password</th>


<th>Gender</th>





</tr>
</thead>
<tbody>






  <tr>
    <td>${user.id}</td>
    <td>${user.name}</td>
    <td>${user.email_id}</td>
     <td>${user.phoneno}</td>
      <td>${user.password}</td>
    <td>${user.gender}</td>
      <td>
       <spring:url value="/editUser/${user.id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Change Password/Update</a>
      </td>
    </tr>
    </tr>
     







</tbody>
</table>


<center> <h1>Birthday party</h1></center>
<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>

<th >Name</th>



<th>Date Of Birth</th>



<th>Venue</th>



<th>date_of_arrival</th>



<th>date_of_departure</th>

<th>decoration</th>

<th>material</th>
<th>Cake</th>
<th>Phone number</th>


</tr>
</thead>










<tbody>




 <c:forEach items="${birthday}" var="birthday" >

   <tr>
    <td>${birthday.b_Id}</td>
     <td>${birthday.name_of_child}</td>
     <td>${birthday.date_of_birth}</td>
     <td>${birthday.venue}</td>
     <td>${birthday.date_of_arrival}</td>
     <td>${birthday.date_of_departure}</td>
     <td>${birthday.decoration}</td>
     <td>${birthday.material}</td>
     <td>${birthday.cake}</td>
     <td>${birthday.phoneno}</td>
      <td>
       <spring:url value="/birthday/cancleEvent/${birthday.phoneno}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancle</a>
      </td>
    
    
    </tr>
  






</c:forEach>
</tbody>
</table>

<center> <h1>Marriage party Booked</h1></center>
<fieldset>

<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>

<th >Bride Name</th>



<th>groom name</th>



<th>Venue</th>



<th>date_of_arrival</th>



<th>date_of_departure</th>
<th>no_of_relatives</th>
<th>catering</th>

<th>decoration</th>
<th>photographer</th>
<th>Phone number</th>


</tr>
</thead>
















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
       <spring:url value="/marriage/cancleEvent/${marriage.phoneno}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancle</a>
      </td>
    
    
    </tr>
  





</c:forEach>
</tbody>
</table>
</fieldset>


<center> <h1>Family party Booked</h1></center>
<fieldset>

<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>

<th >Family Name</th>



<th>address</th>



<th>no_of_attendees</th>



<th>no_of_rooms</th>



<th>catering</th>
<th>alcohol</th>
<th>date_of_arrival</th>

<th>date_of_departure</th>
<th>phone_no</th>



</tr>
</thead>



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
       <spring:url value="/family/cancleEvent/${family.phoneno}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Cancel</a>
      </td>
    
    
    </tr>
  






</c:forEach>
</tbody>
</table>
</fieldset>










</body>
</html>