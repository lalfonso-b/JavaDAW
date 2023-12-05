package hoja2;

import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que pregunte las temperaturas de las últimas 
ocho horas y las muestre ordenadas de menor a mayor, usando el 
método de selección. Al final también indicará la temperatura 
menor y la mayor.
*/
public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] temperaturas = new float[8];

		// Leemos las temperaturas.

		System.out.println("Introduce las temperaturas de las últimas " + "ocho horas, por favor:");

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura " + i + ": ");
			temperaturas[i] = entrada.nextFloat();
		}

		// Ordenamos las temperaturas de menor a mayor.

		int posMin = 0;
		float aux;
		for (int i = 0; i < temperaturas.length - 1; i++) {

			// Buscamos el mínimo entre la posición i y el final del array.
			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++) {
				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}
			}

			// Intercambiamos el mínimo con la primera posición del
			// array sin ordenar.
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;

			System.out.println(Arrays.toString(temperaturas));

		}

		System.out.println("\nTemperaturas ordenadas:");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(temperaturas[i] + "ºC ");
		}

		System.out.println("\n\nTemperatura mínima: " + temperaturas[0] + "ºC.");
		System.out.println("Temperatura máxima: " + temperaturas[temperaturas.length - 1] + "ºC.");

	}

}
