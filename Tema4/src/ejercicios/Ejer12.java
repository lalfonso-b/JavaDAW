package ejercicios;

import java.util.Arrays;

public class Ejer12 {
	public static void main(String[] args) {
		/*
		 * Desarrolla un método que tome un array de números enteros y lo muestre
		 * ordenado.
		 */

		int[] edades = { 2, 5, 2, 7, 4, 3 };

		System.out.println("Array antes de ordenar: \n" + Arrays.toString(edades));

		ordenarArray(edades);

	}

	static void ordenarArray(int[] arrayEdades) {

		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < arrayEdades.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < arrayEdades.length; j++) {

				if (arrayEdades[j] < arrayEdades[posMin]) {
					posMin = j;
				}
			}

			aux = arrayEdades[i];
			arrayEdades[i] = arrayEdades[posMin];
			arrayEdades[posMin] = aux;
		}

		System.out.println("Array despues de llamar al método: \n" + Arrays.toString(arrayEdades));
	}
}