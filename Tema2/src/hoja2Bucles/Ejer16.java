package hoja2Bucles;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int random = (int) (Math.random() * 10 + 1);

		System.out.println(random);

		int num;
		int i = 0;

		do {

			System.out.println("Adivina el número entre 1 y 10.");
			num = entrada.nextInt();

			i++;

		} while (num != random && i < 3);

		if (num == random) {
			System.out.println("¡Correcto!");
		} else {
			System.out.println("Has fallado, el número era " + random);
		}

	}

}