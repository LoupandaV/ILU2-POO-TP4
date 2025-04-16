package produit;

public abstract class Produit{
	
	private String nom;
	private Unite unites;
	
	public Produit(String nom,Unite unit) {
		this.nom=nom;
		this.unites=unit;
		
	}
	

	public String getNom() {
		return nom;
	}
	
	protected Unite getUnite() {
		return unites;
		
	}
	
	public abstract String decrireProduit();

}
