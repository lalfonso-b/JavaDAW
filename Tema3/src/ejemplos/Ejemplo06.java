package ejemplos;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] tallas = { 37, 40, 40.5, 39, 43, 45, 47, 41, 40 };

		// Leemos una talla desde la terminal.
		System.out.println("Indique una talla y le diré si está en el " + "array:");
		double talla = entrada.nextDouble();

		boolean encontrado = false;

		// Buscamos si la talla se encuentra. Si está, diremos en qué
		// posición y si no, lo indicaremos.
		int i;
		for (i = 0; i < tallas.length; i++) {

			if (tallas[i] == talla) {
				encontrado = true;
				break;
			}

		}

		if (encontrado) {
			System.out.println("Tu talla se encuentra en la posición " + i + ".");
		} else {
			System.out.println("Tu talla no se ha encontrado.");
		}

	}

}
