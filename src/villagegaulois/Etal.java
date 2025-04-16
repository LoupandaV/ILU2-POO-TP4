package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal<P extends Produit> {
	private Gaulois vendeur;
	private P produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	
	public void occuperEtal(Gaulois vendeur, P produit, int quantite) {
		this.vendeur = vendeur;
	    this.produit = produit;
	    this.quantite = quantite;
	    this.quantiteDebutMarche = quantite;
	    this.etalOccupe = true;
	}	

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}

	public P getProduit() {
		return produit;
	}

}
