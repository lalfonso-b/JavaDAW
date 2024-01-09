package cadenas;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te genero su acrónimo:");
		String frase = entrada.nextLine();

		// Separamos la frase en palabras sueltas guardadas en un array.
		String[] palabras = frase.split(" ");

		// Formamos una cadena con la primera letra de cada palabra.
		String acronimo = "";
		for (int i = 0; i < palabras.length; i++) {
			acronimo = acronimo + palabras[i].charAt(0);
		}

		// Pasamos esa cadena a mayúsculas.
		acronimo = acronimo.toUpperCase();

		System.out.println("Acrónimo: " + acronimo);

	}

}
