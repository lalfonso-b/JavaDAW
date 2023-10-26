package hoja1Condicionales;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿ Precio del producto ?");
		float precio = entrada.nextFloat();

		if (precio > 80) {
			System.out.println("Se aplicará un 10% de descuento.");
			precio = precio - precio * 0.1F;

		}

		System.out.println("Precio final: " + precio + " €.");

	}

}
