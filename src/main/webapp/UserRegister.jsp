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
  Id: <input type="number" name="id">
  Name:  <input type="text" name="name" placeholder="name">  <br> <br>
  Email_id:  <input type="text" name="email_id" placeholder="Email_id"> <br> <br>
  College_Name: <input type="text" name="college_name"placeholder="College name"> <br> <br>
  Phoneno:  <input type="text" name="phoneno" placeholder="Phoneno"> <br> <br>

  
 <%--  <div id="errormsg" style="display:none"></div>
<div>--%>
   
 Password:   <input id="pass" type="password" name="password"  required="required" placeholder="Enter Password"/>
 <%-- ConfirmPassword:  <input id="passConfirm"  type="password" name="passConfirm"  required="required" placeholder="Enter confirm Paassword"/>              
    <span id="error" style="display:none">Password mismatch</span> --%> 
                    
   
</div>
 

 
  
  Gender
          <input type="radio" name="Gender" value="male" >Male</input>
         <input type="radio" name="Gender" value="female">Female</input><br></br>
 
    <input type="submit" onclick="savePass()" value="Register">
    
    </form>
    
    </center>
    </fieldset>
 <%--    
<script src="jquery.min.js"></script>
<script type="text/javascript">

var serverContext = [[@{/}]];
function savePass(){
    var pass = $("#pass").val();
    var valid = pass == $("#passConfirm").val();
    if(!valid) {
      $("#error").show();
      return;
    }
}
</script>--%>
</body>
</html>