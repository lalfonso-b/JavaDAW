package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		System.out.println("Te llamas " + preguntarNombre() + ".");

	}

	static String preguntarNombre() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Tu nombre: ");
		String nombre = entrada.nextLine();

		return nombre;

	}

}
