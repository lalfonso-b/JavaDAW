package hoja2Bucles;

import java.util.Scanner;

public class Ejer20b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Te voy a mostrar las diez primeras potencias del número 2");

		int potencia = 2;
		for (int i = 1; i <= 10; i++) {

			System.out.println(potencia);
			potencia = potencia * 2;

		}

	}

}