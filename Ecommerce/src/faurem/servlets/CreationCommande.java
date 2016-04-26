package faurem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import faurem.beans.Client;
import faurem.beans.Commande;

public class CreationCommande extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Commande commande = new Commande();
		String message;
		String tmp;
		
		/* Récupération de la date courante */
		DateTime dt = new DateTime();
		/* Conversion de la date en String selon le format défini */
		DateTimeFormatter formatter = DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" );
		String date = dt.toString( formatter );
		commande.setDateCommande(date);
		
		if((tmp = req.getParameter("montantCommande")) != "")
			commande.setMontant(Double.valueOf(tmp));
		commande.setModePaiment(req.getParameter("modePaiementCommande"));
		commande.setStatutPaiment(req.getParameter("statutPaiementCommande"));
		commande.setModeLivraison(req.getParameter("modeLivraisonCommande"));
		commande.setStatutLivraison(req.getParameter("statutLivraisonCommande"));
		
		Client client = new Client();
		client.setAdresseLivraison(req.getParameter("adresseClient"));
		client.setAdresseMail(req.getParameter("emailClient"));
		client.setNom(req.getParameter("nomClient"));
		client.setPrenom(req.getParameter("prenomClient"));
		client.setTelephone(req.getParameter("telephoneClient"));
		
		commande.setClient(client);
		
		if(client.getAdresseLivraison() == "" || client.getNom() == ""  || client.getTelephone() == "" 
				|| req.getParameter("montantCommande") == "" || commande.getModePaiment() == "" || commande.getModeLivraison() == "")
		{
			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. </br>"
					+ "<a href=\"creerCommande.jsp\" >Cliquez ici</a> pour accéder au formulaire de création d'un client.";
		}
		else
		{
			message = "Commande créé avec succès !";
		}
			
		req.setAttribute( "message", message );
		req.setAttribute( "commande", commande);

		
		this.getServletContext().getRequestDispatcher( "/afficherCommande.jsp" ).forward( req, resp );
	}

}
