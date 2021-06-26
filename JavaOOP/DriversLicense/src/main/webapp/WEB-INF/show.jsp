<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding:50px">
<h1><c:out value="${personName}"/></h1>
<p>License number: <c:out value="${licenseNumber}"/> </p>
<p>State: <c:out value="${state}"/>  </p>
<p>Expiration Date: <c:out value="${expirationDate}"/> </p>		
</body>
</html>