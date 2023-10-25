package hoja1;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero");

		if (entrada.hasNextFloat()) {

			int num = entrada.nextInt();

			if (num >= 1 && num <= 10) {

				System.out.println("El número es " + num);

			} else {

				System.out.println("Ese numero no vale tiene que ser entre"

						+ "1 y el 10");

			}

			if (num == 3) {

				System.out.println("Has acertado");

			}

		}

	}

}