package actividades;

public class Ejer07b {

	public static void main(String[] args) {

		int n = 12345;

		System.out.println(invertir(n));

	}

	public static String invertir(int n) {

		if (n < 10) {

			return String.valueOf(n);

		} else {

			return String.valueOf(n % 10) + invertir(n / 10);

		}

	}

}