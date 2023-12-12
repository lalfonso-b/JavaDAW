package hoja1;
/*
* Escribe una aplicación que pida al usuario diez precios de productos.
* Después devolverá el precio total a pagar y el número
* de productos cuyo precio sea mayor de 10 euros
*/

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] precios = new double[10];

		double suma = 0;
		int mayoresDiez = 0;

		System.out.println("Bienvenido, inserte precio:");
		System.out.println("===============================");

		for (int i = 0; i < precios.length; i++) {

			System.out.println("\nPrecio");
			precios[i] = sc.nextDouble();

			suma += precios[i];

			if (precios[i] > 10) {
				mayoresDiez++;
			}

		}

		System.out.println("Precio total a pagar: " + suma + " euros.");
		System.out.println("Hay " + mayoresDiez 
				+ " productos de más de 10 euros.");
		System.out.println("\nHa abandonado la aplicacion.");

		sc.close();

	}

}