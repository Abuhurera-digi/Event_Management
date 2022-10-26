<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color: #87CEEB;
}
</style>
 
</head>
<body>
<center>
<fieldset style="width:600px">

 <form action="Register" method="post">
  Id: <input type="number" name="id"> <br> <br>
  Name:  <input type="text" name="name" placeholder="name">  <br> <br>
  Email_id:  <input type="text" name="email_id" placeholder="Email_id"> <br> <br>
  College_Name: <input type="text" name="college_name"placeholder="College name"> <br> <br>
  Phoneno:  <input type="text" name="phoneno" placeholder="Phoneno"> <br> <br>

  
 
   
 Password:   <input id="pass" type="password" name="password"  required="required" placeholder="Enter Password"/> <br> <br>

                    
   
</div>
 

 
  
  Gender
          <input type="radio" name="Gender" value="male" >Male</input>
         <input type="radio" name="Gender" value="female">Female</input><br></br>
 
    <input type="submit"  value="Register">
    
    </form>
    
    </center>
    </fieldset>
 
</body>
</html>