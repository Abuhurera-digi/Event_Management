
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
<style>

.birthday{
position: absolute;
top: 50%;
left: 54%;

} 

.marriage{
position: absolute;
top: 60%;
left: 50%;
}
</style>
</head>
<body>
<center>
<h1>Select Your Event</h1>

 <a href="birthdayparty.jsp"><img src="/images/birthaday.jpg" height="200px" width="400px"></a> <br> <br>
  <a href="birthdayparty.jsp">Book now</a>
  
 <p> <h2>Birthday Party</h2></p>

 
 <a href="marriageparty.jsp"> <img src="/images/marriage-party.jpg" height="200px" width="400px"></a> <br> <br>
 <a href="marriageparty.jsp">Book now</a>
 <p> <h2>Marriage Party</h2></p>
 
 
 <a href="companyParty.jsp"> <img  src="/images/company-party.jpeg" height="200px" width="400px"> </a> <br> <br>
  <a href="companyParty.jsp">Book now</a>
 <p><h2>Company Party</h2> </p>

 
 <a href="familyGettogether.jsp">  <img src="/images/family-get.jpg" height="200px" width="400px"></a> <br> <br>
  <a href="familyGettogether.jsp">Book now</a>
 <p>  <h2>Family Get Together</h2></p>

 
 </center>
 

 <%-- 
 <div class="birthday">
 <form action="deletebirthday">
 <input type="submit" value="Delete">
 </form>
 </div>
 
 <div class="marriage" >
 
 <form action="deletemarriage">
 <input type="submit" value="Delete">
 </form></div>
 
 <div >
 
 <form action="deletecompany">
 <input type="submit" value="Delete">
 </form></div>
 
 <div >
 
 <form action="deletefamily">
 <input type="submit" value="Delete">
 </form></div>
 --%>
 <%-- 
 <h1> Retreive Event Details</h1>
<h5>   ${Event}<h5>  

<h1> View Event Details </h1>
<h2>Details are submitted as follows</h2>
<h4>  ID  :${event_id }</h4>
<h4>  Name  :${event_name }
</h4>
<h4>Venue: ${event_venue}</h4>
<h4>date:${event_date}</h4>
<h4>start_time : ${start_time}</h4>
<h4>end_time: ${start_time}</h4>
<h4>description:${description}</h4>
<h4>event_guest: ${event_guest}</h4>
<h4>photo:${photo}
</h4>
--%>



<center>

<h1> All Event:</h1>
<form modelAttribute="eventForm" method="POST" >




<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Event Id</th>
<th>Event name</th>



<th>Event Venue</th>
<th>Event Date</th>

<th>Start time</th>

<th>End Time</th>
<th>description</th>



<th>Event Guest</th>
<th>Photo</th>





</tr>
</thead>
<tbody>



<c:forEach items="${result}" var="event">  
  <tr>
    <td>${event.event_id}</td>
    <td>${event.event_name}</td>  
    <td>${event.event_venue}</td>
    <td>${event.event_date}</td>
   
    <td>${event.start_time}</td>
    <td>${event.end_time}</td>
    <td>${event.description}</td>
    <td>${event.event_guest}</td>
    <td>${event.photo}</td>
      
    
    <td>
       <spring:url value="/event/editEvent/${event.event_id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/event/deleteEvent/${event.event_id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     
    
</c:forEach>




</tbody>
</table>
</fieldset></form>


</html>