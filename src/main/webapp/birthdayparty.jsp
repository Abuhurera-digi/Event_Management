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
<h1>Register here </h1>
<fieldset style="width:600px">

<form action="birthBook" method="post">

Child_Name<input type="text" name="name_of_child" placeholder="Enter the name of child" required="required" > <br> <br>
Date_Of_Birth<input type="date" name="date_of_birth" placeholder="Enter your Date of birth" required="required"> <br> <br>


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
Decoration:<input type="radio" name="Decoration" placeholder="Decoration" required="required" value="yes"> Yes</input> <br> <br>
Material:<input type="radio" name="material" placeholder="Material" required="required" value="yes"> Yes</input> <br> <br>

<tr>
<td><label for="cake">Cake</label></td>
<td>    <select name="cake" id="cake">
        <option value="500 g">500g</option>
        <option value="1kg">1kg</option>
        <option value="1.5kg">1.5kg</option>
        <option value="2kg">2kg</option>
        <option value="2.5kg">2.5kg</option>
        <option value="3kg">3kg</option>
        <option value="3.5kg">3.5kg</option>
        <option value="4kg">4kg</option>
        <option value="4.5kg">4.5kg</option>
        <option value="5kg">5kg</option>
       
    </select></td>
</tr>


<input type="submit" value="Submit">




</form>


</fieldset>

</center>
</body>
</html>