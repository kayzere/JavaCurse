package version_1;

import java.lang.reflect.Member;

public class main {

	public static void main(String[] args) {
		
		Sport sport = new Sport();
		Individu ind = new Individu("Jack", "reacher");
		ind.ajouterSport(Sport.TENNIS);	ind.ajouterSport(Sport.RUGBY); ind.ajouterSport(Sport.BASKET);
		Individu ind1 = new Individu("Jack", "reacher");
		Individu ind2 = new Individu("Jacky", "reachery");
		
		System.out.println("Est ce qu'il fait du sport = " + ind.pratique(Sport.RUGBY));
		System.out.println(ind.NBSportPratiquer());
		for (int sportind = 0 ; sportind < ind.NBSportPratiquer(); sportind++) 
			System.out.println(Sport.nomV2(ind.sportsPratiques()[sportind]));
		Club club = new Club("CCI");
		Club club1 = new Club("HCI");

		club.ajouterMembre("Jack","reacher");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher6");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher200");
		club.ajouterMembre("Jack","reacher");
		club.ajouterMembre("Jack1", "reacher1");
		club.ajouterMembre("Jack2", "reacher1");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher6");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher6");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher20");
		club.ajouterMembre("Jack","reacher");
		club.ajouterMembre("Jack1", "reacher1");
		club.ajouterMembre("Jack2", "reacher1");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher6");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher6");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack6", "reacher200");
		club.ajouterMembre("Jack","reacher");
		club.ajouterMembre("Jack1", "reacher1");
		club.ajouterMembre("Jack2", "reacher1");
		club.ajouterMembre("Jack3", "reacher1");
		club.ajouterMembre("Jack4", "reacher1");
		club.ajouterMembre("Jack", "reacher");

		System.out.println(club.trouverMembre("jack", "reacher"));
		club.lister();
		club1.lister();
		System.out.println(club.getMaxMembre());		
	}			
}
