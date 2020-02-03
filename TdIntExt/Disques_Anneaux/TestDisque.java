package Disques_Anneaux;

public class TestDisque {

	public static void main(String[] args) {

		Disque disque = new Disque(2, 7, 10);
		Disque disque2 = new Disque(1, 6, 10);
		System.out.println(disque);
		System.out.println(disque.equals(disque2));
		
		disque.translate(5, 9);
		System.out.println(disque);
		System.out.println(disque.aire());
		
		Couronne couronne = new Couronne(1, 8, 10, 3);
		Couronne couronne2 = null;
		Couronne couronne3 = new Couronne(3, 6, 9, 1);

		System.out.println(couronne.equals(couronne2));
		System.out.println(couronne.equals(couronne3));
		Disque disque3 = (Disque) couronne;
		
		System.out.println(disque3.getClass());
		System.out.println(couronne);
		couronne.translate(2, 7);
		System.out.println(couronne);
		System.out.println(couronne.aire() == new Disque(0, 0, 9).aire() - new Disque(0, 0, 2).aire());
	
	}

}
