package hoja2Bucles;

public class Ejer22 {

	public static void main(String[] args) {

		/*
		 * Tabla del 1 Tabla del 2 Tabla del 3 ... Tabla del 10
		 */

		// Bucle que muestra las 10 primeras tablas de
		// multiplicar.
		for (int i = 1; i <= 10; i++) {

			// Mostramos la tabla del nº i.
			System.out.println("\nTabla del " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}

		}

	}

}
