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
<fieldset style="width: 600px">

<h1>Register Here</h1>

<form action="companybook" method="post">
<c:if test="${not empty error}">
  <h4>${error}</h4>
  </c:if>
Organization Name:<input type="text" name="organization_name" placeholder="Organization Name" required="required"> <br> <br>
Organizer Name:<input type="text" name="organizer_name" placeholder="Organizer Name" required="required"> <br> <br>
Number Of Attendees:<input type="number" name="no_of_attendees" placeholder="Number Of Attendees" required="required"> <br> <br>
Number Of Rooms:<input type="number" name="no_of_rooms" placeholder="Number Of Rooms" required="required"> <br> <br>
Catering: <input type="radio" name="catering" value="Yes">Yes</input>
		  <input type="radio" name="catering" value="No"> No</input> <br> <br>
		  
Alcohol:  <input type="radio" name="alcohol" value="Yes">Yes</input>
		  <input type="radio" name="alcohol" value="No"> No</input> <br> <br>
Date of arrival:<input type="date" name="date_of_arrival" placeholder="Date of arrival" required="required"> <br> <br>
Date of departure:<input type="date" name="date_of_departure" placeholder="Date of departure" required="required"> <br> <br>
Phone no: <input type="number"name="phone_no" placeholder="Enter you phone number" required="required"> <br> <br>
<input type="submit" value="submit">
</form>


</fieldset>

</center>


</body>
</html>