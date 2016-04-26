<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>afficher un client</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>
	<span class="info">${ message } </br></span>
	Nom : ${ client.getNom() } </br> 
	Prénom : ${ client.getPrenom() } </br>
	Adresse : ${ client.getAdresseLivraison() } </br>
	Numéro de téléphone : ${ client.getTelephone() } </br>
	Email : ${ client.getAdresseMail() } </br>
</body>
</html>