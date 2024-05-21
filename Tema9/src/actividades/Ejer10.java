package actividades;

public class Ejer10 {

	public static void main(String[] args) {

		int numeros[] = { 10, 20, 3, 1, 1, 1, 1, 3 };

		System.out.println(multiplicar(numeros, numeros.length));

	}

	private static int multiplicar(int lista[], int n) {

		// Comprobamos que n no es mayor que el número de elementos del array.
		if (n > lista.length) {

			System.out.println("No puede acceder a un valor que no existe.");

			System.exit(0);

		}

		// Caso recursivo.
		if (n > 0) {
			return lista[n - 1] * multiplicar(lista, n - 1);
		}

		// Caso base.
		return 1;

	}

}