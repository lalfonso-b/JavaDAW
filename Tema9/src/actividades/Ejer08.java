package actividades;

/*
8.- Escribe un método int sumar(int n) que sume las cifras del número que se le pasa como parámetro.

Por ejemplo:

	Si n = 456, entonces sumar(456) = 4 + 5 + 6 = 15

Ayuda: Puedes aplicar las operaciones módulo (n%10) y división (n/10) para descomponer el número.
 */
public class Ejer08 {

	public static void main(String[] args) {

		System.out.println(sumar(613));

	}

	private static int sumar(int n) {

		if (n == 0) {

			// Caso base
			return n;

		}

		// Caso Recursivo
		return n % 10 + sumar(n / 10);

	}

}