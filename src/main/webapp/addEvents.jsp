<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Event</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>

<style>
body{
background-image: url("images/AddEvents.jpg");
}


</style>
</head>

<body>

<center>
<fieldset style="width: 600px">
<div class="container">

  <h2> Update Event</h2>
  <spring:url value="/addUser1" var="addURL" />


<form action="/updateUser" method="post">
<div>
   <input type="hidden"  name="id" cssClass="form-control" id="id"  value="${userdata.id}"> <br> <br>
    <label>Event Name</label>
    <input name="eventname" cssClass="form-control" id="eventname" value="${userdata.eventname}"  placeholder="Event Name"/>  <br> <br>
   </div>
   
   <div class="form-group">
    <label>Event Venue</label>
    <input name="event_venue" cssClass="form-control" id="event_venue"  value="${userdata.event_venue}" placeholder="Event Venue"/> <br> <br>
   </div>
   
   <div class="form-group">
    <label>Event Date</label>
    <input type="date" name="event_date" cssClass="form-control" id="event_date"  value="${userdata.event_date}" placeholder="Event Date"/> <br>  <br>
   </div>
   
   <div class="form-group">
     <label>Start time</label>
    <input  type="time" name="start_time" cssClass="form-control" id="start_time" value="${userdata.start_time}" placeholder="Start Time" /> <br> <br>
   </div>
   
   <div class="form-group">
    <label>End time</label>
    <input type="time" name="end_time" cssClass="form-control" id="end_time" value="${userdata.end_time}" placeholder="End Time"/> <br> <br>
   </div>
   
   <div class="form-group">
    <label>Description</label>
    <input name="description" cssClass="form-control" id="description" value="${userdata.description}" placeholder="Description"/> <br> <br>
   </div>
   
   <div class="form-group">
    <label>Guest Name</label>
    <input name="event_guest" cssClass="form-control" id="event_guest" value="${userdata.event_guest}" placeholder="Guest Name" /> <br> <br>
   </div>
   
   <div class="form-group">
    <label>Add Photos</label>
    <input type="file" name="photo" cssClass="form-control" id="photo" value="${userdata.photo}" accept="image/png,image/jpeg"/> <br> <br>
   </div>
   
  
   
   <button type="submit" class="btn btn-success">Add</button>
</form>
  
  
</div>
</fieldset>
</center>

</body>
</html>