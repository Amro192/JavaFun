<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
<h1><c:out value="${looky.title}"/></h1>
<p>Description: <c:out value="${looky.artist}"/></p>
<p>Language: <c:out value="${looky.rating}"/></p>
<a href="/lookify/${looky.id}/delete">Delete Song</a>

</body>
</html>