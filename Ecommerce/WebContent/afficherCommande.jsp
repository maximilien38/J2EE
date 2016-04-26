<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>afficher un commande</title>
<link type="text/css" rel="stylesheet" href="inc/style.css" />
</head>
<body>
	<span class="info">${ message } </br></span>
	<p> Client </p>
	<p> Nom : ${ commande.client.getNom() } </p> 
	<p> Prénom : ${ commande.client.getPrenom() } </p>
	<p> Adresse : ${ commande.client.getAdresseLivraison() } </p>
	<p> Numéro de téléphone : ${ commande.client.getTelephone() } </p>
	<p> Email : ${ client.getAdresseMail() } </p>
	<p> Commande</p>
	<p> Date :</p>
	<p> Montant : ${ commande.getMontant()  }</p>
	<p> Mode de paimenet : ${ commande.getModePaiment() }</p>
	<p> Statut du paiment: ${ commande.getStatutPaiment()  }</p>
	<p> Mode de livraison : ${ commande.getModeLivraison()  }</p>
	<p> Statut de la livraison : ${ commande.getStatutLivraison()  }</p>
</body>
</html>