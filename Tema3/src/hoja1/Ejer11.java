package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] ordenes = new String[1000];

		System.out.println("Órdenes que debe seguir el robot.");
		
		int i = 0;
		while (i < ordenes.length) {
			System.out.println("\nOrden:");
			ordenes[i] = entrada.nextLine();

			if (ordenes[i].equals("ejecutar")) {
				break;
			}
			i++;
		}
		
		i = 0;
		System.out.println("Las órdenes son: ");
		while (i < ordenes.length) {

			if (ordenes[i].equals("ejecutar")) {
				break;
			}
			System.out.println(ordenes[i]);
			i++;
		}

	}

}