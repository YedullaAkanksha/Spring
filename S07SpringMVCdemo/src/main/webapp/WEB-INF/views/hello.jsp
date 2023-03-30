<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<html>
	<head>
	<title>Helloworld</title>
	</head>
	<body>
	<h1>Hii SpringMVC</h1>
	<%
	 out.println("Id:"+ request.getAttribute("id") +"<br/>");
	 out.println("Name:"+ request.getAttribute("name")+"<br/>");
	 out.println("Age:"+ request.getAttribute("age")+"<br/>");
	 %>
	 
	 <p>Id:<b>${id}</b></p>
	 <p>Name:<b>${name}</b></p>
	 
	 <p>${employee}</p>
	</body>
</html>