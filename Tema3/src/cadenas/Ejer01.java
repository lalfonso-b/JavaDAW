package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una palabra: ");
		String palabra = entrada.nextLine();

		System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " letras.");

	}

}