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

</body>
</html>