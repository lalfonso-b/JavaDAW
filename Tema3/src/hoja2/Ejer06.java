package hoja2;

import java.util.Scanner;

/*
Escribe una aplicación que vaya preguntando los votos de seis partidos políticos en 
unas elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor 
número de votos y cuál el mayor, así como las posiciones del array que ocupan estos partidos.
*/
public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] votos = new int[6];

		// Leemos el número de votos que ha sacado cada partido.

		System.out.println("Introduzca el número de votos que ha sacado cada partido.\n");

		for (int i = 0; i < votos.length; i++) {
			System.out.print("Partido " + i + ": ");
			votos[i] = entrada.nextInt();
		}

		// Calculamos el mínimo y el máximo de votos.

		int posMin = 0; // Será la posición del mínimo del array.
		int posMax = 0; // Será la posición del máximo del array.

		// Recorremos el array buscando el mínimo y el máximo.
		for (int i = 0; i < votos.length; i++) {
			if (votos[i] < votos[posMin]) {
				posMin = i;
			} else if (votos[i] > votos[posMax]) {
				posMax = i;
			}
		}

		// Damos la información.
		System.out.println("\nEl partido peor clasificado ha sacado " + votos[posMin]
				+ " votos. Se encuentra en la posición " + posMin + ".");
		System.out.println("El partido mejor clasificado ha sacado " + votos[posMax]
				+ " votos. Se encuentra en la posición " + posMax + ".");

	}

}
