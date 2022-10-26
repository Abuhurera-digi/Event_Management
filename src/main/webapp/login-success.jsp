<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: 	#0000FF;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 20px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav input[type=text] {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
}


@media screen and (max-width: 600px) {
  .topnav a, .topnav input[type=text] {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
  
}

.card {
position : absolute;
top: 1%;
left:95%;
 
  max-width: 300px;
  margin: auto;
  text-align: right;
  
  
}

.title {
  color: grey;
  font-size: 18px;
}


body {
	background-image: url("/images/best-event1.jpg");
	background-repeat: no-repeat;
background-size: 100%;
height: 100%;
}

.abu{
 position: absolute;
 top: 20%;
 left:10%;
}


</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="#home">Home</a>
<%-- <a href="ViewEvents.jsp">View Events</a>   --%> 


 
 
  <a href="password.jsp">Change the Password</a>
  
  <a href="about.jsp">about</a>
  <a href="contact.jsp">Contact Details</a>
  <a href="logout.jsp">logout</a>
<h2 style="text-align:center"></h2>

<div class="card">
 
  
  <form action="yourprofile">
  <input type="submit" value="profile">
  </form>
  
  
 
</div>

<div class="abu">
 <form action="Event1" > 
 <input type="submit" value="viewEvent">
 </form>
</div>


</body>
</html>
