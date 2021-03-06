package Disques_Anneaux;

import java.io.ObjectInputStream.GetField;

public class Disque {

	private double x;
	private double y;
	private double r;

	public Disque(double x, double y, double r) {
		this.x = x;
		this.r = r;
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Centre(" + getX() + "," + getY() + "), Rayon = " + getR();
	}

	@Override
	public boolean equals(Object object) {
		if (object != null && object instanceof Disque) {
			Disque disque = (Disque) object;
			return getR() == disque.getR() && getY() == disque.getY() && getX() == disque.getX();
		}
		return false;
	}

	public void translate(double a, double b) {
		this.x += a;
		this.y += b;
	}

	public double aire() {
		return Math.PI * getR() * getR();
	}

}
