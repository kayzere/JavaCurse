package version_2;

public class MainSport {

	public static void main(String[] args) {
		System.out.println(Sports.nom(Sports.FOOT));
		
		Individu sportif = new Individu("Toto", "Tata");
		
		System.out.println(sportif);
		
		sportif.ajouterSport(Sports.FOOT);
		
		System.out.println(sportif);
		
		
		
		Club cciClub = new Club("Cci CLub");

		cciClub.ajouterMembre("n1", "p1");
		cciClub.ajouterMembre("n2", "p2");
		
		
		cciClub.lister();
		
		cciClub.trouverMembre("n1", "p1").ajouterSport(Sports.FOOT);
		cciClub.trouverMembre("n1", "p1").ajouterSport(Sports.TENNIS);
		cciClub.trouverMembre("n2", "p2").ajouterSport(Sports.TENNIS);
		
		
		cciClub.lister();
	}

}
