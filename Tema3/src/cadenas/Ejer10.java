package cadenas;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase");
		String frase = entrada.nextLine();

		int numPalabras = 1;
		int posEspacio = frase.indexOf(" ", 0);

		while (posEspacio != -1) {

			numPalabras++;
			posEspacio = frase.indexOf(" ", posEspacio + 1);

		}

		System.out.println("La frase tiene " + numPalabras + " palabras.");

	}

}
