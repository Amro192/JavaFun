<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding:50px">
	<h1>NEW DOJO</h1>
	<form:form method="post" action="/dojos" modelAttribute="dojo">
		 <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
        <input type="submit" value="Create"/>
	</form:form>
	
</body>
</html>