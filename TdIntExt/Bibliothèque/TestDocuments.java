package Bibliothèque;

public class TestDocuments {

	public static void main(String[] args) {
		
		Bibliotheque hexagone = new Bibliotheque();
		hexagone.ajouter(new Manuel(1, "Charles F.B", 3265, 56, "La Cire d'Abeille"));
		hexagone.ajouter(new Revue(6, 2018, 25891, "L'urgence écologique du XXeme"));
		hexagone.ajouter(new Manuel(NiveauxScolaires.CE1, "Aladin", 030201, 147, "La vie"));
		hexagone.ajouter(new Manuel(NiveauxScolaires.CE1, "Peeter", 020103, 852, "Le diable"));
		hexagone.ajouter(new Manuel(NiveauxScolaires.CE2, "Stalker", 010203, 625, "La guerre"));
		hexagone.ajouter(new Roman(PrixLitteraires.GONCOURT, "Song Son yong", 12345, 123, "Le Gros Sportif"));
		hexagone.ajouter(new Manuel(NiveauxScolaires.CM2, "Sting", 010203, 322, "La Musique"));

		System.out.println(hexagone.supprimer(new Manuel(NiveauxScolaires.CE2, "Stalker", 010203, 625, "La guerre"))));
		System.out.println(hexagone.document(0));
		hexagone.afficherAuteurs();
		hexagone.afficherDocuments();
		System.out.println(hexagone.hasDocument(new Manuel(NiveauxScolaires.CE1, "Peeter", 020103, 852, "Le diable")))	
	}
}
