<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.digisprint.Event_Management1.Contoller.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

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

  <tr>
    <td>${event_data.event_id}</td>
    <td>${event_data.eventname}</td>  
    <td>${event_data.event_venue}</td>
    <td>${event_data.event_date}</td>
   
    <td>${event_data.start_time}</td>
    <td>${event_data.end_time}</td>
    <td>${event_data.description}</td>
    <td>${event_data.event_guest}</td>
   <td>image:</td> <td><img  src= "data:image/jpeg;base64,${friend_data.base64photo}" style="width: 50px;height: 80px ;"/></img></td>
      
    <td>  <a href="birthdayparty.jsp">book</a>   
    
   
     


</tbody>
</table>
</body>
</html>