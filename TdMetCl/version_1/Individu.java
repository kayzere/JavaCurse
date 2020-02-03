package version_1;

import java.util.Objects;

public class Individu {

	private String nom, prenom;
	private boolean[] sportsPratiques;

	public Individu(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.sportsPratiques = new boolean[Sport.NBSport];
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean[] getSportsPratiques() {
		return sportsPratiques;
	}

	public String toString() {
		return "Nom: " + getNom() + " " + " Prenom: " + getPrenom();
	}

	public void ajouterSport(int sport) {
		sportsPratiques[sport] = true;
	}

	public void enleverSport(int sport) {
		sportsPratiques[sport] = false;
	}

	public int NBSportPratiquer() {
		int nb = 0;
		for (int sport = 0; sport < Sport.NBSport; sport++) {
			if (sportsPratiques[sport]) {
				nb += 1;
			}
		}
		return nb;
	}

	public boolean pratique(int sport) {
		if (sportsPratiques[sport])
			return true;

		return false;
	}

	public String sportsPratiquesToString(int sport) {
		return "" + Sport.nom(sport);
	}

	public int[] sportsPratiques() {
		String Sportprat[] = new String[NBSportPratiquer()];
		int[] res = new int[NBSportPratiquer()];
		int tmp = 0;
		for (int sport = 0; sport < Sport.NBSport; sport++) {
			if (pratique(sport)) {
				res[tmp] = sport;
				System.out.println(sportsPratiquesToString(sport));
				tmp = tmp + 1;
			}
		}
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != getClass())
			return false;

		Individu ind = (Individu) obj;
		return Objects.equals(getNom(), ind.getNom()) && Objects.equals(getPrenom(), ind.getPrenom());
	}

}
