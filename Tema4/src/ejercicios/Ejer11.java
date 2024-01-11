package ejercicios;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un año y te diré si es bisiesto:");
		int anyo = entrada.nextInt();

		if (esBisiesto(anyo)) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		}
	}

	static boolean esBisiesto(int anyo) {
		return false;
	}
}
