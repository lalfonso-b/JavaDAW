package hoja2Bucles;

public class Ejer11 {

	public static void main(String[] args) {

		System.out.println("A continuación se escribirán todos los " + "múltiplos del 5\n que estén entre 1 y 1000:");

		int mult = 5;

		while (mult <= 1000) {
			System.out.println(mult);
			mult += 5;
		}

	}

}