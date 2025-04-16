package produit;

public class Poisson extends Produit {
	private String datePeche;
	
	public Poisson(String date) {
		super("poisson",Unite.PIECE);
		this.datePeche=date;
		
	}
	
	
	public String decrireProduit() {
		return "poisson pêché " + datePeche + ".";
	}

}
