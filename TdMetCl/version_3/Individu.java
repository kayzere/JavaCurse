package version_3;
import java.util.Objects;
import java.util.TreeSet;

public class Individu {
	private String nom, prenom;
	TreeSet<Integer> sportsPratiques;

	public Individu(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.sportsPratiques = new TreeSet<Integer>();
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean pratique(int sport) {
		return sportsPratiques.contains(sport);
	}

	public void ajouterSport(int sport) {
		sportsPratiques.add(sport);
	}

	public void enleverSport(int sport) {
		sportsPratiques.remove(sport);
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
		
		for(int sport :  sportsPratiques)
		 res.append(Sports.nom(sport) + " ");
		
	
		return res.toString();
	}
}
