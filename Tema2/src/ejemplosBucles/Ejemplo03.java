package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		// Mostramos nuestro nombre tantas veces como indique el usuario.

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuántas veces quieres que escriba tu nombre?");
		int repeticiones = entrada.nextInt();

		int contador = 1;
		while (contador <= repeticiones) {
			System.out.println("Carlos");
			contador++;
		}
		
		System.out.println("\nDe nada.");

	}

}
