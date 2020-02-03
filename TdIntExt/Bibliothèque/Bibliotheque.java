package Bibliothèque;

import java.util.Vector;

public class Bibliotheque {
	
	private Vector<Document> documents;
	
	public Bibliotheque() {
		this.documents = new Vector<Document>();
	}
	
	public Vector<Document> getDocuments() {
		return documents;
	}
	
	int getNbrDocs() {
		return getDocuments().size();
	}

	public Document document(int index) {
		return getDocuments().get(index);
	}
	
	public boolean DocumentExist(Document doc) {
		return getDocumentIndex(doc) != -1;
	}
	
	public int getDocumentIndex(Document doc) {
		for (int index = 0; index < getDocuments().size(); index++)
			if (getDocuments().get(index).equals(doc))
				return index;
		return -1;
	}
	
	public boolean ajouter(Document doc) {
		if (DocumentExist(doc))
			return false;
		getDocuments().add(doc);
		return true;
	}

	public boolean supprimer(Document doc) {
		if (DocumentExist(doc)) {
			getDocuments().remove(getDocumentIndex(doc));
			return true;
		}
		return false;
	}
	
	void afficherDocuments() {
		System.out.println("La bibliothèque contient les livres suivant:");
		for (Document doc : getDocuments())
			System.out.println(doc);			
	}

	void afficherAuteurs() {
		System.out.println("La bibliothèque contient les auteurs suivant:");
		for (Document doc : getDocuments())
			if (doc instanceof Livre)
				System.out.println(((Livre) doc).getAuteur());
	}


}
