package hoja2Bucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un carácter: ");
		String caracter = entrada.nextLine();

		System.out.println("Dime el número de veces que quieres "
				+ "que lo escriba: ");
		int num = entrada.nextInt();

		int contador = 1;

		while (contador <= num) {

			System.out.println(contador + " " + caracter);

			contador++;

		}
		
		

	}

}