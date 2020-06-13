<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forma</title>
<link rel = "stylesheet" href="index.css">
</head>
<body>

	<form method = "post" action="Form">
	
	<p>Ime: <b>${ime}</b></p>
	<p>Prezime: <b>${prezime}</b></p>
	<p>Datum rodenja: <b>${datumRodenja}</b></p>
	<p>Email: <b>${email}</b></p>
	<p>Adresa:<b>${adresa}</b></p>
	
	<input type="submit" value="Login" />
	
	</form>

</body>
</html>