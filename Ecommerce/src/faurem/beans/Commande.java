package faurem.beans;

public class Commande {
	
	Double montant;
	String modePaiment;
	String statutPaiment;
	String modeLivraison;
	String statutLivraison;
	
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
	
	
}
