package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Mostramos nuestro nombre tantas veces como indique el usuario.
		// Antes del nombre se muestra también el número de repetición.

		System.out.println("¿Cuántas veces quieres que escriba tu nombre?");
		int repeticiones = entrada.nextInt();

		int contador = 1;
		while (contador <= repeticiones) {
			System.out.println(contador + " - Carlos");
			contador++;
		}

		System.out.println("\nDe nada.");

	}

}
