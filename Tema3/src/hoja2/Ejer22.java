package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] datos = new String[3][4];

		// Declaramos la variable media para mas tarde usarla
		double media = 0;

		System.out.println("\nIntroducción de notas");
		System.out.println("=================================");

		// Pedimos los datos que nos reclama el ejercicio y
		// los guardamos en sus respectivas posiciones
		for (int fila = 0; fila < datos.length; fila++) {

			System.out.print("Nombre: ");
			datos[fila][0] = sc.nextLine();

			System.out.print("Exámenes: ");
			datos[fila][1] = sc.nextLine();

			System.out.print("Trabajos: ");
			datos[fila][2] = sc.nextLine();

			System.out.print("Actitud: ");
			datos[fila][3] = sc.nextLine();

		}

		// Mostramos la tabla.

		System.out.println("\nNota de evaluación");
		System.out.println("=================================");
		for (int fila = 0; fila < datos.length; fila++) {

			// Mostramos la fila en la que estamos.
			// System.out.println("\nNombre: " + datos[fila][0] + "\nExámenes: " +
			// datos[fila][1] + "\nTrabajos: "
			// + datos[fila][2] + "\nActitud: " + datos[fila][3]);

			media = (50 * Double.parseDouble(datos[fila][1]) + 40 * Double.parseDouble(datos[fila][2])
					+ 10 * Double.parseDouble(datos[fila][3])) / 100;

			System.out.println(datos[fila][0] + ":" + media);
		}

		sc.close();
	}

}