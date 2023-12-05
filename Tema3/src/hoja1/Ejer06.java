package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida por consola los precios de diez productos y los
		 * guarde en un array. Haz que después se muestren todos los valores mediante un
		 * bucle for.
		 */

		Scanner escaner = new Scanner(System.in);
		double[] precios = new double[10];

		for (int i = 0; i < 10; i++) {

			System.out.println("Ingresa el precio del producto " + (i + 1) + ": ");
			precios[i] = escaner.nextDouble();

		}

		System.out.println("La lista de precios es la siguiente: ");
		for (int j = 0; j < precios.length; j++) {
			System.out.println("Precio art." + (j + 1) + " = " + precios[j] + "$");
		}

		escaner.close();
	}

}