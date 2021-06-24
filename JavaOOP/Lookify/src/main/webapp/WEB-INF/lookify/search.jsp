<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/lookify/search" method="post">
	<h2>Songs By Artist: <c:out value="${artist}"/></h2>
	<input type="text" name="artist">
    <input type="submit" value="New Search"/>
</form> 
<table style="width: 300px; height: auto; text-align:center;">
		<thead>
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lookys}" var="look">
				<tr>
					<td><c:out value="${look.title}" /></td>
					<td><c:out value="${look.rating}" /></td>
					<td><a href="/lookify/${look.id}/delete">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>