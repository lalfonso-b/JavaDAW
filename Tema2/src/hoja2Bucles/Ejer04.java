package hoja2Bucles;

import java.util.Scanner;

/*
Escribe una aplicación que pregunte al usuario un número entre 1 y 5. 
Si responde "3", se le felicitará por haber acertado. Si no, se le 
seguirá pidiendo más números.
*/
public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Di un número entre 1 y 5:");
		int num = entrada.nextInt();

		while (num != 3) {

			System.out.println("Casi, di otro número entre 1 y 5:");
			num = entrada.nextInt();

		}

		System.out.println("Felicidades, has acertado.");

	}

}
