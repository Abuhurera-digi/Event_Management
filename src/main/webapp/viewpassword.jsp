<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>See is your password here</h2>



<center>






<h1> All User:</h1>
<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>
<th>Name</th>



<th>Email Id</th>
<th>College Name</th>



<th>Phoneno</th>
<th>Password</th>



<th>Gender</th>





</tr>
</thead>
<tbody>





<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.id}</td>
    <td>${x.name}</td>  

    <td>${x.email_id}</td>
    <td>${x.college_name}</td>
   
    <td>${x.phoneno}</td>
    <td>${x.password}</td>

    <td>${x.gender}</td>
    <td>
    <form action="deleteuser">
    <input type="submit" value="Delete">
    </form>
    </td>
    
     
    
</c:forEach>






</tbody>
</table>



</body>
</html>