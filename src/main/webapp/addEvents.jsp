<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <h1>Add Event</h1>
<fieldset style="width: 600px">

<form action="event" method="post">

 Event ID:<input type="number" name="event_id" placeholder="Event Id" required="required"> <br> <br>
 
Event Name:<input type="text" name="event_name" placeholder="Event Name"> <br> <br>
Event Venue:<input type="text" name="event_venue" placeholder="Event Venue" required="required"> <br> <br>
Event Date<input type="date" name="event_date" placeholder="Event Date" required="required"> <br> <br>
Start Time: <input type="time" name="start_time" placeholder="Start Time" required="required"> <br> <br>
End Time: <input type="time" name="end_time" placeholder="End Time" required="required"> <br> <br>
Description: <input type="text" name="description" placeholder="Description" required="required"> <br> <br>
Guest Name: <input type="text" name="event_guest" placeholder="Event Guest" required="required"> <br> <br>
Add photos<input type="file" name="photo" placeholder="Add Photo" required="required" accept="image/png, imagw/jpeg "> <br> <br>
<input type="submit" value="Add">




</form>


</fieldset>

 
 
 </center>
</body>
</html>