package Bibliothèque;

public class Livre extends Document {

	private String auteur;
	private int nombrePages;

	public Livre(String auteur, int NumeroEnregistrement, int nombrePages, String titre) {
		super(NumeroEnregistrement, titre);
		this.auteur = auteur;
		this.nombrePages = nombrePages;
	}

	public String toString() {
		return super.toString() + 
				"Auteur: " + auteur+ "\n" +
				"Nombre de pages: " + nombrePages+ "\n";
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public int getNnombrePages() {
		return nombrePages;
	}
	
}
