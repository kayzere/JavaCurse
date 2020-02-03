package Journal_Evenements;

import java.util.Scanner;

public class TestJournal {

	static boolean correctStart(String entre) {
		return entre.startsWith("+") || entre.startsWith("?");
	}
	
	static boolean firstCharIsSpace(String entre) {
		return entre.startsWith(" ");
	}

	static String retrieveText(String entre) {
		entre = entre.substring(1);
		if (firstCharIsSpace(entre))
			entre = entre.substring(1);
		return entre;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String entre;

		Journal journal = new Journal();

		String prompt = "+ Le texte: ajouter l'evenement en question \n?: lister les évenements \n? chaine: lister evenements contenant les chaine \n* : programme fini";
			
		do {
			System.out.println(prompt);
			entre = scanner.nextLine();
			
			if (!TestJournal.correctStart(entre))
				continue;
			
			if (entre.startsWith("+")) {
				entre = TestJournal.retrieveText(entre);
				if (entre.length() > 0)
					journal.ajouter(entre);
				else
					System.out.println("ajoutez du texte +\n");
			}
			if (entre.startsWith("?")) {
				if (entre.length() == 1)
					System.out.println(journal);
				else {
					entre = TestJournal.retrieveText(entre);
					if (entre.length() > 0)
						System.out.println(journal.toString(entre));
					else
						System.out.println("ajoutez du texte ?\n");
				}
			}
		} while (!entre.startsWith("*"));

		System.out.println("programme fini");

		scanner.close();
	}

}
