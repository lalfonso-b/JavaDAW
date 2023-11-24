
package hoja2;

import java.util.Arrays;

// Ordenamos el array de mayor a menor.

public class Ejer09b {

	public static void main(String[] args) {

		int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int posMax = 0;

		int aux = 0;

		System.out.println(Arrays.toString(precios));
		
		for (int i = 0; i < precios.length - 1; i++) {

			posMax = i;

			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] > precios[posMax]) {
					posMax = j;
				}
			}
			
			// ahora, posMin apunta a la posicion del elemento mas pequeño del array
			// System.out.println(posMin + " = posMin");

			// intercambiamos los valores de i (primera posicion sin ordenar en el array) y
			// de posMin
			aux = precios[i];
			precios[i] = precios[posMax];
			precios[posMax] = aux;

			System.out.println(Arrays.toString(precios));
			
		}
		
		

	}

}
