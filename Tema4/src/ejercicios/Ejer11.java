package ejercicios;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un año y te diré si es bisiesto:");
		int anyo = sc.nextInt();

		if (esBisiesto(anyo)) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		}
		sc.close();
	}

	static boolean esBisiesto(int anyo) {

		if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}
}
