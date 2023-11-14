package hoja1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];

		int cont = 0;

		while (cont < notas.length) {

			System.out.print("Nota " + (cont + 1) + ": ");

			notas[cont] = entrada.nextDouble();

			cont++;

		}

		
		cont = 0;
		
		System.out.println("\nNotas registradas:");
		while (cont < notas.length) {

			System.out.println(notas[cont]);

			cont++;

		}

		entrada.close();

	}

}