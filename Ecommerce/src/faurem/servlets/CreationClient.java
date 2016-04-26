package faurem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import faurem.beans.Client;

public class CreationClient extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Client client = new Client();
		String message;
		client.setAdresseLivraison(req.getParameter("adresseClient"));
		client.setAdresseMail(req.getParameter("emailClient"));
		client.setNom(req.getParameter("nomClient"));
		client.setPrenom(req.getParameter("prenomClient"));
		client.setTelephone(req.getParameter("telephoneClient"));
		
		
		
		if(client.getAdresseLivraison() == "" || client.getNom() == ""  || client.getTelephone() == "")
		{
			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. </br>"
					+ "<a href=\"creerClient.jsp\" >Cliquez ici</a> pour accéder au formulaire de création d'un client.";
		}
		else
		{
			message = "Client créé avec succès !";
		}
			
		req.setAttribute( "message", message );
		req.setAttribute( "client", client );
		
		this.getServletContext().getRequestDispatcher( "/afficherClient.jsp" ).forward( req, resp );
	}

}
