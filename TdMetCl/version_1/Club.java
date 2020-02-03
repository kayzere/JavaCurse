package version_1;

public class Club {
	private String nom;
	private Individu[] membres;
	private int nombreMembres;
	private int MaxMembre;

	public Club(String nom) {
		this.nom = nom;
		this.MaxMembre = 50;
		this.membres = new Individu[MaxMembre];
		this.nombreMembres = 0;
	}

	public String getNom() {
		return nom;
	}

	public int getMaxMembre() {
		return MaxMembre;
	}

	public Individu trouverMembre(String nom, String prenom) {
		for (int index = 0; index<nombreMembres; index++) {
			Individu individu = membres[index];
			if (individu.equals(new Individu(nom, prenom)))
				return individu;
		}
		return null;
	}

	public Individu ajouterMembre(String nom, String prenom) {
		Individu individu = trouverMembre(nom, prenom);

		if (individu != null)
			return individu;

		individu = new Individu(nom, prenom);
		// Verification et agrandissement du tableau;
		aggrandir_tableau();
		membres[nombreMembres] = individu;
		nombreMembres++;

		return individu;
	}

	private void aggrandir_tableau() {
		if (nombreMembres + 1 < MaxMembre)
			return;
		Individu newMembres[] = new Individu[membres.length * 2];
		for (int index = 0; index < nombreMembres; index++)
			newMembres[index] = membres[index];
		membres = newMembres;
	}

	public void lister() {
		for (int index = 0; index < nombreMembres; index++) {
			System.out.println(membres[index]);
		}
	}

	public String toString() {
		return "Nom du Club = " + getNom() +  "\nNombre actuel d'individu dans le Club = " + getMaxMembre() + "\ntaille max du club "
				+ getMaxMembre();
	}
}
