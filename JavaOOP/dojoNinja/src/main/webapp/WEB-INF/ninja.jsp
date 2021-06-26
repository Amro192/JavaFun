<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding:50px">
	<h1>New Ninja</h1>
	<form:form method="post" action="/ninjas/new/create" modelAttribute="ninja">
		<p>
	        <form:label path="dojo">Dojo:</form:label>
	        <form:errors path="dojo"/>
	        <form:select type="select" path="dojo">
		        <c:forEach items="${alls}" var="d">
					<form:option value="${d}">
						<c:out value="${d.name}" />
					</form:option>
				</c:forEach>
			</form:select>
    	</p>
		<p>
			<form:label path="firstName">First Name:</form:label>
	        <form:errors path="firstName"/>
	        <form:input path="firstName"/>
        </p>
        <br>
        <p>
			<form:label path="lastName">Last Name:</form:label>
	        <form:errors path="lastName"/>
	        <form:input path="lastName"/>
        </p>
        <br>
        <p>
			<form:label path="age">Age:</form:label>
	        <form:errors path="age"/>
	        <form:input type="number" path="age"/>
	    </p>
	        <input type="submit" value="Create"/>
      
	</form:form>
</body>
</html>