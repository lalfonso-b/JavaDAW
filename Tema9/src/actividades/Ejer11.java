package actividades;

public class Ejer11 {

	public static void main(String[] args) {

		double[] decimales = { 1.1, 7.2, 3.3, 4.4, 6.5 };

		double max = max(decimales, decimales.length);

		System.out.println("El máximo del array es: " + max);

	}

// private static double max(double[] numeros, double numElementos) {

//

//

//

// if (numElementos == 1) {

//

// return numeros[0];

//

// }

//

// // Caso recursivo.

//

// return Math.max(max(numeros, numElementos - 1), numeros[(int) (numElementos - 1)]);

//

// }

	private static double max(double[] numeros, int numElementos) {

		// Caso base.
		if (numElementos == 1) {

			return numeros[0];

		}

		// Caso recursivo.
		return mayor(max(numeros, numElementos - 1), numeros[(numElementos - 1)]);

	}

	private static double mayor(double a, double b) {

		// Return si a es mayor que b devuelve a si no ( : ) devuele b.

		return a > b ? a : b;

	}

}