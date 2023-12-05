package cadenas;

import java.util.Scanner;

// Programa que lea una contraseña y valide si

// cumple con una longitud mínima de 6 y máxima de 12.

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime la contraseña:");
		String contraseña = entrada.nextLine();

		int longitud = contraseña.length();

		if (longitud >= 6 && longitud <= 12) {
			System.out.println("La contraseña es correcta, tiene " + longitud + " carácteres.");
		} else {
			System.out.println("Tu contraseña es incorrecta, tiene " + longitud + " carácteres."
					+ "\nLa contraseña tiene que tener entre 6 y 12 carácteres.");
		}

		entrada.close();

	}

}