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

	<form method="Post">
		Inserisci il tuo username e password:
		<br><br> 
		Username: <input type="text" name="usernameSicurezza"><br>
		Password: <input type="password" name="passwordSicurezza"><br><br>
		Inserisci solamente i dati che vuoi modificare:<br><br>
		Nome:     <input type="text" name="nameModificato"><br>
        Cognome:  <input type="text" name="surnameModificato"><br>
        Nickname: <input type="text" name="nicknameModificato"><br>
        e-mail:   <input type="email" name="e-mailModificato"><br><br>

		<p align="center">
			 <input type="submit"
				name="reset" value="Reimposta" formaction="stampaecreazione">
		</p>
	</form>
	
	Modifica effettuata ${tour} <br><br>


</body>
</html>