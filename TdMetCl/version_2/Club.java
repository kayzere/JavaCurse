package version_2;

import java.util.Vector;

public class Club {
	private String nom;
	private Vector<Individu> membres;
	
	public Club(String nom) {
		this.nom = nom;
		this.membres = new Vector<Individu>();
	}

	public String toString() {
		return getNom();
	}

	public String getNom() {
		return nom;
	}

	public Individu trouverMembre(String nom, String prenom) {
		int pos = membres.indexOf(new Individu(nom, prenom));

//		Individu expr;
//		if (pos == -1)
//			expr = null;
//		else
//			expr = membres.get(pos);
//		return expr;
		
		
		return pos == -1 ? null : membres.get(pos);
	}

	public Individu ajouterMembre(String nom, String prenom) {
		Individu individu = trouverMembre(nom, prenom);

		if (individu != null)
			return individu;

		individu = new Individu(nom, prenom);

		membres.add(individu);

		return individu;
	}

	public void lister() {
		System.out.println(getNom());
		
		for (Individu individu : membres)
			System.out.println(individu);
	}
}
