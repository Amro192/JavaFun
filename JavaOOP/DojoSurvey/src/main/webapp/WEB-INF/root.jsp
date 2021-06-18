<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<div id="div">
<form method="post" action="/submit">
	<div>Your Name <input name="name" type="text"></div> 
	Dojo Location
		  <select name="location">
		    <option value="0">Select location:</option>
		    <option value="1">Ramallah</option>
		    <option value="2">Hebron</option>
		  </select> <br>	
	Favorite language
		  <select name="language">
		    <option value="0">Select language:</option>
		    <option value="1">Java</option>
		    <option value="2">Python</option>
		  </select><br>
	Comment(Optional):<div> <textarea name="message" rows="10" cols="30"></textarea></div> 
	<div><button type="submit" name="submit">Submit</button></div>  
	</form>
	</div>
</center>
</body>
</html>