package hoja3Bucles;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que invente un nº aleatorio entre 1 y 10. El usuario
		 * tendrá que adivinarlo en tres intentos como máximo. Al finalizar el programa
		 * se le dirá si ha acertado el número y en cuántos intentos lo ha hecho.
		 * Utiliza while y break
		 *
		 */

		Scanner escaner = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 10 + 1);
		int intentos = 1;
		int num = 0;
		boolean acertado = false;

		System.out.println(randomNum);

		// Bucle while que se ejecutará 3 veces (tres intentos).
		while (intentos <= 3) {

			System.out.println("Adivina el número");
			num = escaner.nextInt();

			// Vemos si el número es el correcto.
			if (num == randomNum) {
				acertado = true;
				break;
			}

			intentos++;
		}

		// Indicamos el resultado.
		if (acertado == true) {
			System.out.println("Acertaste.");
			System.out.println("Intentos usados = " + intentos);
		} else {
			System.out.println("Fallaste, el número era " + randomNum);
		}

		escaner.close();
	}
}