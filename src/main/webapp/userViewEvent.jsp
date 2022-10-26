<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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





<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.event_id}</td>
    <td>${x.event_name}</td>  

    <td>${x.event_venue}</td>
    <td>${x.event_date}</td>
   
    <td>${x.start_time}</td>
    <td>${x.end_time}</td>

    <td>${x.description}</td>
    <td>${x.event_guest}</td>
    <td>${x.photo}</td>
    <td>  <a href="birthdayparty.jsp">book</a>   
    
   
     
    
</c:forEach>






</tbody>
</table>


</html>