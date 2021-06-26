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
<body>
<form:form action="/license/new/create" method="post" modelAttribute="license">
		<p>
			<form:label path="person">Person:</form:label>
			<form:errors path="person" />
			<form:select type="select" path="person">
				<c:forEach items="${persons}" var="person">
					<form:option value="${person}">
						<c:out value="${person.firstName} ${person.lastName}" />
					</form:option>
					
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="state">State:</form:label>
			<form:errors path="state" />
			<form:input path="state" />
		</p>
		<p>
			<form:label path="expirationDate">Expiration Date:</form:label>
			<form:errors path="expirationDate" />
			<form:input type="date" path="expirationDate" />
		</p>

		<input type="submit" value="Create" />
	</form:form>
</body>
</html>