package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] estaturas = new double[10];

		System.out.println("Introduce las estaturas: ");

		for (int i = 0; i < estaturas.length; i++) {

			System.out.println("Estatura " + (i + 1));
			estaturas[i] = sc.nextDouble();

		}

		for (int i = 0; i < estaturas.length; i++) {

			if (estaturas[i] > 1.90) {

				System.out.println("\nSe ha encontrado una estatura de " + "más de 1'90");
				break;

			}

		}

		sc.close();

	}

}