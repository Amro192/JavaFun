<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div id="container">
		<div id="goldtext"><h2>Your Gold:</h2> <input type="text" name="usergold" value="<c:out value="${goldtext}"/>"></div><br>
			<div id="forms">
			<div>
				<form class="form" action="/form" method="post">
					<label><h1>Farm</h1><br>(earns 10-20 gold)<br><br><input type="hidden" name="bet" value="Farm"><button type="submit">Find Gold!</button></label>
				</form>
			</div>
			<div>
				<form class="form" action="/form" method="post">
					<label><h1>Cave</h1><br>(earns 5-10 gold)<br><br><input type="hidden" name="bet" value="cave"><button type="submit">Find Gold!</button></label>
				</form>
			</div>
			<div>
				<form class="form" action="/form" method="post">
					<label><h1>House</h1><br>(earns 2-5 gold)<br><br><input type="hidden" name="bet" value="house"><button type="submit">Find Gold!</button></label>
				</form>
			</div>
			<div>
				<form class="form" action="/form" method="post">
					<label><h1>Casino</h1><br>(earns/takes 0-50 gold)<br><br><input type="hidden" name="bet" value="casino"><button type="submit">Find Gold!</button></label>
				</form>
			</div>
		</div><br>
		
		
		<div><h2>Activities:</h2><textarea name="activities" rows="10" cols="180"><c:out value="${activities}"/></textarea></div>
		</div>
	
</body>
</html>