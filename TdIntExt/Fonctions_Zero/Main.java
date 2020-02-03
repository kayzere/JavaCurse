package Fonctions_Zero;

public class Main {

	public static void main(String[] args) {
		Fonction cosinus = new Cosinus();
		Fonction xCarreMoins4 = new xCarreMoins4();
		System.out.println(TestDichotomie.zero(xCarreMoins4, 4, 0, 1e-13));
		System.out.println(TestDichotomie.zero(cosinus, 0, Math.PI, 1e-13));
		

		
	}

}
