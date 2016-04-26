package faurem.beans;

public class Commande {
	
	Client client;
	Double montant;
	String modePaiment;
	String statutPaiment;
	String modeLivraison;
	String statutLivraison;
	private String date;
	
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getModePaiment() {
		return modePaiment;
	}
	public void setModePaiment(String modePaiment) {
		this.modePaiment = modePaiment;
	}
	public String getStatutPaiment() {
		return statutPaiment;
	}
	public void setStatutPaiment(String statutPaiment) {
		this.statutPaiment = statutPaiment;
	}
	public String getModeLivraison() {
		return modeLivraison;
	}
	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}
	public String getStatutLivraison() {
		return statutLivraison;
	}
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}
	
	public String getDateCommande() {
		return date;	
	}
	
	public void setDateCommande(String date) {
		this.date = date;	
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
