package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
* Desarrolla modularmente (usando tres métodos, además de main( )) un programa que solicite
* por consola una lista de números enteros, los ordene y los muestre en pantalla.
*/

public class Ejer15 {
	
	public static void main(String[] args) {

		int[] numeros = new int[5];

		preguntar(numeros);
		ordenar(numeros);
		
		System.out.println("Tus números, ordenados:");
		mostrar(numeros);
		
	}

	static void preguntar(int[] numeros) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime 5 numeros enteros:");
			numeros[i] = sc.nextInt();
		}

		sc.close();
	}

	static void ordenar(int[] numeros) {

		int posMin;
		int aux;

		for (int i = 0; i < numeros.length; i++) {
			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}
		
	}

	static void mostrar(int[] numeros) {

		System.out.println("\n" + Arrays.toString(numeros));
		
	}
}