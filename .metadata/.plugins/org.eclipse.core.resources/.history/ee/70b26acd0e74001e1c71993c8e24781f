package hoja1;
// Crea un programa que pida un número entero por teclado, entre 1 y 10.

// Si el usuario escribe un número entero, se escribirá su valor en pantalla.
// Si lo que escribe no es un entero, se mostará un mensaje de error.

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ESCRIBE UN NÚMERO ENTRE 1 Y 10");
		int num = 0;

		if (sc.hasNextInt()) {
			num = sc.nextInt();
			if (num >= 1 && num <= 10) {
				System.out.println("Tu número es: " + num);
			} else {
				System.out.println("Ponlo entre 1 y 10");
			}
		} else {
			System.out.println("Torpe");
		}

		sc.close();
	}

}