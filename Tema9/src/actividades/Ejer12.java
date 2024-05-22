package actividades;

public class Ejer12 {

	public static void main(String[] args) {

		char[] ejemplo1 = { 'A', 'L', 'F', 'A' };
		char[] ejemplo2 = { 'A', 'L', 'B' };
		char[] ejemplo3 = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V', 'I', 'L', 'L', 'A' };

		System.out.println("\nEjemplo01: " + esPalindromo(ejemplo1, 0, ejemplo1.length - 1));

		System.out.println("Ejemplo02: " + esPalindromo(ejemplo2, 0, ejemplo2.length - 1));

		System.out.println("Ejemplo03: " + esPalindromo(ejemplo3, 0, ejemplo3.length - 1));

	}

	private static boolean esPalindromo(char[] frase, int inicio, int fin) {

		// Caso base
		if (inicio >= fin) {

			return true;

		}

		// Caso recursivo.
		if (frase[inicio] == frase[fin]) {

			return esPalindromo(frase, inicio + 1, fin - 1);

		} else {

			return false;

		}

	}

}