<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding:50px">
	<h1 style ="text-align:center;"><c:out value="${name.name}" /> Ninjas</h1>
	<table style="width: 300px; height: auto; text-align:center;">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allDN}" var="a">
				<tr>
					<td><c:out value="${a.firstName}" /></td>
					<td><c:out value="${a.lastName}" /></td>
					<td><c:out value="${a.age}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>