package prac1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palabra;

		do {

			System.out.println("Escribe una palabra para que la repita 5 veces.");
			palabra = entrada.nextLine();

			palabra = palabra.toUpperCase();

			for (int i = 1; i <= 5; i++) {

				System.out.println(palabra);

			}

		} while (!palabra.equals("STOP"));

	}

}