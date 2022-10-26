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
<h1>welcome</h1>

<center>






<h1> Your Profile:</h1>
<fieldset style="width: 1000px">





<table border = "1" width = "100%">
<thead>
<tr>
<th >Id</th>



<th>Email Id</th>



<th>Phoneno</th>



<th>Gender</th>





</tr>
</thead>
<tbody>





<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.id}</td>
    

    <td>${x.email_id}</td>
   
   
    <td>${x.phoneno}</td>
   

    <td>${x.gender}</td>
    
    
     
    
</c:forEach>






</tbody>
</table>

</body>
</html>