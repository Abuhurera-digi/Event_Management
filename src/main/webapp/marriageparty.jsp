<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
background-image: url("images/marriage.jpg");
  background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover; 
}

</style>
</head>
<body>


<center>
<h1>Register Here</h1> 

<fieldset style="width:600px">

<form action="marriagebook" method="post">
<c:if test="${not empty error}">
  <h4>${error}</h4>
  </c:if>
Bride Name:<input type="text" name="bride_name" placeholder="Enter the bride name" required="required" > <br> <br>
Groom Name:<input type="text" name="groom_name" placeholder="Enter the Groom Name" required="required"> <br> <br>

<tr>
<td><label for="venue">Venue</label></td>
<td>    <select name="venue" id="venue">
        <option value="PMR hall">PMR Hall</option>
        <option value="Nandhana Banquet Hall">Nandhana Banquet Hall</option>
        <option value="S S Lumina Hotel">S S Lumina Hotel</option>
        <option value="Trois Banquet Hall">Trois Banquet Hall</option>
        <option value="Wafi Suites">Wafi Suites</option>
        <option value="The Grand Krishna">The Grand Krishna</option>
       
    </select></td>
</tr> <br> <br>

Date of arrival:<input type="date" name="date_of_arrival" placeholder="Date of arrival" required="required"> <br> <br>
Date of departure:<input type="date" name="date_of_departure" placeholder="Date of departure" required="required"> <br> <br>
NO of Relatives: <input type="number" name="no_of_relatives" placeholder="Number of relatives" requried="requried"> <br> <br>
Catering: <input type="radio" name="catering" value="Yes">Yes</input>
		  <input type="radio" name="catering" value="No"> No</input> <br> <br>
Decoration:<input type="radio" name="decoration" placeholder="Decoration" required="required" value="yes"> Yes</input> <br> <br>
Material:<input type="radio" name="material" placeholder="Material" required="required" value="yes"> Yes</input> <br> <br>
Photographer:<input type="radio" name="photographer" placeholder="Photographer" required="required" value="yes"> Yes</input> <br> <br>
Phone nUmber: <input type="number" name="phoneno" placeholder="Enter your phone number" required="required"> <br> <br>



<input type="submit" value="Submit">




</form>


</fieldset>

</center>
</body>
</html>