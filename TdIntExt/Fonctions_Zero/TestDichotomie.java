package Fonctions_Zero;

public class TestDichotomie {

	static double zero(Fonction f, double a, double b, double epsilon) {
		if (f.appel(a) > 0) {
			double w = a;
			a = b;
			b = w;
		}
		while (Math.abs(b - a) > epsilon) {
			double c = (a + b) / 2;
			if (f.appel(c) < 0)
				a = c;
			else
				b = c;
		}
		return (a + b) / 2;
	}
}