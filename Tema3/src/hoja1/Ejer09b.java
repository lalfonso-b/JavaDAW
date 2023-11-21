package hoja1;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una pregunta tipo test: ");
		String[] test = new String[5];

		for (int i = 0; i < test.length; i++) {
			System.out.println("Crea un tipo test.");
			test[i] = entrada.nextLine();
		}
		
		char letra = 'a';
		System.out.println(test[0]);
		for (int i = 1; i < test.length; i++) {
			System.out.println(letra + ") " + test[i]);
			letra++;
		}
		
		entrada.close();
	}

}