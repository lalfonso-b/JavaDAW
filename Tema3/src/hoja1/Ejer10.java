package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		double[] compra = new double[100];

		Scanner sc = new Scanner(System.in);

		System.out.println("=== PÁGINA DE COMPRA ===");

		System.out.println("\nInserte precio del producto:");

		for (int i = 0; i < compra.length; i++) {

			System.out.println("Articulo " + (i + 1));

			compra[i] = sc.nextDouble();

			if (compra[i] == 0) {

				System.out.println("\nGracias por comprar :)");
				break;

			}

		}

		System.out.println("\nTus artículos son: ");

		for (int i = 0; i < compra.length; i++) {

			if (compra[i] == 0) {
				break;
			}

			System.out.println(compra[i]);

		}

		sc.close();

	}

}