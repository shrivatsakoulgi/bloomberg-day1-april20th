<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<center>
<h2>Enter your credentials</h2>

<form action="login" method="post">
<label> Enter Username: </label>
<input type="text" id="username" name="username"/>
<br>
<label>Enter Password:</label> 
<input type="password" id="pwd" name="pwd"> <br>
<label> Enter Age: </label>
<input type="text" id="age" name="age"/><br>
<input type="submit">
</form>
</center>
</body>
</html>