package actividades;

public class Ejer02 {

	public static void main(String[] args) {

		int num = 32;

		System.out.println("El número " + num + " pasado a binario es " + transforma(num));

	}

	private static String transforma(int n) {

		String resultado = "";

		if (n < 0) {
			return "ERROR";
		} else if (n == 0) {
			return "0";
		}

		while (n > 0) {

			resultado = n % 2 + resultado;
			n = n / 2;

		}

		return resultado;

	}

}
