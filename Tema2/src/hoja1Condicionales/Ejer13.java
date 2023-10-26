package hoja1Condicionales;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * Diseña un programa que pida una nota entera entre 0 y 10 y
 * 
 * la convierta a la calificación correspondiente:
 * 
 * (Insuficiente, Suficiente, Bien, Notable y Sobresaliente).
 *
 *
 * 
 * 
 * 
 * insuficiente (menos de 5)
 * 
 * suficiente (un 5)
 * 
 * bien (6)
 * 
 * notable (7 y 8)
 * 
 * y sobresaliente (9) o mas.
 * 
 * 
 * 
 * @author Santiago Moreno
 * 
 * @version 10/10/2023
 * 
 */

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la nota");
		float nota = entrada.nextFloat();

		if (nota >= 0 && nota < 5) {

			System.out.println("La nota es Insuficiente");

		} else if (nota >= 5 && nota < 6) {

			System.out.println("La nota es Suficiente");

		} else if (nota >= 6 && nota < 7) {

			System.out.println("La nota es Bien");

		} else if (nota >= 7 && nota < 9) {

			System.out.println("La nota es Notable");

		} else if (nota >= 9 && nota <= 10) {

			System.out.println("La nota es Sobresaliente");

		} else {

			System.out.println("Error el valor tiene que ser un número " + "del 0 al 10");

		}

		entrada.close();

	}

}