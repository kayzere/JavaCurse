package Calculs;

public class TestExpression {

	public static void main(String[] args) {
		Expression f =
		new Addition(
		new Multiplication(new Constante(2),new Sinus(new Variable())),
		new Multiplication(new Constante(3),new Cosinus(new Variable()))
		);
		double[] tab = { 0, 0.1, 1.7, 1.9, 2, 2.5 };
		for (int index = 0; i < tab.length; index++) {
		double x = tab[index];
		System.out.println("f(" + x + ") = " + f.valeur(x));
		}

		
	}

}
