package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Bucle infinito que pregunte nombres sin parar.
		String nombre;

		// Cuando queramos escribir un bucle infinito, usaremos
		// while(true){...}
		while (true) {
			System.out.print("Escribe un nombre: ");
			nombre = entrada.nextLine();

			if (nombre.equals("")) {
				break;
			}
		}

	}

}
