<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


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



<th>Gender</th>





</tr>
</thead>
<tbody>






  <tr>
    <td>${user.id}</td>
    <td>${user.name}</td>
    <td>${user.email_id}</td>
     <td>${user.phoneno}</td>
    <td>${user.gender}</td>
    </tr>
     







</tbody>
</table>


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



</body>
</html>