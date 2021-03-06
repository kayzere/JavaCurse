package Bibliothèque;

public class Roman extends Livre{
	
	private int prixLitteraire;
	
	public Roman(int prixLitteraire, String auteur, int NumeroEnregistrement, int NombrePages, String titre) {
		super(auteur, NumeroEnregistrement, NombrePages, titre);
		this.prixLitteraire = prixLitteraire;
	}

	public String toString() {
		return super.toString() +
				"Prix littéraire : " + PrixLitteraires.nom(prixLitteraire) + "\n";
	}
	
	public int getPrixLitteraire() {
		return prixLitteraire;
	}
	
}
