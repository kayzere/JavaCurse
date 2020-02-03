package Disques_Anneaux;

public class Couronne extends Disque {
	
	private Disque disqueInterieur;
	public Couronne(double x, double y, double r1, double r2) {
		super(x, y, r1);
		this.disqueInterieur = new Disque(x, y, r2);
	}

	public Disque getDisqueInterieur() {
		return disqueInterieur;
	}
	
	public String toString() {
		return super.toString() + ", rayon centre = " + getDisqueInterieur().getR();
	}
	
	@Override
	public boolean equals(Object unObject) {
		if (unObject instanceof Couronne) {
			Couronne uneCourone = (Couronne) unObject;
			return super.equals(unObject) && getDisqueInterieur().equals(uneCourone.getDisqueInterieur());
			}
		return false;
	}
	
	@Override
	public double aire() {	
		return super.aire() - getDisqueInterieur().aire();
	}
	
	
}
