package hoja2Bucles;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Te voy a mostrar las diez primeras potencias del número 2");

		double potencia;
		int potenciaEntera;
		for (int i = 1; i <= 10; i++) {

			potencia = Math.pow(2, i);
			potenciaEntera = (int) potencia;
			System.out.println(potenciaEntera);

		}

	}

}