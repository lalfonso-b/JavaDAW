package hoja2Bucles;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int dividendo, divisor, resultado;

		System.out.println("Escribe dos números enteros");

		System.out.print("Dividendo: ");
		dividendo = entrada.nextInt();

		System.out.print("Divisor: ");
		divisor = entrada.nextInt();

		if (dividendo < divisor) {
			System.out.println("El dividendo debe ser mayor o igual " 
					+ "al divisor.");
			
		} else {
			resultado = dividendo - divisor;

			System.out.println(dividendo + " - " + divisor + " = " 
					+ resultado);

			dividendo = resultado;

			while (resultado >= divisor) {

				resultado = dividendo - divisor;

				System.out.println(dividendo + " - " + divisor 
						+ " = " + resultado);

				dividendo = resultado;

			}

			System.out.println("Resto: " + resultado);
		}

	}

}