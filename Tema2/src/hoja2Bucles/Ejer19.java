package hoja2Bucles;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precio = 0;
		double precioTotal = 0;

		for (int i = 1; i <= 4; i++) {

			System.out.println("Dime el precio de 4 productos");
			precio = entrada.nextDouble();
			
			precioTotal = precioTotal + precio;

		}

		System.out.println("\nPrecio total: " + precioTotal + " euros.");

	}

}