<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response Page</title>
</head>
<body >

<h2>Welcome </h2>
<%String status =(String)request.getAttribute("status"); 
	Integer age = (Integer)request.getAttribute("age");
%>
<% if(status.equals("success")){
%>
<font color="green"><h3>Login success: Welcome !!</h3>
<h4> Your age is: <%=age%></h4>
</font>

<%}else{ %>
<font color="red"><h3>Login Failure: Invalid Credentials !!
</h3></font>
<%} %>

</body>
</html>