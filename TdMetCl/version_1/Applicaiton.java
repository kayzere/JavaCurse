package version_1;

public class Applicaiton {

	public static void main(String[] args) {
		Club clubfumeur = new Club("Les fumeurs repentis");
		Individu[] LesSportif = new Individu[7];
		LesSportif[0]= new Individu("Skok", "Mathieu");   
		LesSportif[1] = new Individu("Thierry", "Guette"); 
		LesSportif[2] = new Individu("Izard", "Lloyd");    
		LesSportif[3] = new Individu("Laidaoui", "Bilal"); 
		LesSportif[4] = new Individu("Kaoubi", "Nabil"); 
		LesSportif[5] = new Individu("Corne", "Rémi"); 
		LesSportif[6] = new Individu("Chelalou", "Ghiles");   

		for (int index=0 ; index < LesSportif.length; index++) {
			clubfumeur.ajouterMembre(LesSportif[index].getNom(),LesSportif[index].getPrenom());
		}
		
		for (int index=0 ; index < LesSportif.length; index++) {
			clubfumeur.trouverMembre(LesSportif[index].getNom(), LesSportif[index].getPrenom()).ajouterSport(1);
			clubfumeur.trouverMembre(LesSportif[index].getNom(), LesSportif[index].getPrenom()).ajouterSport(3);
		}
		for (int index=0 ; index < LesSportif.length; index=index+2) {
			clubfumeur.trouverMembre(LesSportif[index].getNom(), LesSportif[index].getPrenom()).ajouterSport(4);
			clubfumeur.trouverMembre(LesSportif[index].getNom(), LesSportif[index].getPrenom()).ajouterSport(2);
			clubfumeur.trouverMembre(LesSportif[index].getNom(), LesSportif[index].getPrenom()).ajouterSport(0);		
		}
		System.out.println("ahhhh");
		clubfumeur.lister();
		System.out.println(clubfumeur.trouverMembre(LesSportif[1].getNom(), LesSportif[1].getPrenom()).sportsPratiques());
		System.out.println("ahhhh");
		
		clubfumeur.trouverMembre(LesSportif[5].getNom(), LesSportif[5].getPrenom());
		
	}

}
