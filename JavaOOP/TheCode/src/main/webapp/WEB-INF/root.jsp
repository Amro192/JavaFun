<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2>What is the code?</h2>
	<div>
	<form method="post" action="/code">
	 <input name="codeint" type="password" class="form-control" id="inputPassword2" placeholder="Code"> <br>
	 <button type="submit" class="btn btn-primary">Submit</button>
	 </form>
	</div>
	</center>
</body>
</html>