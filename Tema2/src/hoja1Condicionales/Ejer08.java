package hoja1Condicionales;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se dice en inglés ordenador?");
		String palabra = entrada.nextLine();
		
		// Pasamos palabra a minúsculas.
		palabra = palabra.toLowerCase();

		if (palabra.equals("computer")) {

			System.out.println("Felicidades, has acertado.");

		} else {

			System.out.println("Lo siento, inténtalo de nuevo.");

		}

		entrada.close();

	}

}