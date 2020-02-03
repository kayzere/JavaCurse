package Bibliothèque;

public class Dictionnaire extends Document {
	
	private String langue;
	
	public Dictionnaire(String langue, int NumeroEnregistrement, String titre) {
		super(NumeroEnregistrement, titre);
		this.langue = langue;
	}
	
	public String toString() {
		return super.toString() + 
				"Langue : " + langue+ "\n";
		}
	
	public String getLangue() {
		return langue;
	}

}
