package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public class Etal {
	private Gaulois vendeur;
	private Produit produit;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;

	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	public Gaulois getVendeur() {
		return vendeur;
	}

	public int getQuantite() {
		return quantite;
	}

}
