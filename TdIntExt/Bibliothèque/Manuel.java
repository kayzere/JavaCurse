package Bibliothèque;

public class Manuel extends Livre {
	
	private int niveauScolaire;

	public Manuel(int niveauScolaire, String auteur, int NumeroEnregistrement, int NombrePages, String titre) {
		super(auteur, NumeroEnregistrement, NombrePages, titre);
		this.niveauScolaire = niveauScolaire;
	}
	
	public String toString() {
		return super.toString() + 
				"Niveau scolaire: " + niveauScolaire+ "\n";
	}
	
	public int getNiveauScolaire() {
		return niveauScolaire;
	}
}
