package Bibliothèque;

import java.util.Objects;

public class Document {

	private int NumeroEnregistrement;
	private String titre;

	public Document(int NumeroEnregistrement, String titre) {
		this.NumeroEnregistrement = NumeroEnregistrement;
		this.titre = titre;
	}

	public String toString() {
		return "Numéro d'enregistrement : " + NumeroEnregistrement + "\n" + "Titre : " + titre + "\n";
	}

	public String getTitre() {
		return titre;
	}

	public int getNumeroEnregistrement() {
		return NumeroEnregistrement;
	}

	@Override 
		public boolean equals(Object object) {
			if (o == null || object.getClass() != getClass())
				return false;
			Document doc = (Document) object;
			return Objects.equals(getTitre(), doc.getTitre())
					&& Objects.equals(getNumeroEnregistrement(), doc.getNumeroEnregistrement());
		}

}
