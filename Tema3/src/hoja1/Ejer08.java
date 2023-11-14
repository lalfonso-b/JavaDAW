package hoja1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];

		System.out.println("Introduce las notas: ");

		int i = 0;
		int j = 0;

		while (i < notas.length) {

			System.out.println("Nota: ");
			notas[i] = entrada.nextDouble();

			if (notas[i] < 0) {

				System.out.println("No se permiten números negativos.");
				break;

			}

			i++;

		}

		while (j < notas.length) {

			if (notas[j] < 0) {
				continue;
			}

			System.out.println("Nota: " + notas[j]);

			j++;

		}

	}

}