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
<h1><c:out value="${language.name}"/></h1>
<p>Description: <c:out value="${language.creator}"/></p>
<p>Language: <c:out value="${language.version}"/></p>
<a href="/languages/${language.id}/edit">Edit</a>
<a href="/languages/${language.id}/delete">delete</a>
</body>
</html>