package actividades;

public class Ejer07 {

	public static void main(String[] args) {

		int n = 456789;

		System.out.println(invertir(n));

	}

	private static String invertir(int n) {

		if (n > 0) {

			// Caso recursivo:
			return "" + n % 10 + invertir(n / 10);
		}

		// Caso base (n=0):
		return "";

	}

}