package hoja2;

import java.util.Scanner;

/*
Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por consola y los vaya guardando en un array 
llamado nombres. La aplicación terminará de pedir palabras cuando el usuario escriba "nadie". A continuación revisará el array y 
averiguará si se ha introducido el nombre "Calderón". Si es así escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". 
Utiliza una variable semáforo llamándola nombreEncontrado.
*/
public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[10];

		// Leemos la lista de 10 nombres.

		System.out.println("Escriba hasta diez nombres. Puede terminar la escritura antes escribiendo \'nadie\'.\n");
		for (int i = 0; i < nombres.length; i++) {

			System.out.print("Nombre: ");
			nombres[i] = entrada.nextLine();

			// Si se escribe la palabra "nadie", paramos de preguntar.
			if (nombres[i].equals("nadie")) {
				break;
			}
		}

		// Revisamos el array buscando la palabra "Calderón".
		boolean nombreEncontrado = false;
		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].equals("nadie")) {
				break;
			} else if (nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
			}

		}

		// Indicamos si se ha encontrado la palabra "Calderón".
		if (nombreEncontrado) {
			System.out.println("de la Barca.");
		} else {
			System.out.println("Nombre no encontrado.");
		}

	}
}
