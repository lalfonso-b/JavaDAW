package hoja1Condicionales;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("*** TIENDA ***");
		System.out.println("Dime el precio del producto?");

		double precio = entrada.nextDouble();

		if (precio > 80) {
			precio = precio - precio * 10 / 100;
			System.out.println("Se ha aplicado un descuento del 10%");
		}

		if (precio < 5) {
			precio = precio + 2;
			System.out.println("Se han sumado 2€ por gastos de gestión");
		}

		System.out.println("El precio final es " + precio + "€");
		System.out.println("FIN DE LA COMPRA");
	}
}