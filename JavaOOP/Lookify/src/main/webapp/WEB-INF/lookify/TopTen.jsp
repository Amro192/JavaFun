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
<h2> Top Ten Songs </h2>
<a style="float:right" href="/dashboard">Dashboard</a>
<table style="width: 300px; height: auto; text-align:center;">
		<tbody>
			<c:forEach items="${lookys}" var="look">
				<tr><td><c:out value="${look.rating}" /></td>
					<td><a href="/songs/${look.id}"><c:out value="${look.title}"/></a> - <c:out value="${look.artist}" /></td>				
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>