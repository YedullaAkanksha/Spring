<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>List of users</h1>
<form action="registeruser" method="post">
	<pre>
	
	Name: <input type="text" name="name"/>
	Email: <input type="text" name="email"/>
	Password: <input type="password" name="password"/>
	<input type="submit" name="SignUp"/>
	
	</pre>
	</form>
	<ul>
	<c:forEach items="${users}" var="user">
	   <li>${user.id} | ${user.name} | ${user.email}</li>
	   </c:forEach>
	</ul> 
	<p> ${message}
 
</body>
</html>