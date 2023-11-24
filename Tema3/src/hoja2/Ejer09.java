package hoja2;

import java.util.Arrays;

public class Ejer09 {

	public static void main(String[] args) {

		int[] precios = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int posMin = 0;

		int aux = 0;

		System.out.println(Arrays.toString(precios));
		
		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] < precios[posMin]) {
					posMin = j;
				}
			}
			
			// ahora, posMin apunta a la posicion del elemento mas pequeño del array
			// System.out.println(posMin + " = posMin");

			// intercambiamos los valores de i (primera posicion sin ordenar en el array) y
			// de posMin
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

			System.out.println(Arrays.toString(precios));
		}
		
		

	}

}
