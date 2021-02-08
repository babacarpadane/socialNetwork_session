<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica dei dati</title>
</head>
<body>
	<h1 align="center">
		<strong>Modifica i tuoi dati</strong>
	</h1>

	<form method="Get">
		Inserisci il tuo username e password:<br>
		<br>
		<br> Username: <input type="text" name="username"><br>
		Password: <input type="text" name="password"><br>
		<br>

		<p align="center">
			<input type="submit" name="send" value="Crea il tuo profilo"
				formaction="stampaecreazione"> <input type="submit"
				name="reset" value="Reimposta" formaction="Reimposta">
		</p>
	</form>


</body>
</html>