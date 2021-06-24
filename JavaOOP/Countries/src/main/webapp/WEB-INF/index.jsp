<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/">First query</a>
	<c:forEach items="${get}" var="speak">
		<c:out value="${speak[0]}"></c:out> 
		<c:out value="${speak[1]}"></c:out> 
		<c:out value="${speak[2]}"></c:out><br><br>
	</c:forEach><br>
	<a href="/tow">Second query</a>
	<c:forEach items="${tow}" var="speak">
		<c:out value="${speak[0]}"></c:out> 
		<c:out value="${speak[1]}"></c:out><br><br>
	</c:forEach><br>
	<a href="/three">Third query</a>
	<c:forEach items="${three}" var="speak">
		<c:out value="${speak[0]}"></c:out> 
		<c:out value="${speak[1]}"></c:out>
		<c:out value="${speak[2]}"></c:out><br><br>
	</c:forEach><br>
</body>
</html>