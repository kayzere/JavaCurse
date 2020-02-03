package version_2;
import java.util.Objects;

public class Individu {
	private String nom, prenom;
	private boolean[] sportsPratiques;

	public Individu(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.sportsPratiques = new boolean[Sports.NB_SPORTS];
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean pratique(int sport) {
		return sportsPratiques[sport];
	}

	public void ajouterSport(int sport) {
		sportsPratiques[sport] = true;
	}

	public void enleverSport(int sport) {
		sportsPratiques[sport] = false;
	}

	public int nbSportsPratiques1() {
		int res = 0;

		for (int pos = 0; pos < sportsPratiques.length; pos++) {
			boolean pratique = sportsPratiques[pos];
			if (pratique)
				res++;
		}

		return res;
	}

	public int nbSportsPratiques() {
		int res = 0;

		for (boolean pratique : sportsPratiques)
			res += pratique ? 1 : 0;

		return res;
	}

	public int[] sportsPratiques() {
		int res[] = new int[nbSportsPratiques()];
		int posInsertion = 0;

		for (int pos = 0; pos < sportsPratiques.length; pos++) {
			boolean pratique = sportsPratiques[pos];
			if (pratique) {
				res[posInsertion] = pos;
				posInsertion++;
			}
		}

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj.getClass() != getClass())
			return false;

		Individu ind = (Individu) obj;

		return Objects.equals(getNom(), ind.getNom()) && Objects.equals(getPrenom(), ind.getPrenom());
	}
	
	@Override
	public String toString() {
		StringBuffer res = new StringBuffer();
		
		res.append(getNom());
		res.append(" ");
		res.append(getPrenom());
		
		res.append(" sports : ");
		
		for(int sport :  sportsPratiques())
		 res.append(Sports.nom(sport) + " ");
		
	
		return res.toString();
	}
}
