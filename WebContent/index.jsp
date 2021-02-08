
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
      <meta charset="ISO-8859-1">
      <title>Nuovo social network</title>
</head>
<body>
      <h1 align="center"><strong>Benvenuto</strong></h1>
      
      <form method="Get">
      Scegli il tuo account ed inserisci i tuoi dati personali:<br><br>
      <p align="center"><strong>Account:</strong></p><br>
      Username: <input type="text" name="username"><br>
      Password: <input type="text" name="password"><br><br>
      <p align="center"><strong>Dati personali:</strong></p><br>
      Nome:     <input type="text" name="name"><br>
      Cognome:  <input type="text" name="surname"><br>
      Nickname: <input type="text" name="nickname"><br>
      e-mail:   <input type="text" name="e-mail"><br><br>
      <input type="submit" name="send" value="Crea il tuo profilo" formaction="stampaecreazione">
      </form>
      <form action="cambioDati.jsp"><input type="submit" name="reset" value="Reimposta" formaction="cambioDati"></form>
  
      
      
      
      
      <!--
      Riepilogo dati account:<br>
      Username: ${parametre_username}<br>
      Password: ${parametre_password}<br><br>
      
      Riepilogo dati personali:<br>
      Username: ${parametre_name}<br>
      Password: ${parametre_surname}<br>
      Username: ${parametre_nickname}<br>
      Password: ${parametre_email}<br>-->
      
      
</body>
</html>