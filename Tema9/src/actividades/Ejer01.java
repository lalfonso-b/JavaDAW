package actividades;

public class Ejer01 {

	public static void main(String[] args) {

		int num = 6;

		System.out.println("El número " + num + " pasado a binario es " + transforma(num));

	}

	private static String transforma(int n) {

		if (n > 1) {
			// Caso recursivo.
			return transforma(n / 2) + n % 2;
		} else if (n == 1 || n == 0) {
			// Caso base
			return "" + n;
		} else {
			return "ERROR";
		}

	}

}
