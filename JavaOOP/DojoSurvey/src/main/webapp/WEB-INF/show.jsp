<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/show.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<div id="div">
<h1>Submitted Info</h1>
		<h3>Name:</h3><c:out value="${name}"/>
		<h3>Dojo Location:</h3><c:out value="${location}"/>
		<h3>Dojo language:</h3><c:out value="${language}"/>
		<h3>Comment:</h3><c:out value="${message}"/>
</div>
</center>
</body>
</html>